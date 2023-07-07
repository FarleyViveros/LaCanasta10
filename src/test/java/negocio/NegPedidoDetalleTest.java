/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package negocio;

import entidad.EntPedidoDetalle;
import java.sql.ResultSet;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author USUARIO
 */
public class NegPedidoDetalleTest {
    
    public NegPedidoDetalleTest() {
    }

    @Test
    public void testListarPedidoDetalle() throws Exception {
        System.out.println("listarPedidoDetalle");
        int pedido_id = 0;
        NegPedidoDetalle instance = new NegPedidoDetalle();
        ResultSet result = instance.listarPedidoDetalle(pedido_id);
        assertNotNull( result);
    }

    @Test
    public void testDetallePedidoDetalle() throws Exception {
        System.out.println("detallePedidoDetalle");
        int id = 0;
        NegPedidoDetalle instance = new NegPedidoDetalle();
        ResultSet result = instance.detallePedidoDetalle(id);
        assertNotNull( result);
    }

    @Test
    public void testAgregarPedidoDetalle() {
        System.out.println("agregarPedidoDetalle");
        EntPedidoDetalle objspedidodetalle = new EntPedidoDetalle();
        NegPedidoDetalle instance = new NegPedidoDetalle();
        Boolean expResult = false;
        Boolean result = instance.agregarPedidoDetalle(objspedidodetalle);
        assertEquals(expResult, result);
    }

    @Test
    public void testQuitarPedidoDetalle() {
        System.out.println("QuitarPedidoDetalle");
        int pedidoDetalle_id = 0;
        NegPedidoDetalle instance = new NegPedidoDetalle();
        Boolean expResult = true;
        Boolean result = instance.QuitarPedidoDetalle(pedidoDetalle_id);
        assertEquals(expResult, result);
    }

    @Test
    public void testEditarPedidoDetalle() {
        System.out.println("editarPedidoDetalle");
        EntPedidoDetalle objpedidodetalle = new EntPedidoDetalle();
        NegPedidoDetalle instance = new NegPedidoDetalle();
        Boolean expResult = true;
        Boolean result = instance.editarPedidoDetalle(objpedidodetalle);
        assertEquals(expResult, result);
    }
    
}
