/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidad;

import java.sql.Date;

/**
 *
 * @author USUARIO
 */
public class EntPedido {
    private int id;
    private Date fecha;
    private String fecha_String;
    private int cantidad;
    private float total;
    private String cliente;
    private String cliente_ruc;
    private String nombremesa;
    private String nro;
    private String fechaboleta_String;
    private int usuario_id;
    private int empleado_id;
    private int mesa_id;
    private int estado;
        
    public int getid() {
        return id;
    }

    public void setid(int id) {
        this.id = id;
    }

    public Date getfecha() {
        return fecha;
    }

    public void setfecha(Date fecha) {
        this.fecha = fecha;
    }

     public String getfecha_String() {
        return fecha_String;
    }

    public void setfecha_String(String fecha_String) {
        this.fecha_String = fecha_String;
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
    
    public String getcliente() {
        return cliente;
    }

    public void setcliente(String cliente) {
        this.cliente = cliente;
    }
    
    public String getcliente_ruc() {
        return cliente_ruc;
    }

    public void setcliente_ruc(String cliente_ruc) {
        this.cliente_ruc = cliente_ruc;
    }
    
    public String getnro() {
        return nro;
    }

    public void setnro(String nro) {
        this.nro = nro;
    }
    
     public String getfechaboleta_String() {
        return fechaboleta_String;
    }

    public void setfechaboleta_String(String fechaboleta_String) {
        this.fechaboleta_String = fechaboleta_String;
    }
    
    public int getusuario_id() {
        return usuario_id;
    }
    public void setusuario_id(int usuario_id) {
        this.usuario_id = usuario_id;
    }
    
    public int getempleado_id() {
        return empleado_id;
    }
    public void setempleado_id(int empleado_id) {
        this.empleado_id = empleado_id;
    }
    
    public int getmesa_id() {
        return mesa_id;
    }
    public void setmesa_id(int mesa_id) {
        this.mesa_id = mesa_id;
    }
    
     public String getnombremesa() {
        return nombremesa;
    }

    public void setnombremesa(String nombremesa) {
        this.nombremesa = nombremesa;
    }
    
    
    public int getestado() {
        return estado;
    }
    public void setestado(int estado) {
        this.estado = estado;
    }
    
    public EntPedido()
    {
    
    }
    
    public EntPedido( int id,Date fecha,String fecha_String,int cantidad,float total,String nro,String fechaboleta_String,
            String cliente,String cliente_ruc,int usuario_id,int empleado_id,int mesa_id,String nombremesa
            ,int estado) {
        this.id = id;
        this.fecha = fecha;
        this.fecha_String = fecha_String;
        this.cantidad = cantidad;
        this.total = total;
        this.cliente = cliente;
        this.cliente_ruc = cliente_ruc;
        this.nombremesa = nombremesa;
        this.usuario_id = usuario_id;
        this.empleado_id = empleado_id;
        this.nro = nro;
         this.fechaboleta_String = fechaboleta_String;
        this.mesa_id = mesa_id;
        this.estado = estado;
         
    }
    @Override    
    public String toString() {    
        // TODO Auto-generated method stub    
        return "{\"id\" :\""+ id + "\", \"fecha\" : \"" + fecha + "\",\"fecha_String\" : \"" + fecha_String + "\", \"cantidad\" : \"" + cantidad + "\", \"total\" : \"" + total + "\",\"cliente\" : \"" + cliente + "\",\"cliente_ruc\" : \"" + cliente_ruc + "\",\"usuario_id\" : \"" + usuario_id + "\",\"empleado_id\" : \"" + empleado_id + "\",\"nombremesa\" : \"" + nombremesa + "\",\"mesa_id\" : \"" + mesa_id + "\", \"nro\" : \"" + nro + "\",\"fechaboleta_String\" : \"" + fechaboleta_String + "\",\"estado\" : \"" + estado + "\"}";    
    } 
}
