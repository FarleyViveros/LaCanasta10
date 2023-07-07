/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidad;

import java.sql.Date;

/**
 *
 * @author Usuario
 */
public class EntSolicitudDetalle {
    private int id;
    private int solicitud_id;
    private int insumo_id;
    private int cantidad;
    private String unidad;
    private float precio;
    private int estado;
    
    public int getid() {
        return id;
    }

    public void setid(int id) {
        this.id = id;
    }

    public int getsolicitud_id() {
        return solicitud_id;
    }

    public void setsolicitud_id(int solicitud_id) {
        this.solicitud_id = solicitud_id;
    }

    public int getinsumo_id() {
        return insumo_id;
    }

    public void setinsumo_id(int insumo_id) {
        this.insumo_id = insumo_id;
    }
    
    public int getcantidad() {
        return cantidad;
    }

    public void setcantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    
    public String getunidad() {
        return unidad;
    }

    public void setunidad(String unidad) {
        this.unidad = unidad;
    }
    
    public float getprecio() {
        return precio;
    }

    public void setprecio(float precio) {
        this.precio = precio;
    }
    
    public int getestado() {
        return estado;
    }

    public void setestado(int estado) {
        this.estado = estado;
    }

    public EntSolicitudDetalle()
    {
    
    }
    
    public EntSolicitudDetalle( int id,
     int solicitud_id,int insumo_id, int cantidad,String unidad,float precio,
     int estado) {
        this.id = id;
        this.solicitud_id = solicitud_id;
        this.insumo_id = insumo_id;
        this.cantidad = cantidad;
        this.unidad = unidad;
        this.precio = precio;
        this.estado = estado;
    }
    @Override    
    public String toString() {    
        // TODO Auto-generated method stub    
        return "{\"id\" :\""+ id + "\", \"solicitud_id\" : \"" + solicitud_id + "\",\"insumo_id\" : \"" + insumo_id + "\",\"cantidad\" : \"" + cantidad + "\",\"unidad\" : \"" + unidad + "\",\"precio\" : \"" + precio + "\", \"estado\" : \"" + estado + "\"}";    
    }  
}
