/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package conexion;

import java.sql.Connection;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author USUARIO
 */
public class conexionTest {
    
    public conexionTest() {
    }

    @Test
    public void testObtener() throws Exception {
        System.out.println("obtener");
        Connection expResult = null;
        Connection result = null;
        assertEquals(expResult, result);
    }

    @Test
    public void testCerrar() throws Exception {
        System.out.println("cerrar");
        conexion.cerrar();
    }
    
}