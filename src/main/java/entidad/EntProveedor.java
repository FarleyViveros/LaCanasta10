/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidad;

/**
 *
 * @author USUARIO
 */
public class EntProveedor {
    private int id;
    private String nombre;
    private String ruc;
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
    
    public String getruc() {
        return ruc;
    }

    public void setruc(String ruc) {
        this.ruc = ruc;
    }
    
    public int getestado() {
        return estado;
    }

    public void setestado(int estado) {
        this.estado = estado;
    }

   

    public EntProveedor()
    {
    
    }
    
    public EntProveedor( int id,
     String nombre,
     String ruc,
     int estado) {
        this.id = id;
        this.nombre = nombre;
        this.ruc = ruc;
        this.estado = estado;
    }
    @Override    
    public String toString() {    
        // TODO Auto-generated method stub    
        return "{\"id\" :\""+ id + "\", \"nombre\" : \"" + nombre + "\", \"ruc\" : \"" + ruc + "\", \"estado\" : \"" + estado + "\"}";    
    }  
}
