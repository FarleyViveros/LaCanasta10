/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidad;

/**
 *
 * @author USUARIO
 */
public class EntMesas {
    private int id;
    private String nombre;
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

   

    public EntMesas()
    {
    
    }
    
    public EntMesas( int id,
     String nombre,
     int estado) {
        this.id = id;
        this.nombre = nombre;
        this.estado = estado;
    }
    @Override    
    public String toString() {    
        // TODO Auto-generated method stub    
        return "{\"id\" :\""+ id + "\", \"nombre\" : \"" + nombre + "\", \"estado\" : \"" + estado + "\"}";    
    }  
}
