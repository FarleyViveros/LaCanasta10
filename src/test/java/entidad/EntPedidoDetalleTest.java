/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package entidad;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author USUARIO
 */
public class EntPedidoDetalleTest {
    
    public EntPedidoDetalleTest() {
    }

    @Test
    public void testGetid() {
        System.out.println("getid");
        EntPedidoDetalle instance = new EntPedidoDetalle();
        int expResult = 0;
        int result = instance.getid();
        assertEquals(expResult, result);
    }

    @Test
    public void testSetid() {
        System.out.println("setid");
        int id = 0;
        EntPedidoDetalle instance = new EntPedidoDetalle();
        instance.setid(id);
    }

    @Test
    public void testGetpedido_id() {
        System.out.println("getpedido_id");
        EntPedidoDetalle instance = new EntPedidoDetalle();
        int expResult = 0;
        int result = instance.getpedido_id();
        assertEquals(expResult, result);
    }

    @Test
    public void testSetpedido_id() {
        System.out.println("setpedido_id");
        int pedido_id = 0;
        EntPedidoDetalle instance = new EntPedidoDetalle();
        instance.setpedido_id(pedido_id);
    }

    @Test
    public void testGetcarta_id() {
        System.out.println("getcarta_id");
        EntPedidoDetalle instance = new EntPedidoDetalle();
        int expResult = 0;
        int result = instance.getcarta_id();
        assertEquals(expResult, result);
    }

    @Test
    public void testSetcarta_id() {
        System.out.println("setcarta_id");
        int carta_id = 0;
        EntPedidoDetalle instance = new EntPedidoDetalle();
        instance.setcarta_id(carta_id);
    }

    @Test
    public void testGetcantidad() {
        System.out.println("getcantidad");
        EntPedidoDetalle instance = new EntPedidoDetalle();
        int expResult = 0;
        int result = instance.getcantidad();
        assertEquals(expResult, result);
    }

    @Test
    public void testSetcantidad() {
        System.out.println("setcantidad");
        int cantidad = 0;
        EntPedidoDetalle instance = new EntPedidoDetalle();
        instance.setcantidad(cantidad);
    }

    @Test
    public void testGetprecio() {
        System.out.println("getprecio");
        EntPedidoDetalle instance = new EntPedidoDetalle();
        float expResult = 0.0F;
        float result = instance.getprecio();
        assertEquals(expResult, result, 0.0);
    }

    @Test
    public void testSetprecio() {
        System.out.println("setprecio");
        float precio = 0.0F;
        EntPedidoDetalle instance = new EntPedidoDetalle();
        instance.setprecio(precio);
    }

    @Test
    public void testGettotal() {
        System.out.println("gettotal");
        EntPedidoDetalle instance = new EntPedidoDetalle();
        float expResult = 0.0F;
        float result = instance.gettotal();
        assertEquals(expResult, result, 0.0);
    }

    @Test
    public void testSettotal() {
        System.out.println("settotal");
        float total = 0.0F;
        EntPedidoDetalle instance = new EntPedidoDetalle();
        instance.settotal(total);
    }

    @Test
    public void testGetestado() {
        System.out.println("getestado");
        EntPedidoDetalle instance = new EntPedidoDetalle();
        int expResult = 0;
        int result = instance.getestado();
        assertEquals(expResult, result);
    }

    @Test
    public void testSetestado() {
        System.out.println("setestado");
        int estado = 0;
        EntPedidoDetalle instance = new EntPedidoDetalle();
        instance.setestado(estado);
    }
    
    @Test
    public void testEntPedidoDetalleConstructor() {
        System.out.println("EntPedidoDetalle constructor");

        // Valores de ejemplo para los parámetros del constructor
        int id = 1;
        int pedido_id = 10;
        int carta_id = 20;
        int cantidad = 2;
        float precio = 5.99f;
        float total = 11.98f;
        int estado = 1;

        EntPedidoDetalle instance = new EntPedidoDetalle(id, pedido_id, carta_id, cantidad, precio, total, estado);
    
}

    
}
