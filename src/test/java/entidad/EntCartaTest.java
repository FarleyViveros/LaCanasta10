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
public class EntCartaTest {
    
    public EntCartaTest() {
    }

    @Test
    public void testGetid() {
        System.out.println("getid");
        EntCarta instance = new EntCarta();
        int expResult = 0;
        int result = instance.getid();
        assertEquals(expResult, result);
    }

    @Test
    public void testSetid() {
        System.out.println("setid");
        int id = 0;
        EntCarta instance = new EntCarta();
        instance.setid(id);
    }

    @Test
    public void testGetnombre() {
        System.out.println("getnombre");
        EntCarta instance = new EntCarta();
        String expResult = null;
        String result = instance.getnombre();
        assertEquals(expResult, result);
    }

    @Test
    public void testSetnombre() {
        System.out.println("setnombre");
        String nombre = "";
        EntCarta instance = new EntCarta();
        instance.setnombre(nombre);
    }

    @Test
    public void testGetestado() {
        System.out.println("getestado");
        EntCarta instance = new EntCarta();
        int expResult = 0;
        int result = instance.getestado();
        assertEquals(expResult, result);
    }

    @Test
    public void testSetestado() {
        System.out.println("setestado");
        int estado = 0;
        EntCarta instance = new EntCarta();
        instance.setestado(estado);
    }

    @Test
    public void testGetprecio() {
        System.out.println("getprecio");
        EntCarta instance = new EntCarta();
        float expResult = 0.0F;
        float result = instance.getprecio();
        assertEquals(expResult, result, 0.0);
    }

    @Test
    public void testSetprecio() {
        System.out.println("setprecio");
        float precio = 0.0F;
        EntCarta instance = new EntCarta();
        instance.setprecio(precio);
    }
    
    @Test
    public void testEntCartaConstructor() {
        System.out.println("EntCarta constructor");

        // Valores de ejemplo para los parámetros del constructor
        int id = 1;
        String nombre = "Plato 1";
        int estado = 1;
        float precio = 9.99f;

        EntCarta instance = new EntCarta(id, nombre, estado, precio);
        
    }
    
}