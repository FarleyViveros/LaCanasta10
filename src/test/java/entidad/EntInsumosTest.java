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
public class EntInsumosTest {
    
    public EntInsumosTest() {
    }

    @Test
    public void testGetid() {
        System.out.println("getid");
        EntInsumos instance = new EntInsumos();
        int expResult = 0;
        int result = instance.getid();
        assertEquals(expResult, result);
    }

    @Test
    public void testSetid() {
        System.out.println("setid");
        int id = 0;
        EntInsumos instance = new EntInsumos();
        instance.setid(id);
    }

    @Test
    public void testGetnombre() {
        System.out.println("getnombre");
        EntInsumos instance = new EntInsumos();
        String expResult = null;
        String result = instance.getnombre();
        assertEquals(expResult, result);
    }

    @Test
    public void testSetnombre() {
        System.out.println("setnombre");
        String nombre = "";
        EntInsumos instance = new EntInsumos();
        instance.setnombre(nombre);
    }

    @Test
    public void testGetprecio() {
        System.out.println("getprecio");
        EntInsumos instance = new EntInsumos();
        float expResult = 0.0F;
        float result = instance.getprecio();
        assertEquals(expResult, result, 0.0);
    }

    @Test
    public void testSetprecio() {
        System.out.println("setprecio");
        float precio = 0.0F;
        EntInsumos instance = new EntInsumos();
        instance.setprecio(precio);
    }

    @Test
    public void testGetunidad() {
        System.out.println("getunidad");
        EntInsumos instance = new EntInsumos();
        String expResult = null;
        String result = instance.getunidad();
        assertEquals(expResult, result);
    }

    @Test
    public void testSetunidad() {
        System.out.println("setunidad");
        String unidad = "";
        EntInsumos instance = new EntInsumos();
        instance.setunidad(unidad);
    }

    @Test
    public void testGetcantidad() {
        System.out.println("getcantidad");
        EntInsumos instance = new EntInsumos();
        int expResult = 0;
        int result = instance.getcantidad();
        assertEquals(expResult, result);
    }

    @Test
    public void testSetcantidad() {
        System.out.println("setcantidad");
        int cantidad = 0;
        EntInsumos instance = new EntInsumos();
        instance.setcantidad(cantidad);
    }

    @Test
    public void testGetestado() {
        System.out.println("getestado");
        EntInsumos instance = new EntInsumos();
        int expResult = 0;
        int result = instance.getestado();
        assertEquals(expResult, result);
    }

    @Test
    public void testSetestado() {
        System.out.println("setestado");
        int estado = 0;
        EntInsumos instance = new EntInsumos();
        instance.setestado(estado);
    }
    
     @Test
    public void testEntInsumosConstructor() {
        System.out.println("EntInsumos constructor");

        // Valores de ejemplo para los parámetros del constructor
        int id = 1;
        String nombre = "Insumo 1";
        float precio = 10.99f;
        String unidad = "unidad";
        int cantidad = 100;
        int estado = 1;

        EntInsumos instance = new EntInsumos(id, nombre, precio, unidad, cantidad, estado);

    }
    
}