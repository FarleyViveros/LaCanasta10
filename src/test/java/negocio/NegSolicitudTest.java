/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package negocio;

import entidad.EntSolicitud;
import java.sql.ResultSet;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author USUARIO
 */
public class NegSolicitudTest {
    
    public NegSolicitudTest() {
    }

    @Test
    public void testListarSolicitud() throws Exception {
        System.out.println("listarSolicitud");
        NegSolicitud instance = new NegSolicitud();
        ResultSet result = instance.listarSolicitud();
        assertNotNull( result);
    }

    @Test
    public void testListarSolicitudRegistradas() throws Exception {
        System.out.println("listarSolicitudRegistradas");
        NegSolicitud instance = new NegSolicitud();
        ResultSet result = instance.listarSolicitudRegistradas();
        assertNotNull( result);
    }

    @Test
    public void testListarSolicitudfechas() throws Exception {
        System.out.println("listarSolicitudfechas");
        String fechaini = "";
        String fechafin = "";
        NegSolicitud instance = new NegSolicitud();
        ResultSet result = instance.listarSolicitudfechas(fechaini, fechafin);
        assertNotNull( result);
    }

    @Test
    public void testDetalleSolicitud() throws Exception {
        System.out.println("detalleSolicitud");
        int id = 0;
        NegSolicitud instance = new NegSolicitud();
        ResultSet result = instance.detalleSolicitud(id);
        assertNotNull( result);
    }

    @Test
    public void testAgregarSolicitud() {
        System.out.println("agregarSolicitud");
        EntSolicitud objsolicitud = new EntSolicitud();
        NegSolicitud instance = new NegSolicitud();
        int expResult = 0;
        int result = instance.agregarSolicitud(objsolicitud);
        assertEquals(expResult, result);
    }

    @Test
    public void testAprobarSolicitud() {
        System.out.println("AprobarSolicitud");
        EntSolicitud objsolicitud = new EntSolicitud();
        NegSolicitud instance = new NegSolicitud();
        Boolean expResult = true;
        Boolean result = instance.AprobarSolicitud(objsolicitud);
        assertEquals(expResult, result);
    }

    @Test
    public void testEditarEstadoSolicitud() {
        System.out.println("editarEstadoSolicitud");
        EntSolicitud objsolicitud = new EntSolicitud();
        NegSolicitud instance = new NegSolicitud();
        Boolean expResult = true;
        Boolean result = instance.editarEstadoSolicitud(objsolicitud);
        assertEquals(expResult, result);
    }
    
}