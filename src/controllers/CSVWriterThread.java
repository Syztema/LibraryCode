package controllers;

import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import models.VentaModel;


public class CSVWriterThread extends Thread{
    
    private ArrayList<VentaModel> ventasLista;
    private String filepath;

    public CSVWriterThread(ArrayList<VentaModel> ventasLista, String filepath) {
        this.ventasLista = ventasLista;
        this.filepath = filepath;
    }

    public CSVWriterThread() {
    }
    
    
    
    @Override
    public void run(){        
        boolean writeHeaders = !Files.exists(Path.of(filepath));
        try(FileWriter writer = new FileWriter(filepath, true)){
            
            if(writeHeaders){
                //Escribir el encabezado del CSV
                writer.append("Cedula;Nombre Cliente;Membresia;Nombre Libro;Cantidad;Descuento;Total\n");
            }            
            
            //ESCRIBIR LOS DATOS DE LA VENTA
            for(VentaModel venta : ventasLista){
                writer.append(venta.getCedulaCliente()).append(";")
                            .append(venta.getNombreCliente()).append(";")
                            .append(venta.getMembresiaCliente()).append(";")
                            .append(venta.getNombreLibro()).append(";")
                            .append(String.valueOf(venta.getCantidadLibro())).append(";")
                            .append(String.valueOf(venta.getDescuentoTotal())).append(";")
                            .append(String.valueOf(venta.getPrecioTotal()))
                            .append("\n");
            }
            
            writer.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
}
