/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package negocio;

import entidad.EntPedido;
import java.sql.ResultSet;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author USUARIO
 */
public class NegPedidoTest {
    
    public NegPedidoTest() {
    }

    @Test
    public void testPedidoactivoxmesa() throws Exception {
        System.out.println("Pedidoactivoxmesa");
        int mesa_id = 0;
        NegPedido instance = new NegPedido();
        ResultSet result = instance.Pedidoactivoxmesa(mesa_id);
        assertNotNull( result);
    }

    @Test
    public void testPedidoactivoxpedido_id() throws Exception {
        System.out.println("Pedidoactivoxpedido_id");
        int pedido_id = 0;
        NegPedido instance = new NegPedido();
        ResultSet result = instance.Pedidoactivoxpedido_id(pedido_id);
        assertNotNull( result);
    }

    @Test
    public void testPedidoactivos() throws Exception {
        System.out.println("Pedidoactivos");
        NegPedido instance = new NegPedido();
        ResultSet result = instance.Pedidoactivos();
        assertNotNull( result);
    }

    @Test
    public void testListarPedidos() throws Exception {
        System.out.println("listarPedidos");
        NegPedido instance = new NegPedido();
        ResultSet result = instance.listarPedidos();
        assertNotNull( result);
    }

    @Test
    public void testListarPedidofechas() throws Exception {
        System.out.println("listarPedidofechas");
        String fechaini = "";
        String fechafin = "";
        NegPedido instance = new NegPedido();
        ResultSet result = instance.listarPedidofechas(fechaini, fechafin);
        assertNotNull( result);
    }

    @Test
    public void testAgregarPedido() {
        System.out.println("agregarPedido");
        EntPedido objpedido = new EntPedido();
        NegPedido instance = new NegPedido();
        int expResult = 0;
        int result = instance.agregarPedido(objpedido);
        assertEquals(expResult, result);
    }

    @Test
    public void testEditarPedido() {
        System.out.println("editarPedido");
        EntPedido objpedido = new EntPedido();
        NegPedido instance = new NegPedido();
        int expResult = 0;
        int result = instance.editarPedido(objpedido);
        assertEquals(expResult, result);
    }

    @Test
    public void testEditarCantidadTotalPedido() {
        System.out.println("editarCantidadTotalPedido");
        int cantidad = 0;
        float total = 0.0F;
        int pedido_id = 0;
        NegPedido instance = new NegPedido();
        Boolean expResult = true;
        Boolean result = instance.editarCantidadTotalPedido(cantidad, total, pedido_id);
        assertEquals(expResult, result);
    }

    @Test
    public void testEditarEstadoPedido() {
        System.out.println("editarEstadoPedido");
        int estado = 0;
        int pedido_id = 0;
        NegPedido instance = new NegPedido();
        Boolean expResult = true;
        Boolean result = instance.editarEstadoPedido(estado, pedido_id);
        assertEquals(expResult, result);
    }

    @Test
    public void testEditarEstadoNroPedido() {
        System.out.println("editarEstadoNroPedido");
        int estado = 0;
        int pedido_id = 0;
        String nro = "";
        String fechaboleta = "";
        NegPedido instance = new NegPedido();
        Boolean expResult = true;
        Boolean result = instance.editarEstadoNroPedido(estado, pedido_id, nro, fechaboleta);
        assertEquals(expResult, result);
    }

    @Test
    public void testTBboletaCount() throws Exception {
        System.out.println("TBboletaCount");
        NegPedido instance = new NegPedido();
        ResultSet result = instance.TBboletaCount();
        assertNotNull( result);
    }
    
}
