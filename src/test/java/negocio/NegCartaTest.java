/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package negocio;

import entidad.EntCarta;
import java.sql.ResultSet;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author USUARIO
 */
public class NegCartaTest {
    
    public NegCartaTest() {
    }

    @Test
    public void testListarCarta() throws Exception {
        System.out.println("listarCarta");
        NegCarta instance = new NegCarta();
        ResultSet result = instance.listarCarta();
        assertNotNull(result);
    }

    @Test
    public void testDetalleCartaid() throws Exception {
        System.out.println("detalleCartaid");
        int id = 0;
        NegCarta instance = new NegCarta();
        ResultSet result = instance.detalleCartaid(id);
        assertNotNull( result);
    }

    @Test
    public void testAgregarCarta() {
        System.out.println("agregarCarta");
        EntCarta objcarta = new EntCarta();
        NegCarta instance = new NegCarta();
        Boolean expResult = true;
        Boolean result = instance.agregarCarta(objcarta);
        assertEquals(expResult, result);
    }

    @Test
    public void testEditarCarta() {
        System.out.println("editarCarta");
        EntCarta objcarta = new EntCarta();
        NegCarta instance = new NegCarta();
        Boolean expResult = true;
        Boolean result = instance.editarCarta(objcarta);
        assertEquals(expResult, result);
    }
    
}
