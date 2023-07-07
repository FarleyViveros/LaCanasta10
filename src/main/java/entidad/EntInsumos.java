/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidad;

/**
 *
 * @author Usuario
 */
public class EntInsumos {
    private int id;
    private String nombre;
    private float precio;
    private String unidad;
    private int cantidad;
    private int estado;
        
    public int getid() {
        return id;
    }

    public void setid(int id) {
        this.id = id;
    }

    public String getnombre() {
        return nombre;
    }

    public void setnombre(String nombre) {
        this.nombre = nombre;
    }

    public float getprecio() {
        return precio;
    }

    public void setprecio(float precio) {
        this.precio = precio;
    }
    
    public String getunidad() {
        return unidad;
    }

    public void setunidad(String unidad) {
        this.unidad = unidad;
    }
    
    public int getcantidad() {
        return cantidad;
    }
    public void setcantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    
    public int getestado() {
        return estado;
    }
    public void setestado(int estado) {
        this.estado = estado;
    }
    
    public EntInsumos()
    {
    
    }
    
    public EntInsumos( int id,String nombre,float precio,String unidad,int cantidad,int estado) {
        this.id = id;
        this.nombre = nombre;
        this.precio = precio;
        this.unidad = unidad;
        this.cantidad = cantidad;
        this.estado = estado;
         
    }
    @Override    
    public String toString() {    
        // TODO Auto-generated method stub    
        return "{\"id\" :\""+ id + "\", \"nombre\" : \"" + nombre + "\", \"precio\" : \"" + precio + "\", \"unidad\" : \"" + unidad + "\", \"cantidad\" : \"" + cantidad + "\", \"estado\" : \"" + estado + "\"}";    
    } 
}
