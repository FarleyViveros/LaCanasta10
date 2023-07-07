/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package negocio;

import entidad.EntEmpleados;
import java.sql.ResultSet;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author USUARIO
 */
public class NegEmpleadosTest {
    
    public NegEmpleadosTest() {
    }

    @Test
    public void testListarEmpleados() throws Exception {
        System.out.println("listarEmpleados");
        NegEmpleados instance = new NegEmpleados();
        ResultSet result = instance.listarEmpleados();
        assertNotNull( result);
    }

    @Test
    public void testDetalleEmpleadoid() throws Exception {
        System.out.println("detalleEmpleadoid");
        int id = 0;
        NegEmpleados instance = new NegEmpleados();
        ResultSet result = instance.detalleEmpleadoid(id);
        assertNotNull( result);
    }

    @Test
    public void testAgregarEmpleado() {
        System.out.println("agregarEmpleado");
        EntEmpleados objempleados = new EntEmpleados();
        NegEmpleados instance = new NegEmpleados();
        Boolean expResult = true;
        Boolean result = instance.agregarEmpleado(objempleados);
        assertEquals(expResult, result);
    }

    @Test
    public void testEditarEmpleado() {
        System.out.println("editarEmpleado");
        EntEmpleados objempleados = new EntEmpleados();
        NegEmpleados instance = new NegEmpleados();
        Boolean expResult = true;
        Boolean result = instance.editarEmpleado(objempleados);
        assertEquals(expResult, result);
    }
    
}