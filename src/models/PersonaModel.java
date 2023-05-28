package models;

public class PersonaModel {
    private int id;
    private String cedula;
    private String nombre;
    private String correo;
    private String celular;
    
    //CONSTRUCTOR
    public PersonaModel(int id, String cedula, String nombre, String correo, String celular) {
        this.id = id;
        this.cedula = cedula;
        this.nombre = nombre;
        this.correo = correo;
        this.celular = celular;
    }
    
<<<<<<< HEAD
    public PersonaModel(String cedula, String nombre, String correo, String celular) {        
        this.cedula = cedula;
        this.nombre = nombre;
        this.correo = correo;
        this.celular = celular;
    }
    
=======
>>>>>>> master
    //GETTERS AND SETTERS
    public int getId() {
        return id;
    }   
    public String getCedula() {
        return cedula;
    }
    public void setCedula(String cedula) {
        this.cedula = cedula;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getCorreo() {
        return correo;
    }
    public void setCorreo(String correo) {
        this.correo = correo;
    }
    public String getCelular() {
        return celular;
    }
    public void setCelular(String celular) {
        this.celular = celular;
    }          
<<<<<<< HEAD

    
    //PARA MOSTRAR EL ARRAYLIST
    public Object getCargo() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    public Object getContraseña() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    public Object getMembresia() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }


=======
>>>>>>> master
}
