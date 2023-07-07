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
public class EntMesasTest {
    
    public EntMesasTest() {
    }

    @Test
    public void testGetid() {
        System.out.println("getid");
        EntMesas instance = new EntMesas();
        int expResult = 0;
        int result = instance.getid();
        assertEquals(expResult, result);
    }

    @Test
    public void testSetid() {
        System.out.println("setid");
        int id = 0;
        EntMesas instance = new EntMesas();
        instance.setid(id);
    }

    @Test
    public void testGetnombre() {
        System.out.println("getnombre");
        EntMesas instance = new EntMesas();
        String expResult = null;
        String result = instance.getnombre();
        assertEquals(expResult, result);
    }

    @Test
    public void testSetnombre() {
        System.out.println("setnombre");
        String nombre = "";
        EntMesas instance = new EntMesas();
        instance.setnombre(nombre);
    }

    @Test
    public void testGetestado() {
        System.out.println("getestado");
        EntMesas instance = new EntMesas();
        int expResult = 0;
        int result = instance.getestado();
        assertEquals(expResult, result);
    }

    @Test
    public void testSetestado() {
        System.out.println("setestado");
        int estado = 0;
        EntMesas instance = new EntMesas();
        instance.setestado(estado);
    }
    
    @Test
public void testEntMesasConstructor() {
    System.out.println("EntMesas constructor");
    
    // Valores de ejemplo para los parámetros del constructor
    int id = 1;
    String nombre = "Mesa 1";
    int estado = 1;
    
    EntMesas instance = new EntMesas(id, nombre, estado);
}
    
}