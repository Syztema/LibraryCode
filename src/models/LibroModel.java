package models;

public class LibroModel {
    
    private int id;
    private String codigo;
    private String nombre;
    private int cantidad;
    private String autor;
    private String editorial;
    private int precio;
    
    //CONSTRUCTOR
    public LibroModel(int id, String codigo, String nombre, int cantidad, String autor, String editorial, int precio) {
        this.id = id;
        this.codigo = codigo;
        this.nombre = nombre;
        this.cantidad = cantidad;
        this.autor = autor;
        this.editorial = editorial;
        this.precio = precio;
    }
    
    public LibroModel(String codigo, String nombre, int cantidad, String autor, String editorial, int precio) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.cantidad = cantidad;
        this.autor = autor;
        this.editorial = editorial;
        this.precio = precio;
    }

    public LibroModel() {
    }
    
    
    
    //GETTERS AND SETTERS
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getCodigo() {
        return codigo;
    }
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public int getCantidad() {
        return cantidad;
    }
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    public String getAutor() {
        return autor;
    }
    public void setAutor(String autor) {
        this.autor = autor;
    }
    public String getEditorial() {
        return editorial;
    }
    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }
    public int getPrecio() {
        return precio;
    }
    public void setPrecio(int precio) {
        this.precio = precio;
    }        
    
}
