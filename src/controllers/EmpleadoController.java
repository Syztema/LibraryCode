package controllers;

import java.sql.*;
import java.util.ArrayList;
import models.EmpleadoModel;
import models.PersonaModel;
import controllers.Conexion;

public class EmpleadoController implements FuncionesController{                        
        
    Conexion cx = new Conexion("libreria");    
    
    @Override
    public PersonaModel findByCedula(String cedula) {
        PersonaModel empleado = null;                       
        Connection connection = cx.conectar();
        
        try(connection){
            
            String query = "SELECT * FROM `empleado` WHERE cedula = ?";
                    
            PreparedStatement stmt = connection.prepareStatement(query);
            stmt.setString(1,   cedula);
            ResultSet result = stmt.executeQuery();
            
            while(result.next()){
                int id = result.getInt(1);
                String cedulaEmpl = result.getString(2);        
                String nombre = result.getString(3);
                String cargo = result.getString(4);
                String correo = result.getString(5);
                String celular = result.getString(6);
                String contraseña = result.getString(7);
                
                empleado = new EmpleadoModel(id, cedulaEmpl, nombre, cargo, correo, celular, contraseña);
                return empleado;
            }
            stmt.close();
            result.close();
        }catch(Exception e){
            System.out.println("Error en validacion: " + e.getMessage());
            return null;
        }           
        return empleado;
    }
    
    @Override
    public boolean create(PersonaModel model) {
        Connection connection = cx.conectar();
        
        try(connection){
            String query = "INSERT INTO `empleado` (cedula, nombre, cargo, correo, celular, contraseña)"
                         + "VALUES (?,?,?,?,?,?)";
            
            EmpleadoModel empleado = (EmpleadoModel) model;
            
            PreparedStatement stmt = connection.prepareStatement(query);
            stmt.setString(1, empleado.getCedula());
            stmt.setString(2, empleado.getNombre());
            stmt.setString(3, empleado.getCargo());
            stmt.setString(4, empleado.getCorreo());
            stmt.setString(5, empleado.getCelular());
            stmt.setString(6, empleado.getContraseña());
            
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
            String query = "UPDATE `empleado` SET cedula=?, nombre=?, cargo=?, correo=?, celular=?, contraseña=? WHERE id = ?";
            
            EmpleadoModel empleado = (EmpleadoModel) model;
            
            PreparedStatement stmt = connection.prepareStatement(query);
            stmt.setString(1, empleado.getCedula());
            stmt.setString(2, empleado.getNombre());
            stmt.setString(3, empleado.getCargo());
            stmt.setString(4, empleado.getCorreo());
            stmt.setString(5, empleado.getCelular());
            stmt.setString(6, empleado.getContraseña());
            stmt.setInt(7, empleado.getId());
            
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
        EmpleadoModel empleado = (EmpleadoModel) findByCedula(cedula);
        
        if(empleado != null){
            Connection connection = cx.conectar();
            
            try(connection){
                
                String query = "DELETE FROM  `empleado` WHERE cedula=?";
                
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
        EmpleadoModel empleado = null;
        Connection connection = cx.conectar();
        
        try(connection){
            
            String query = "SELECT * FROM empleado";
            
            Statement stmt = connection.createStatement();
            ResultSet result = stmt.executeQuery(query);
            
            while(result.next()){
                int id = result.getInt(1);
                String cedulaEmpl = result.getString(2);        
                String nombre = result.getString(3);
                String cargo = result.getString(4);
                String correo = result.getString(5);
                String celular = result.getString(6);
                String contraseña = result.getString(7);
                
                empleado = new EmpleadoModel(id, cedulaEmpl, nombre, cargo, correo, celular, contraseña);
                lista.add(empleado);
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
