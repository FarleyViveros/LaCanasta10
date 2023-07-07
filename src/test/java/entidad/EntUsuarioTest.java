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
public class EntUsuarioTest {
    
    public EntUsuarioTest() {
    }

    @Test
    public void testGetid() {
        System.out.println("getid");
        EntUsuario instance = new EntUsuario();
        int expResult = 0;
        int result = instance.getid();
        assertEquals(expResult, result);
    }

    @Test
    public void testSetid() {
        System.out.println("setid");
        int id = 0;
        EntUsuario instance = new EntUsuario();
        instance.setid(id);
    }

    @Test
    public void testGetempleado_id() {
        System.out.println("getempleado_id");
        EntUsuario instance = new EntUsuario();
        int expResult = 0;
        int result = instance.getempleado_id();
        assertEquals(expResult, result);
    }

    @Test
    public void testSetempleado_id() {
        System.out.println("setempleado_id");
        int empleado_id = 0;
        EntUsuario instance = new EntUsuario();
        instance.setempleado_id(empleado_id);
    }

    @Test
    public void testGetnombre() {
        System.out.println("getnombre");
        EntUsuario instance = new EntUsuario();
        String expResult = null;
        String result = instance.getnombre();
        assertEquals(expResult, result);
    }

    @Test
    public void testSetnombre() {
        System.out.println("setnombre");
        String nombre = "";
        EntUsuario instance = new EntUsuario();
        instance.setnombre(nombre);
    }

    @Test
    public void testGetcorreo() {
        System.out.println("getcorreo");
        EntUsuario instance = new EntUsuario();
        String expResult = null;
        String result = instance.getcorreo();
        assertEquals(expResult, result);
    }

    @Test
    public void testSetcorreo() {
        System.out.println("setcorreo");
        String correo = "";
        EntUsuario instance = new EntUsuario();
        instance.setcorreo(correo);
    }

    @Test
    public void testGetclave() {
        System.out.println("getclave");
        EntUsuario instance = new EntUsuario();
        String expResult = null;
        String result = instance.getclave();
        assertEquals(expResult, result);
    }

    @Test
    public void testSetclave() {
        System.out.println("setclave");
        String clave = "";
        EntUsuario instance = new EntUsuario();
        instance.setclave(clave);
    }

    @Test
    public void testGettipo() {
        System.out.println("gettipo");
        EntUsuario instance = new EntUsuario();
        int expResult = 0;
        int result = instance.gettipo();
        assertEquals(expResult, result);
    }

    @Test
    public void testSettipo() {
        System.out.println("settipo");
        int tipo = 0;
        EntUsuario instance = new EntUsuario();
        instance.settipo(tipo);
    }

    @Test
    public void testGetestado() {
        System.out.println("getestado");
        EntUsuario instance = new EntUsuario();
        int expResult = 0;
        int result = instance.getestado();
        assertEquals(expResult, result);
    }

    @Test
    public void testSetestado() {
        System.out.println("setestado");
        int estado = 0;
        EntUsuario instance = new EntUsuario();
        instance.setestado(estado);
    }
    
    @Test
public void testEntUsuarioConstructor() {
    System.out.println("EntUsuario constructor");
    
    // Valores de ejemplo para los parámetros del constructor
    int id = 1;
    int empleado_id = 10;
    String nombre = "John Doe";
    String correo = "johndoe@example.com";
    String clave = "password";
    int tipo = 1;
    int estado = 1;
    
    EntUsuario instance = new EntUsuario(id, empleado_id, nombre, correo, clave, tipo, estado);
    
}

@Test
    public void testToString() {
        System.out.println("EntUsuario toString");

        // Valores de ejemplo para los campos de la instancia
        int id = 1;
        int empleado_id = 10;
        String nombre = "John Doe";
        String correo = "johndoe@example.com";
        String clave = "password";
        int tipo = 1;
        int estado = 1;

        EntUsuario instance = new EntUsuario(id, empleado_id, nombre, correo, clave, tipo, estado);

        // Llamar al método toString()
        String expected = "{\"id\" :\"" + id + "\", \"empleado_id\" : \"" + empleado_id + "\",\"nombre\" : \"" + nombre + "\", \"correo\" : \"" + correo + "\", \"clave\" : \"" + clave + "\", \"tipo\" : \"" + tipo + "\", \"estado\" : \"" + estado + "\"}";
        String result = instance.toString();

        // Verificar que el resultado del método toString() coincida con el valor esperado
        assertEquals(expected, result);
    }

    
}