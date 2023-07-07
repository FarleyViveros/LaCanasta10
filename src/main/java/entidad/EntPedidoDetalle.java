/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidad;

/**
 *
 * @author USUARIO
 */
public class EntPedidoDetalle {
    private int id;
    private int pedido_id;
    private int carta_id;
    private int cantidad;
    private float precio;
    private float total;
    private int estado;
        
    public int getid() {
        return id;
    }

    public void setid(int id) {
        this.id = id;
    }
    
    public int getpedido_id() {
        return pedido_id;
    }

    public void setpedido_id(int pedido_id) {
        this.pedido_id = pedido_id;
    }

    public int getcarta_id() {
        return carta_id;
    }

    public void setcarta_id(int carta_id) {
        this.carta_id = carta_id;
    }
   
    public int getcantidad() {
        return cantidad;
    }

    public void setcantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    
    public float getprecio() {
        return precio;
    }
     
    public void setprecio(float precio) {
        this.precio = precio;
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
    
    public EntPedidoDetalle()
    {
    
    }
    
    public EntPedidoDetalle( int id,int pedido_id,int carta_id,int cantidad,float precio,float total,int estado) {
        this.id = id;
        this.pedido_id = pedido_id;
        this.carta_id = carta_id;
        this.cantidad = cantidad;
        this.precio = precio;
        this.total = total;
        this.estado = estado;
         
    }
    @Override    
    public String toString() {    
        // TODO Auto-generated method stub    
        return "{\"id\" :\""+ id + "\", \"pedido_id\" : \"" + pedido_id + "\", \"carta_id\" : \"" + carta_id + "\", \"total\" : \"" + total + "\", \"cantidad\" : \"" + cantidad + "\", \"precio\" : \"" + precio + "\",\"estado\" : \"" + estado + "\"}";    
    } 
}
