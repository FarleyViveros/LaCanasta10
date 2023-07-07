/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package negocio;

import entidad.EntProveedor;
import java.sql.ResultSet;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author USUARIO
 */
public class NegProveedorTest {
    
    public NegProveedorTest() {
    }

    @Test
    public void testListarProveedor() throws Exception {
        System.out.println("listarProveedor");
        NegProveedor instance = new NegProveedor();
        ResultSet result = instance.listarProveedor();
        assertNotNull( result);
    }

    @Test
    public void testDetalleProveedorid() throws Exception {
        System.out.println("detalleProveedorid");
        int id = 0;
        NegProveedor instance = new NegProveedor();
        ResultSet result = instance.detalleProveedorid(id);
        assertNotNull( result);
    }

    @Test
    public void testAgregarProveedor() {
        System.out.println("agregarProveedor");
        EntProveedor objproveedor = new EntProveedor();
        NegProveedor instance = new NegProveedor();
        Boolean expResult = true;
        Boolean result = instance.agregarProveedor(objproveedor);
        assertEquals(expResult, result);
    }

    @Test
    public void testEditarProveedor() {
        System.out.println("editarProveedor");
        EntProveedor objproveedor = new EntProveedor();
        NegProveedor instance = new NegProveedor();
        Boolean expResult = true;
        Boolean result = instance.editarProveedor(objproveedor);
        assertEquals(expResult, result);
    }
    
}