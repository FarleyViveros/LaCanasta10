/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidad;

/**
 *
 * @author USUARIO
 */
public class EntUsuario {
    private int id;
    private String nombre;
    private String correo;
    private String clave;
     private int empleado_id;
    private int tipo;
    private int estado;


    public int getid() {
        return id;
    }

    public void setid(int id) {
        this.id = id;
    }

    public int getempleado_id() {
        return empleado_id;
    }

    public void setempleado_id(int empleado_id) {
        this.empleado_id = empleado_id;
    }

    public String getnombre() {
        return nombre;
    }

    public void setnombre(String nombre) {
        this.nombre = nombre;
    }

    public String getcorreo() {
        return correo;
    }

    public void setcorreo(String correo) {
        this.correo = correo;
    }

    public String getclave() {
        return clave;
    }

    public void setclave(String clave) {
        this.clave = clave;
    }

    public int gettipo() {
        return tipo;
    }

    public void settipo(int tipo) {
        this.tipo = tipo;
    }

    public int getestado() {
        return estado;
    }

    public void setestado(int estado) {
        this.estado = estado;
    }

   

    public EntUsuario()
    {
    
    }
    
    public EntUsuario( int id,int empleado_id,
     String nombre,
     String correo,
     String clave,
     int tipo,
     int estado) {
        this.id = id;
        this.empleado_id = empleado_id;
        this.nombre = nombre;
        this.correo = correo;
        this.clave = clave;
        this.tipo = tipo;
        this.estado = estado;
    }
    @Override    
    public String toString() {    
        // TODO Auto-generated method stub    
        return "{\"id\" :\""+ id + "\", \"empleado_id\" : \"" + empleado_id + "\",\"nombre\" : \"" + nombre + "\", \"correo\" : \"" + correo + "\", \"clave\" : \"" + clave + "\", \"tipo\" : \"" + tipo + "\", \"estado\" : \"" + estado + "\"}";    
    }  
}
