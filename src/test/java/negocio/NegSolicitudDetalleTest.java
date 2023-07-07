/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package negocio;

import entidad.EntSolicitudDetalle;
import java.sql.ResultSet;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author USUARIO
 */
public class NegSolicitudDetalleTest {
    
    public NegSolicitudDetalleTest() {
    }

    @Test
    public void testListarSolicitudDetalle() throws Exception {
        System.out.println("listarSolicitudDetalle");
        int solcitud_id = 0;
        NegSolicitudDetalle instance = new NegSolicitudDetalle();
        ResultSet result = instance.listarSolicitudDetalle(solcitud_id);
        assertNotNull( result);
    }

    @Test
    public void testDetalleSolicitudDetalle() throws Exception {
        System.out.println("detalleSolicitudDetalle");
        int id = 0;
        NegSolicitudDetalle instance = new NegSolicitudDetalle();
        ResultSet result = instance.detalleSolicitudDetalle(id);
        assertNotNull( result);
    }

    @Test
    public void testAgregarSolicitudDetalle() {
        System.out.println("agregarSolicitudDetalle");
        EntSolicitudDetalle objsolicituddetalle = new EntSolicitudDetalle();
        NegSolicitudDetalle instance = new NegSolicitudDetalle();
        Boolean expResult = false;
        Boolean result = instance.agregarSolicitudDetalle(objsolicituddetalle);
        assertEquals(expResult, result);
    }

    @Test
    public void testQuitarSolicitudDetalle() {
        System.out.println("QuitarSolicitudDetalle");
        int solicitudDetalle_id = 0;
        NegSolicitudDetalle instance = new NegSolicitudDetalle();
        Boolean expResult = true;
        Boolean result = instance.QuitarSolicitudDetalle(solicitudDetalle_id);
        assertEquals(expResult, result);
    }

    @Test
    public void testEditarSolicitudDetalle() {
        System.out.println("editarSolicitudDetalle");
        EntSolicitudDetalle objsolicituddetalle = new EntSolicitudDetalle();
        NegSolicitudDetalle instance = new NegSolicitudDetalle();
        Boolean expResult = true;
        Boolean result = instance.editarSolicitudDetalle(objsolicituddetalle);
        assertEquals(expResult, result);
    }
    
}