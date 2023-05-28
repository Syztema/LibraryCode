package controllers;

import java.sql.*;
import java.time.LocalDate;
import java.util.ArrayList;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JSpinner;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import models.ClienteModel;
import models.LibroModel;
import models.VentaModel;

public class VentaController {

    Conexion cx = new Conexion("libreria");

    public void rellenar(JComboBox comboBox){
        
        Connection connection = cx.conectar();
        
        try(connection){
            
            String query = "SELECT nombre FROM libro";
            Statement stmt = connection.createStatement();
            ResultSet result = stmt.executeQuery(query);
            
            while(result.next()){
                String item = result.getString("nombre");
                comboBox.addItem(item);
            }
            
            result.close();
            stmt.close();
            
        }catch(Exception e){
            System.out.println("Error en el Llenado: " + e.getMessage());
        }
                
    }
    
    public VentaModel calcularPrecio(JLabel label, String nombre, LibroModel libro, LibroController libroController, JSpinner cantidadLibros, ClienteModel cliente){               
        /*MEMBRESIAS
            VIP = 30%
            Frecuente = 15%
            General = 5%
        */                
        libro = libroController.findByNombre(nombre);   
        if(libro != null){
            float descuento = 0;
            float precio = libro.getPrecio() * (Integer) cantidadLibros.getValue(); 
            if(cliente != null){
                String membresia = cliente.getMembresia();
                switch(membresia){
                    case "VIP":
                        descuento = (float) (precio*0.3);
                        precio = precio - descuento;
                        break;
                    case "Frecuente":
                        descuento = (float) (precio*0.15);
                        precio = precio - descuento;
                        break;
                    case "General":
                        descuento = (float) (precio*0.05);
                        precio = precio - descuento;
                        break;
                }
                VentaModel venta = new VentaModel(cliente.getCedula(), cliente.getNombre(), cliente.getMembresia(), nombre, (Integer) cantidadLibros.getValue(), descuento, precio);
                label.setText("$" + Float.toString(precio));
                return venta;
            }else{
                VentaModel venta = new VentaModel("null", "Default", "Default", nombre, (Integer) cantidadLibros.getValue(), descuento, precio);
                label.setText("$" + Float.toString(precio));
                return venta;
            }               
        }        
        return null;
    }        
    
    public void actualizarTabla(JTable ventaTbl, ArrayList<VentaModel> listaVentas, JLabel subtotalLbl, JLabel ivaLbl, JLabel totalLbl){
        float subtotal = 0; 
        DefaultTableModel tabla = (DefaultTableModel) ventaTbl.getModel(); 
        tabla.setRowCount(0);
        listaVentas.forEach((u) -> tabla.addRow(new Object[] { u.getNombreLibro(), u.getCantidadLibro(), u.getDescuentoTotal(), u.getPrecioTotal()}));                        
        //
        for(VentaModel v : listaVentas){
            subtotal += v.getPrecioTotal();
        }
        float iva = (float) (subtotal * 0.19);
        float total = subtotal + iva;        
        
        if(subtotal != 0){
            subtotalLbl.setText("$" + subtotal);
            ivaLbl.setText("$" + iva);
            totalLbl.setText("$" + total);
        }
    }
    
    public boolean buscarVenta(VentaModel venta, ArrayList<VentaModel> listaVentas){
        for(VentaModel v : listaVentas){
           if(v.getNombreLibro() == venta.getNombreLibro()){
               int nuevaCantidad = v.getCantidadLibro() + venta.getCantidadLibro();
               v.setCantidadLibro(nuevaCantidad);
               v.setPrecioTotal(v.getPrecioTotal() + venta.getPrecioTotal());
               return true;
           }
        }
        return false;
    }
    
    public void updateCantidad(LibroModel libro, JComboBox librosVentasCbx, VentaModel venta, LibroController libroController){
        
        libro = libroController.findByNombre(librosVentasCbx.getSelectedItem().toString());        
        int cantidadActual = libro.getCantidad();
        cantidadActual = cantidadActual - venta.getCantidadLibro();
        libro.setCantidad(cantidadActual);
        libroController.update(libro);        
    }            
    
    public void crearCSV(CSVWriterThread csvWriterThread, ArrayList<VentaModel> listaVentas){
        LocalDate todaysDate = LocalDate.now();
        String path = "src/csv/" + todaysDate + ".csv";
        csvWriterThread = new CSVWriterThread(listaVentas, path);
        csvWriterThread.start();        
        try{
            csvWriterThread.join();
            System.out.println("Archivo CSV creado exitosamente");
        }catch(InterruptedException e){
            e.printStackTrace();
        }
    }
        
}
