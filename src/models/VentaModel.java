package models;

import java.util.ArrayList;

public class VentaModel {
    
    private String cedulaCliente;
    private String nombreCliente;
    private String membresiaCliente;
    private String nombreLibro;    
    private int cantidadLibro;
    private float descuentoTotal;
    private float precioTotal;    
    
    //CONSTRUCTOR    

    public VentaModel(String cedulaCliente, String nombreCliente, String membresiaCliente, String nombreLibro, int cantidadLibro, float descuentoTotal, float precioTotal) {
        this.cedulaCliente = cedulaCliente;
        this.nombreCliente = nombreCliente;
        this.membresiaCliente = membresiaCliente;
        this.nombreLibro = nombreLibro;
        this.cantidadLibro = cantidadLibro;        
        this.descuentoTotal = descuentoTotal;
        this.precioTotal = precioTotal;
    }

    public VentaModel() {
    }
    
    
    
    //GETTERS AND SETTERS
    public String getCedulaCliente() {
        return cedulaCliente;
    }
    public void setCedulaCliente(String cedulaCliente) {
        this.cedulaCliente = cedulaCliente;
    }
    public String getNombreCliente() {
        return nombreCliente;
    }
    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }
    public String getMembresiaCliente() {
        return membresiaCliente;
    }
    public void setMembresiaCliente(String membresiaCliente) {
        this.membresiaCliente = membresiaCliente;
    }
    public String getNombreLibro() {
        return nombreLibro;
    }
    public void setNombreLibro(String nombreLibro) {
        this.nombreLibro = nombreLibro;
    }
    public int getCantidadLibro() {
        return cantidadLibro;
    }
    public void setCantidadLibro(int cantidadLibro) {
        this.cantidadLibro = cantidadLibro;
    }       
    public float getDescuentoTotal() {
        return descuentoTotal;
    }
    public void setDescuentoTotal(float descuentoTotal) {
        this.descuentoTotal = descuentoTotal;
    }
    public float getPrecioTotal() {
        return precioTotal;
    }
    public void setPrecioTotal(float precioTotal) {
        this.precioTotal = precioTotal;
    }         

    @Override
    public String toString() {
        return "VentaModel{" + "cedulaCliente=" + cedulaCliente + ", nombreCliente=" + nombreCliente + ", membresiaCliente=" + membresiaCliente + ", nombreLibro=" + nombreLibro + ", cantidadLibro=" + cantidadLibro + ", descuentoTotal=" + descuentoTotal + ", precioTotal=" + precioTotal + '}';
    }    
    
}
