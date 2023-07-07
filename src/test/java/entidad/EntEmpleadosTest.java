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
public class EntEmpleadosTest {
    
    public EntEmpleadosTest() {
    }

    @Test
    public void testGetid() {
        System.out.println("getid");
        EntEmpleados instance = new EntEmpleados();
        int expResult = 0;
        int result = instance.getid();
        assertEquals(expResult, result);
    }

    @Test
    public void testSetid() {
        System.out.println("setid");
        int id = 0;
        EntEmpleados instance = new EntEmpleados();
        instance.setid(id);
    }

    @Test
    public void testGetnombre() {
        System.out.println("getnombre");
        EntEmpleados instance = new EntEmpleados();
        String expResult = null;
        String result = instance.getnombre();
        assertEquals(expResult, result);
    }

    @Test
    public void testSetnombre() {
        System.out.println("setnombre");
        String nombre = "";
        EntEmpleados instance = new EntEmpleados();
        instance.setnombre(nombre);
    }

    @Test
    public void testGetapellidos() {
        System.out.println("getapellidos");
        EntEmpleados instance = new EntEmpleados();
        String expResult = null;
        String result = instance.getapellidos();
        assertEquals(expResult, result);
    }

    @Test
    public void testSetapellidos() {
        System.out.println("setapellidos");
        String apellidos = "";
        EntEmpleados instance = new EntEmpleados();
        instance.setapellidos(apellidos);
    }

    @Test
    public void testGetdireccion() {
        System.out.println("getdireccion");
        EntEmpleados instance = new EntEmpleados();
        String expResult = null;
        String result = instance.getdireccion();
        assertEquals(expResult, result);
    }

    @Test
    public void testSetdireccion() {
        System.out.println("setdireccion");
        String direccion = "";
        EntEmpleados instance = new EntEmpleados();
        instance.setdireccion(direccion);
    }

    @Test
    public void testGetestado() {
        System.out.println("getestado");
        EntEmpleados instance = new EntEmpleados();
        int expResult = 0;
        int result = instance.getestado();
        assertEquals(expResult, result);
    }

    @Test
    public void testSetestado() {
        System.out.println("setestado");
        int estado = 0;
        EntEmpleados instance = new EntEmpleados();
        instance.setestado(estado);
    }
    
    @Test
    public void testEntEmpleadosConstructor() {
        System.out.println("EntEmpleados constructor");

        // Valores de ejemplo para los parámetros del constructor
        int id = 1;
        String nombre = "John";
        String apellidos = "Doe";
        String direccion = "123 Main St";
        int estado = 1;

        EntEmpleados instance = new EntEmpleados(id, nombre, apellidos, direccion, estado);
        
    }
    
}