package models;

public class EmpleadoModel extends PersonaModel{
    
    private String cargo;
    private String contraseña;
    
    //CONSTRUCTOR
    public EmpleadoModel(int id, String cedula, String nombre, String cargo, String correo, String celular, String contraseña) {    
        super(id, cedula, nombre, correo, celular);
        this.cargo = cargo;
        this.contraseña = contraseña;
    }
    
    public EmpleadoModel(String cedula, String nombre, String cargo, String correo, String celular, String contraseña) {    
        super(cedula, nombre, correo, celular);
        this.cargo = cargo;
        this.contraseña = contraseña;
    }
    
    //GETTERS AND SETTERS
    public String getCargo() {
        return cargo;
    }
    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
    public String getContraseña() {
        return contraseña;
    }
    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }
    
}
