package controllers;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import models.ClienteModel;
import models.PersonaModel;

public class ClienteController implements FuncionesController{

    Conexion cx = new Conexion("libreria");    
    
    @Override
    public PersonaModel findByCedula(String cedula) {
        PersonaModel cliente = null;                       
        Connection connection = cx.conectar();
        
        try(connection){
            
            String query = "SELECT * FROM `cliente` WHERE cedula = ?";
                    
            PreparedStatement stmt = connection.prepareStatement(query);
            stmt.setString(1,   cedula);
            ResultSet result = stmt.executeQuery();
            
            while(result.next()){
                int id = result.getInt(1);
                String cedulaCli = result.getString(2);        
                String nombre = result.getString(3);
                String membresia = result.getString(4);
                String correo = result.getString(5);
                String celular = result.getString(6);                
                
                cliente = new ClienteModel(id, cedulaCli, nombre, membresia, correo, celular);
                return cliente;
            }
            stmt.close();
            result.close();
        }catch(Exception e){
            System.out.println("Error en validacion: " + e.getMessage());
            return null;
        }           
        return cliente;
    }
    
    @Override
    public boolean create(PersonaModel model) {
        Connection connection = cx.conectar();
        
        try(connection){
            String query = "INSERT INTO `cliente` (cedula, nombre, membresia, correo, celular)"
                         + "VALUES (?,?,?,?,?)";
            
            ClienteModel cliente = (ClienteModel) model;
            
            PreparedStatement stmt = connection.prepareStatement(query);
            stmt.setString(1, cliente.getCedula());
            stmt.setString(2, cliente.getNombre());
            stmt.setString(3, cliente.getMembresia());
            stmt.setString(4, cliente.getCorreo());
            stmt.setString(5, cliente.getCelular());            
            
            stmt.executeUpdate();
            stmt.close();

            return true;
        } catch(Exception e){
            System.out.println("Error de creacion: " + e.getMessage());
            return false;
        }                
    }
    
    @Override
    public boolean update(PersonaModel model) {
        Connection connection = cx.conectar();
        
        try(connection){
            String query = "UPDATE `cliente` SET nombre=?, membresia=?, correo=?, celular=? WHERE cedula = ?";
            
            ClienteModel cliente = (ClienteModel) model;
            
            PreparedStatement stmt = connection.prepareStatement(query);                                    
            stmt.setString(1, cliente.getNombre());
            stmt.setString(2, cliente.getMembresia());
            stmt.setString(3, cliente.getCorreo());
            stmt.setString(4, cliente.getCelular());     
            stmt.setString(5, cliente.getCedula());
            
            
            stmt.executeUpdate();
            stmt.close();

            return true;
        } catch(Exception e){
            System.out.println("Error de actualizacion: " + e.getMessage());
            return false;
        }
    }    

    @Override
    public boolean deleteByCedula(String cedula) {
        ClienteModel cliente = (ClienteModel) findByCedula(cedula);
        
        if(cliente != null){
            Connection connection = cx.conectar();
            
            try(connection){
                
                String query = "DELETE FROM  `cliente` WHERE cedula=?";
                
                PreparedStatement stmt = connection.prepareStatement(query);
                stmt.setString(1, cedula);
                
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

    @Override
    public ArrayList<PersonaModel> findAll() {
        
        ArrayList<PersonaModel> lista = new ArrayList<>();
        ClienteModel cliente = null;
        Connection connection = cx.conectar();
        
        try(connection){
            
            String query = "SELECT * FROM cliente";
            
            Statement stmt = connection.createStatement();
            ResultSet result = stmt.executeQuery(query);
            
            while(result.next()){                
                int id = result.getInt(1);
                String cedulaCli = result.getString(2);        
                String nombre = result.getString(3);
                String membresia = result.getString(4);
                String correo = result.getString(5);
                String celular = result.getString(6);                
                
                cliente = new ClienteModel(id, cedulaCli, nombre, membresia, correo, celular);                
                lista.add(cliente);
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
