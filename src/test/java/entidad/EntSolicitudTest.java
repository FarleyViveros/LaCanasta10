/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package entidad;

import java.sql.Date;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author USUARIO
 */
public class EntSolicitudTest {
    
    public EntSolicitudTest() {
    }

    @Test
    public void testGetid() {
        System.out.println("getid");
        EntSolicitud instance = new EntSolicitud();
        int expResult = 0;
        int result = instance.getid();
        assertEquals(expResult, result);
    }

    @Test
    public void testSetid() {
        System.out.println("setid");
        int id = 0;
        EntSolicitud instance = new EntSolicitud();
        instance.setid(id);
    }

    @Test
    public void testGetproveedor_id() {
        System.out.println("getproveedor_id");
        EntSolicitud instance = new EntSolicitud();
        int expResult = 0;
        int result = instance.getproveedor_id();
        assertEquals(expResult, result);
    }

    @Test
    public void testSetproveedor_id() {
        System.out.println("setproveedor_id");
        int proveedor_id = 0;
        EntSolicitud instance = new EntSolicitud();
        instance.setproveedor_id(proveedor_id);
    }

    @Test
    public void testGetusuarioAprobo_id() {
        System.out.println("getusuarioAprobo_id");
        EntSolicitud instance = new EntSolicitud();
        int expResult = 0;
        int result = instance.getusuarioAprobo_id();
        assertEquals(expResult, result);
    }

    @Test
    public void testSetusuarioAprobo_id() {
        System.out.println("setusuarioAprobo_id");
        int usuarioAprobo_id = 0;
        EntSolicitud instance = new EntSolicitud();
        instance.setusuarioAprobo_id(usuarioAprobo_id);
    }

    @Test
    public void testGetusuarioRegistro_id() {
        System.out.println("getusuarioRegistro_id");
        EntSolicitud instance = new EntSolicitud();
        int expResult = 0;
        int result = instance.getusuarioRegistro_id();
        assertEquals(expResult, result);
    }

    @Test
    public void testSetusuarioRegistro_id() {
        System.out.println("setusuarioRegistro_id");
        int usuarioRegistro_id = 0;
        EntSolicitud instance = new EntSolicitud();
        instance.setusuarioRegistro_id(usuarioRegistro_id);
    }

    @Test
    public void testGetfecha_registro() {
        System.out.println("getfecha_registro");
        EntSolicitud instance = new EntSolicitud();
        Date expResult = null;
        Date result = instance.getfecha_registro();
        assertEquals(expResult, result);
    }

    @Test
    public void testSetfecha_registro() {
        System.out.println("setfecha_registro");
        Date fecha_registro = null;
        EntSolicitud instance = new EntSolicitud();
        instance.setfecha_registro(fecha_registro);
    }

    @Test
    public void testGetfecha_registroString() {
        System.out.println("getfecha_registroString");
        EntSolicitud instance = new EntSolicitud();
        String expResult = null;
        String result = instance.getfecha_registroString();
        assertEquals(expResult, result);
    }

    @Test
    public void testSetfecha_registroString() {
        System.out.println("setfecha_registroString");
        String fecha_registroString = "";
        EntSolicitud instance = new EntSolicitud();
        instance.setfecha_registroString(fecha_registroString);
    }

    @Test
    public void testGetfecha_aprobacion() {
        System.out.println("getfecha_aprobacion");
        EntSolicitud instance = new EntSolicitud();
        Date expResult = null;
        Date result = instance.getfecha_aprobacion();
        assertEquals(expResult, result);
    }

    @Test
    public void testSetfecha_aprobacion() {
        System.out.println("setfecha_aprobacion");
        Date fecha_aprobacion = null;
        EntSolicitud instance = new EntSolicitud();
        instance.setfecha_aprobacion(fecha_aprobacion);
    }

    @Test
    public void testGetfecha_aprobacionString() {
        System.out.println("getfecha_aprobacionString");
        EntSolicitud instance = new EntSolicitud();
        String expResult = null;
        String result = instance.getfecha_aprobacionString();
        assertEquals(expResult, result);
    }

    @Test
    public void testSetfecha_aprobacionString() {
        System.out.println("setfecha_aprobacionString");
        String fecha_aprobacionString = "";
        EntSolicitud instance = new EntSolicitud();
        instance.setfecha_aprobacionString(fecha_aprobacionString);
    }

    @Test
    public void testGetcantidad() {
        System.out.println("getcantidad");
        EntSolicitud instance = new EntSolicitud();
        int expResult = 0;
        int result = instance.getcantidad();
        assertEquals(expResult, result);
    }

    @Test
    public void testSetcantidad() {
        System.out.println("setcantidad");
        int cantidad = 0;
        EntSolicitud instance = new EntSolicitud();
        instance.setcantidad(cantidad);
    }

    @Test
    public void testGettotal() {
        System.out.println("gettotal");
        EntSolicitud instance = new EntSolicitud();
        float expResult = 0.0F;
        float result = instance.gettotal();
        assertEquals(expResult, result, 0.0);
    }

    @Test
    public void testSettotal() {
        System.out.println("settotal");
        float total = 0.0F;
        EntSolicitud instance = new EntSolicitud();
        instance.settotal(total);
    }

    @Test
    public void testGetestado() {
        System.out.println("getestado");
        EntSolicitud instance = new EntSolicitud();
        int expResult = 0;
        int result = instance.getestado();
        assertEquals(expResult, result);
    }

    @Test
    public void testSetestado() {
        System.out.println("setestado");
        int estado = 0;
        EntSolicitud instance = new EntSolicitud();
        instance.setestado(estado);
    }
    
    
}
