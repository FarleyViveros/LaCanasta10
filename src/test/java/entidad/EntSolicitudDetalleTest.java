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
public class EntSolicitudDetalleTest {
    
    public EntSolicitudDetalleTest() {
    }

    @Test
    public void testGetid() {
        System.out.println("getid");
        EntSolicitudDetalle instance = new EntSolicitudDetalle();
        int expResult = 0;
        int result = instance.getid();
        assertEquals(expResult, result);
    }

    @Test
    public void testSetid() {
        System.out.println("setid");
        int id = 0;
        EntSolicitudDetalle instance = new EntSolicitudDetalle();
        instance.setid(id);
    }

    @Test
    public void testGetsolicitud_id() {
        System.out.println("getsolicitud_id");
        EntSolicitudDetalle instance = new EntSolicitudDetalle();
        int expResult = 0;
        int result = instance.getsolicitud_id();
        assertEquals(expResult, result);
    }

    @Test
    public void testSetsolicitud_id() {
        System.out.println("setsolicitud_id");
        int solicitud_id = 0;
        EntSolicitudDetalle instance = new EntSolicitudDetalle();
        instance.setsolicitud_id(solicitud_id);
    }

    @Test
    public void testGetinsumo_id() {
        System.out.println("getinsumo_id");
        EntSolicitudDetalle instance = new EntSolicitudDetalle();
        int expResult = 0;
        int result = instance.getinsumo_id();
        assertEquals(expResult, result);
    }

    @Test
    public void testSetinsumo_id() {
        System.out.println("setinsumo_id");
        int insumo_id = 0;
        EntSolicitudDetalle instance = new EntSolicitudDetalle();
        instance.setinsumo_id(insumo_id);
    }

    @Test
    public void testGetcantidad() {
        System.out.println("getcantidad");
        EntSolicitudDetalle instance = new EntSolicitudDetalle();
        int expResult = 0;
        int result = instance.getcantidad();
        assertEquals(expResult, result);
    }

    @Test
    public void testSetcantidad() {
        System.out.println("setcantidad");
        int cantidad = 0;
        EntSolicitudDetalle instance = new EntSolicitudDetalle();
        instance.setcantidad(cantidad);
    }

    @Test
    public void testGetunidad() {
        System.out.println("getunidad");
        EntSolicitudDetalle instance = new EntSolicitudDetalle();
        String expResult = null;
        String result = instance.getunidad();
        assertEquals(expResult, result);
    }

    @Test
    public void testSetunidad() {
        System.out.println("setunidad");
        String unidad = "";
        EntSolicitudDetalle instance = new EntSolicitudDetalle();
        instance.setunidad(unidad);
    }

    @Test
    public void testGetprecio() {
        System.out.println("getprecio");
        EntSolicitudDetalle instance = new EntSolicitudDetalle();
        float expResult = 0.0F;
        float result = instance.getprecio();
        assertEquals(expResult, result, 0.0);
    }

    @Test
    public void testSetprecio() {
        System.out.println("setprecio");
        float precio = 0.0F;
        EntSolicitudDetalle instance = new EntSolicitudDetalle();
        instance.setprecio(precio);
    }

    @Test
    public void testGetestado() {
        System.out.println("getestado");
        EntSolicitudDetalle instance = new EntSolicitudDetalle();
        int expResult = 0;
        int result = instance.getestado();
        assertEquals(expResult, result);
    }

    @Test
    public void testSetestado() {
        System.out.println("setestado");
        int estado = 0;
        EntSolicitudDetalle instance = new EntSolicitudDetalle();
        instance.setestado(estado);
    }
    
    @Test
public void testEntSolicitudDetalleConstructor() {
    System.out.println("EntSolicitudDetalle constructor");
    
    // Valores de ejemplo para los parámetros del constructor
    int id = 1;
    int solicitud_id = 10;
    int insumo_id = 20;
    int cantidad = 5;
    String unidad = "unidad";
    float precio = 9.99f;
    int estado = 1;
    
    EntSolicitudDetalle instance = new EntSolicitudDetalle(id, solicitud_id, insumo_id, cantidad, unidad, precio, estado);

}

    
}
