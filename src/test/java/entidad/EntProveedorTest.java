/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package entidad;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author USUARIO
 */
public class EntProveedorTest {
    
    public EntProveedorTest() {
    }

    @Test
    public void testGetid() {
        System.out.println("getid");
        EntProveedor instance = new EntProveedor();
        int expResult = 0;
        int result = instance.getid();
        assertEquals(expResult, result);
    }

    @Test
    public void testSetid() {
        System.out.println("setid");
        int id = 0;
        EntProveedor instance = new EntProveedor();
        instance.setid(id);
    }

    @Test
    public void testGetnombre() {
        System.out.println("getnombre");
        EntProveedor instance = new EntProveedor();
        String expResult = null;
        String result = instance.getnombre();
        assertEquals(expResult, result);
    }

    @Test
    public void testSetnombre() {
        System.out.println("setnombre");
        String nombre = "";
        EntProveedor instance = new EntProveedor();
        instance.setnombre(nombre);
    }

    @Test
    public void testGetruc() {
        System.out.println("getruc");
        EntProveedor instance = new EntProveedor();
        String expResult = null;
        String result = instance.getruc();
        assertEquals(expResult, result);
    }

    @Test
    public void testSetruc() {
        System.out.println("setruc");
        String ruc = "";
        EntProveedor instance = new EntProveedor();
        instance.setruc(ruc);
    }

    @Test
    public void testGetestado() {
        System.out.println("getestado");
        EntProveedor instance = new EntProveedor();
        int expResult = 0;
        int result = instance.getestado();
        assertEquals(expResult, result);
    }

    @Test
    public void testSetestado() {
        System.out.println("setestado");
        int estado = 0;
        EntProveedor instance = new EntProveedor();
        instance.setestado(estado);
    }
    
    @Test
public void testEntProveedorConstructor() {
    System.out.println("EntProveedor constructor");
    
    // Valores de ejemplo para los parámetros del constructor
    int id = 1;
    String nombre = "Proveedor 1";
    String ruc = "123456789";
    int estado = 1;
    
    EntProveedor instance = new EntProveedor(id, nombre, ruc, estado);
}

@Test
    public void testToString() {
        System.out.println("EntProveedor toString");
        int id = 123;
        String nombre = "John Doe";
        String ruc = "123456789";
        int estado= 1;
        
        EntProveedor instance = new EntProveedor(id, nombre, ruc, estado);

        String expected = "{\"id\" :\""+ id + "\", \"nombre\" : \"" + nombre + "\", \"ruc\" : \"" + ruc + "\", \"estado\" : \"" + estado + "\"}";
        String result = instance.toString();

        assertEquals(expected, result);
    }

    
}
