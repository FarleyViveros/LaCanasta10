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
public class EntSolicitud {
    private int id;
    private int proveedor_id;
    private int usuarioAprobo_id;
    private int usuarioRegistro_id;
    private Date fecha_registro;
    private String fecha_registroString;
    private Date fecha_aprobacion;
    private String fecha_aprobacionString;
    private int cantidad;
    private float total;
    private int estado;
    
    public int getid() {
        return id;
    }

    public void setid(int id) {
        this.id = id;
    }

    public int getproveedor_id() {
        return proveedor_id;
    }

    public void setproveedor_id(int proveedor_id) {
        this.proveedor_id = proveedor_id;
    }

    public int getusuarioAprobo_id() {
        return usuarioAprobo_id;
    }

    public void setusuarioAprobo_id(int usuarioAprobo_id) {
        this.usuarioAprobo_id = usuarioAprobo_id;
    }
    
    public int getusuarioRegistro_id() {
        return usuarioRegistro_id;
    }

    public void setusuarioRegistro_id(int usuarioRegistro_id) {
        this.usuarioRegistro_id = usuarioRegistro_id;
    }
    
    public Date getfecha_registro() {
        return fecha_registro;
    }

    public void setfecha_registro(Date fecha_registro) {
        this.fecha_registro = fecha_registro;
    }
    
    public String getfecha_registroString() {
        return fecha_registroString;
    }

    public void setfecha_registroString(String fecha_registroString) {
        this.fecha_registroString = fecha_registroString;
    }
    
     public Date getfecha_aprobacion() {
        return fecha_aprobacion;
    }

    public void setfecha_aprobacion(Date fecha_aprobacion) {
        this.fecha_aprobacion = fecha_aprobacion;
    }
    
    public String getfecha_aprobacionString() {
        return fecha_aprobacionString;
    }

    public void setfecha_aprobacionString(String fecha_aprobacionString) {
        this.fecha_aprobacionString = fecha_aprobacionString;
    }
    
    public int getcantidad() {
        return cantidad;
    }

    public void setcantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    
    public float gettotal() {
        return total;
    }

    public void settotal(float total) {
        this.total = total;
    }
    
    public int getestado() {
        return estado;
    }

    public void setestado(int estado) {
        this.estado = estado;
    }

   

    public EntSolicitud()
    {
    
    }
    
    public EntSolicitud( int id,
     int proveedor_id,int usuarioAprobo_id, int usuarioRegistro_id,Date fecha_registro,String fecha_registroString,Date fecha_aprobacion,String fecha_aprobacionString,
     int cantidad,float total,int estado) {
        this.id = id;
        this.proveedor_id = proveedor_id;
        this.usuarioAprobo_id = usuarioAprobo_id;
        this.usuarioRegistro_id = usuarioRegistro_id;
        this.fecha_registro = fecha_registro;
        this.fecha_registroString=fecha_registroString;
        this.fecha_aprobacion = fecha_aprobacion;
        this.fecha_aprobacionString = fecha_aprobacionString;
        this.cantidad = cantidad;
        this.total = total;
        this.estado = estado;
    }
    @Override    
    public String toString() {    
        // TODO Auto-generated method stub    
        return "{\"id\" :\""+ id + "\", \"proveedor_id\" : \"" + proveedor_id + "\",\"usuarioAprobo_id\" : \"" + usuarioAprobo_id + "\",\"usuarioRegistro_id\" : \"" + usuarioRegistro_id + "\",\"fecha_registro\" : \"" + fecha_registro + "\", \"fecha_aprobacion\" : \"" + fecha_aprobacion + "\",\"fecha_aprobacionString\" : \"" + fecha_aprobacionString + "\",\"cantidad\" : \"" + cantidad + "\",\"total\" : \"" + total + "\",\"estado\" : \"" + estado + "\"}";    
    }  
}
