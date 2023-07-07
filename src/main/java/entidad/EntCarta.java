/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidad;

/**
 *
 * @author Usuario
 */
public class EntCarta {
    private int id;
    private String nombre;
    private float precio;
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

    
    public int getestado() {
        return estado;
    }

    public void setestado(int estado) {
        this.estado = estado;
    }

   public float getprecio() {
        return precio;
    }

    public void setprecio(float precio) {
        this.precio = precio;
    }

    public EntCarta()
    {
    
    }
    
    public EntCarta( int id,
     String nombre,
     int estado,float precio) {
        this.id = id;
        this.nombre = nombre;
        this.estado = estado;
         this.precio = precio;
    }
    
        @Override    
    public String toString() {    
        // TODO Auto-generated method stub    
        return "{\"id\" :\""+ id + "\", \"nombre\" : \"" + nombre + "\", \"precio\" : \"" + precio + "\", \"estado\" : \"" + estado + "\"}";    
    }  

}
