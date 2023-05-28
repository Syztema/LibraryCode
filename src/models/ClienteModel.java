package models;

public class ClienteModel extends PersonaModel{
    
    private String membresia;

    //CONSTRUCTOR
    public ClienteModel(int id, String cedula, String nombre, String membresia, String correo, String celular) {    
        super(id, cedula, nombre, correo, celular);
        this.membresia = membresia;
    }
    
    public ClienteModel(String cedula, String nombre, String membresia, String correo, String celular) {    
        super(cedula, nombre, correo, celular);
        this.membresia = membresia;
    }
    
    
    //GETTERS AND SETTERS
    public String getMembresia() {
        return membresia;
    }
    public void setMembresia(String membresia) {
        this.membresia = membresia;
    }
    
}
