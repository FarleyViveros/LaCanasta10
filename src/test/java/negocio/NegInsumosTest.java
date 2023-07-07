/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package negocio;

import entidad.EntInsumos;
import java.sql.ResultSet;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author USUARIO
 */
public class NegInsumosTest {
    
    public NegInsumosTest() {
    }

    @Test
    public void testListarInsumos() throws Exception {
        System.out.println("listarInsumos");
        NegInsumos instance = new NegInsumos();
        ResultSet result = instance.listarInsumos();
        assertNotNull( result);
    }

    @Test
    public void testListarInsumosenRojo() throws Exception {
        System.out.println("listarInsumosenRojo");
        NegInsumos instance = new NegInsumos();
        ResultSet result = instance.listarInsumosenRojo();
        assertNotNull( result);
    }

    @Test
    public void testDetalleInsumoid() throws Exception {
        System.out.println("detalleInsumoid");
        int id = 0;
        NegInsumos instance = new NegInsumos();
        ResultSet result = instance.detalleInsumoid(id);
        assertNotNull( result);
    }

    @Test
    public void testAgregarInsumos() {
        System.out.println("agregarInsumos");
        EntInsumos objinsumos = new EntInsumos();
        NegInsumos instance = new NegInsumos();
        Boolean expResult = true;
        Boolean result = instance.agregarInsumos(objinsumos);
        assertEquals(expResult, result);
    }

    @Test
    public void testEditarInsumos() {
        System.out.println("editarInsumos");
        EntInsumos objinsumos = new EntInsumos();
        NegInsumos instance = new NegInsumos();
        Boolean expResult = true;
        Boolean result = instance.editarInsumos(objinsumos);
        assertEquals(expResult, result);
    }
    
}