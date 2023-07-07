/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidad;

/**
 *
 * @author Usuario
 */
public class EntEmpleados {

    private int id;
    private String nombre;
    private String apellidos;
    private String direccion;
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

    public String getapellidos() {
        return apellidos;
    }

    public void setapellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getdireccion() {
        return direccion;
    }

    public void setdireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getestado() {
        return estado;
    }

    public void setestado(int estado) {
        this.estado = estado;
    }

    public EntEmpleados() {

    }

    public EntEmpleados(int id,
            String nombre, String apellidos, String direccion,
            int estado) {
        this.id = id;
        this.nombre = nombre;
        this.apellidos = nombre;
        this.direccion = direccion;
        this.estado = estado;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub    
        return "{\"id\" :\"" + id + "\", \"nombre\" : \"" + nombre + "\", \"apellidos\" : \"" + apellidos + "\",\"direccion\" : \"" + direccion + "\", \"estado\" : \"" + estado + "\"}";
    }
}
