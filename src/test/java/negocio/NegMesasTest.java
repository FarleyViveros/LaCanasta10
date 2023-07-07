/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package negocio;

import entidad.EntMesas;
import java.sql.ResultSet;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author USUARIO
 */
public class NegMesasTest {
    
    public NegMesasTest() {
    }

    @Test
    public void testListarMesas() throws Exception {
        System.out.println("listarMesas");
        NegMesas instance = new NegMesas();
        ResultSet result = instance.listarMesas();
        assertNotNull( result);
    }

    @Test
    public void testDetalleMesaid() throws Exception {
        System.out.println("detalleMesaid");
        int id = 0;
        NegMesas instance = new NegMesas();
        ResultSet result = instance.detalleMesaid(id);
        assertNotNull( result);
    }

    @Test
    public void testAgregarMesa() {
        System.out.println("agregarMesa");
        EntMesas objmesas = new EntMesas();
        NegMesas instance = new NegMesas();
        Boolean expResult = true;
        Boolean result = instance.agregarMesa(objmesas);
        assertEquals(expResult, result);
    }

    @Test
    public void testEditarMesa() {
        System.out.println("editarMesa");
        EntMesas objmesas = new EntMesas();
        NegMesas instance = new NegMesas();
        Boolean expResult = true;
        Boolean result = instance.editarMesa(objmesas);
        assertEquals(expResult, result);
    }

    @Test
    public void testEditarMesaEstado() {
        System.out.println("editarMesaEstado");
        int mesa_id = 0;
        int estado = 0;
        NegMesas instance = new NegMesas();
        Boolean expResult = true;
        Boolean result = instance.editarMesaEstado(mesa_id, estado);
        assertEquals(expResult, result);
    }
    
}
