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
public class EntPedidoTest {
    
    public EntPedidoTest() {
    }

    @Test
    public void testGetid() {
        System.out.println("getid");
        EntPedido instance = new EntPedido();
        int expResult = 0;
        int result = instance.getid();
        assertEquals(expResult, result);
    }

    @Test
    public void testSetid() {
        System.out.println("setid");
        int id = 0;
        EntPedido instance = new EntPedido();
        instance.setid(id);
    }

    @Test
    public void testGetfecha() {
        System.out.println("getfecha");
        EntPedido instance = new EntPedido();
        Date expResult = null;
        Date result = instance.getfecha();
        assertEquals(expResult, result);
    }

    @Test
    public void testSetfecha() {
        System.out.println("setfecha");
        Date fecha = null;
        EntPedido instance = new EntPedido();
        instance.setfecha(fecha);
    }

    @Test
    public void testGetfecha_String() {
        System.out.println("getfecha_String");
        EntPedido instance = new EntPedido();
        String expResult = null;
        String result = instance.getfecha_String();
        assertEquals(expResult, result);
    }

    @Test
    public void testSetfecha_String() {
        System.out.println("setfecha_String");
        String fecha_String = "";
        EntPedido instance = new EntPedido();
        instance.setfecha_String(fecha_String);
    }

    @Test
    public void testGetcantidad() {
        System.out.println("getcantidad");
        EntPedido instance = new EntPedido();
        int expResult = 0;
        int result = instance.getcantidad();
        assertEquals(expResult, result);
    }

    @Test
    public void testSetcantidad() {
        System.out.println("setcantidad");
        int cantidad = 0;
        EntPedido instance = new EntPedido();
        instance.setcantidad(cantidad);
    }

    @Test
    public void testGettotal() {
        System.out.println("gettotal");
        EntPedido instance = new EntPedido();
        float expResult = 0.0F;
        float result = instance.gettotal();
        assertEquals(expResult, result, 0.0);
    }

    @Test
    public void testSettotal() {
        System.out.println("settotal");
        float total = 0.0F;
        EntPedido instance = new EntPedido();
        instance.settotal(total);
    }

    @Test
    public void testGetcliente() {
        System.out.println("getcliente");
        EntPedido instance = new EntPedido();
        String expResult = null;
        String result = instance.getcliente();
        assertEquals(expResult, result);
    }

    @Test
    public void testSetcliente() {
        System.out.println("setcliente");
        String cliente = "";
        EntPedido instance = new EntPedido();
        instance.setcliente(cliente);
    }

    @Test
    public void testGetcliente_ruc() {
        System.out.println("getcliente_ruc");
        EntPedido instance = new EntPedido();
        String expResult = null;
        String result = instance.getcliente_ruc();
        assertEquals(expResult, result);
    }

    @Test
    public void testSetcliente_ruc() {
        System.out.println("setcliente_ruc");
        String cliente_ruc = "";
        EntPedido instance = new EntPedido();
        instance.setcliente_ruc(cliente_ruc);
    }

    @Test
    public void testGetnro() {
        System.out.println("getnro");
        EntPedido instance = new EntPedido();
        String expResult = null;
        String result = instance.getnro();
        assertEquals(expResult, result);
    }

    @Test
    public void testSetnro() {
        System.out.println("setnro");
        String nro = "";
        EntPedido instance = new EntPedido();
        instance.setnro(nro);
    }

    @Test
    public void testGetfechaboleta_String() {
        System.out.println("getfechaboleta_String");
        EntPedido instance = new EntPedido();
        String expResult = null;
        String result = instance.getfechaboleta_String();
        assertEquals(expResult, result);
    }

    @Test
    public void testSetfechaboleta_String() {
        System.out.println("setfechaboleta_String");
        String fechaboleta_String = "";
        EntPedido instance = new EntPedido();
        instance.setfechaboleta_String(fechaboleta_String);
    }

    @Test
    public void testGetusuario_id() {
        System.out.println("getusuario_id");
        EntPedido instance = new EntPedido();
        int expResult = 0;
        int result = instance.getusuario_id();
        assertEquals(expResult, result);
    }

    @Test
    public void testSetusuario_id() {
        System.out.println("setusuario_id");
        int usuario_id = 0;
        EntPedido instance = new EntPedido();
        instance.setusuario_id(usuario_id);
    }

    @Test
    public void testGetempleado_id() {
        System.out.println("getempleado_id");
        EntPedido instance = new EntPedido();
        int expResult = 0;
        int result = instance.getempleado_id();
        assertEquals(expResult, result);
    }

    @Test
    public void testSetempleado_id() {
        System.out.println("setempleado_id");
        int empleado_id = 0;
        EntPedido instance = new EntPedido();
        instance.setempleado_id(empleado_id);
    }

    @Test
    public void testGetmesa_id() {
        System.out.println("getmesa_id");
        EntPedido instance = new EntPedido();
        int expResult = 0;
        int result = instance.getmesa_id();
        assertEquals(expResult, result);
    }

    @Test
    public void testSetmesa_id() {
        System.out.println("setmesa_id");
        int mesa_id = 0;
        EntPedido instance = new EntPedido();
        instance.setmesa_id(mesa_id);
    }

    @Test
    public void testGetnombremesa() {
        System.out.println("getnombremesa");
        EntPedido instance = new EntPedido();
        String expResult = null;
        String result = instance.getnombremesa();
        assertEquals(expResult, result);
    }

    @Test
    public void testSetnombremesa() {
        System.out.println("setnombremesa");
        String nombremesa = "";
        EntPedido instance = new EntPedido();
        instance.setnombremesa(nombremesa);
    }

    @Test
    public void testGetestado() {
        System.out.println("getestado");
        EntPedido instance = new EntPedido();
        int expResult = 0;
        int result = instance.getestado();
        assertEquals(expResult, result);
    }

    @Test
    public void testSetestado() {
        System.out.println("setestado");
        int estado = 0;
        EntPedido instance = new EntPedido();
        instance.setestado(estado);
    }
    
}
