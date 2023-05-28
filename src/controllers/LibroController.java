package controllers;

import java.sql.*;
import java.util.ArrayList;
import models.LibroModel;

public class LibroController {
    Conexion cx = new Conexion("libreria");
    
    public LibroModel findByCodigo(String codigo){
        LibroModel libro = null;
        Connection connection = cx.conectar();
        
        try(connection){
            
            String query = "SELECT * FROM `libro` WHERE codigo = ?";
            
            PreparedStatement stmt = connection.prepareStatement(query);
            stmt.setString(1, codigo);
            ResultSet result = stmt.executeQuery();
            
            while(result.next()){
                int id = result.getInt(1);
                String codigoCli = result.getString(2);
                String nombre = result.getString(3);
                int cantidad = result.getInt(4);
                String autor = result.getString(5);
                String editorial = result.getString(6);
                int precio = result.getInt(7);
                                
                libro = new LibroModel(id, codigoCli, nombre, cantidad, autor, editorial, precio);
                return libro;
            }
            stmt.close();
            result.close();
        }catch(Exception e){
            System.out.println("Error en validacion: " + e.getMessage());
            return null;
        }
        return libro;
    }
    
    public LibroModel findByNombre(String nombre){
        LibroModel libro = null;
        Connection connection = cx.conectar();
        
        try(connection){
            
            String query = "SELECT * FROM `libro` WHERE nombre = ?";
            
            PreparedStatement stmt = connection.prepareStatement(query);
            stmt.setString(1, nombre);
            ResultSet result = stmt.executeQuery();
            
            while(result.next()){
                int id = result.getInt(1);
                String codigo = result.getString(2);
                String nombreCli = result.getString(3);
                int cantidad = result.getInt(4);
                String autor = result.getString(5);
                String editorial = result.getString(6);
                int precio = result.getInt(7);
                                
                libro = new LibroModel(id, codigo, nombreCli, cantidad, autor, editorial, precio);
                return libro;
            }
            stmt.close();
            result.close();
        }catch(Exception e){
            System.out.println("Error en nombre: " + e.getMessage());
            return null;
        }
        return libro;
    }
    
    public boolean create(LibroModel libro){
        Connection connection = cx.conectar();
        
        try(connection){
            String query = "INSERT INTO `libro` (codigo, nombre, cantidad, autor, editorial, precio)"
                         + "VALUES (?,?,?,?,?,?)";                        
            
            PreparedStatement stmt = connection.prepareStatement(query);
            stmt.setString(1, libro.getCodigo());
            stmt.setString(2, libro.getNombre());
            stmt.setInt(3, libro.getCantidad());            
            stmt.setString(4, libro.getAutor());
            stmt.setString(5, libro.getEditorial());
            stmt.setInt(6, libro.getPrecio());
            
            stmt.executeUpdate();
            stmt.close();

            return true;
        } catch(Exception e){
            System.out.println("Error de creacion: " + e.getMessage());
            return false;
        }
    }
    
    public boolean update(LibroModel libro) {
        Connection connection = cx.conectar();
        
        try(connection){
            String query = "UPDATE `libro` SET nombre=?, cantidad=?, autor=?, editorial=?, precio=? WHERE codigo = ?";
                        
            
            PreparedStatement stmt = connection.prepareStatement(query);                        
            stmt.setString(1, libro.getNombre());
            stmt.setInt(2, libro.getCantidad());            
            stmt.setString(3, libro.getAutor());
            stmt.setString(4, libro.getEditorial());
            stmt.setInt(5, libro.getPrecio());
            stmt.setString(6, libro.getCodigo());                                
            
            stmt.executeUpdate();
            stmt.close();

            return true;
        } catch(Exception e){
            System.out.println("Error de actualizacion: " + e.getMessage());
            return false;
        }
    } 
    
    public boolean deleteByCodigo(String codigo) {
        LibroModel libro = findByCodigo(codigo);
        
        if(libro != null){
            Connection connection = cx.conectar();
            
            try(connection){
                
                String query = "DELETE FROM  `libro` WHERE codigo=?";
                
                PreparedStatement stmt = connection.prepareStatement(query);
                stmt.setString(1, codigo);
                
                stmt.executeUpdate();
                stmt.close();
                
                return true;
            }catch(Exception e){
                System.out.println("Error de eliminacion: " + e.getMessage());
                return false;
            }
        }else{
            return false;
        }        
    } 
    
    public ArrayList<LibroModel> findAll() {
        
        ArrayList<LibroModel> lista = new ArrayList<>();        
        LibroModel libro = null;
        Connection connection = cx.conectar();
        
        try(connection){
            
            String query = "SELECT * FROM libro";
            
            Statement stmt = connection.createStatement();
            ResultSet result = stmt.executeQuery(query);
            
            while(result.next()){
                int id = result.getInt(1);
                String codigoCli = result.getString(2);
                String nombre = result.getString(3);
                int cantidad = result.getInt(4);
                String autor = result.getString(5);
                String editorial = result.getString(6);
                int precio = result.getInt(7);
                
                libro = new LibroModel(id, codigoCli, nombre, cantidad, autor, editorial, precio);
                lista.add(libro);
            }
            
            stmt.close();
            result.close();
            
            return lista;            
        }catch(Exception e){
            System.out.println("Error de Data: " + e.getMessage());
            return null;
        }                            
    }
    
}
