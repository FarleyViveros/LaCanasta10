/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package negocio;

import entidad.EntUsuario;
import java.sql.ResultSet;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author USUARIO
 */
public class NegUsuarioTest {
    
    public NegUsuarioTest() {
    }

    @Test
    public void testLogin() throws Exception {
        System.out.println("login");
        EntUsuario usuario = new EntUsuario();
        NegUsuario instance = new NegUsuario();
        ResultSet result = instance.login(usuario);
        assertNotNull( result);
    }

    @Test
    public void testUsuarioEmpleado() throws Exception {
        System.out.println("usuarioEmpleado");
        int empleado_id = 0;
        NegUsuario instance = new NegUsuario();
        ResultSet result = instance.usuarioEmpleado(empleado_id);
        assertNotNull( result);
    }

    @Test
    public void testAgregarUsuario() {
        System.out.println("agregarUsuario");
        EntUsuario objusuario = new EntUsuario();
        NegUsuario instance = new NegUsuario();
        Boolean expResult = false;
        Boolean result = instance.agregarUsuario(objusuario);
        assertEquals(expResult, result);
    }

    @Test
    public void testEditarUsuario() {
        System.out.println("editarUsuario");
        EntUsuario objusuario = new EntUsuario();
        NegUsuario instance = new NegUsuario();
        Boolean expResult = true;
        Boolean result = instance.editarUsuario(objusuario);
        assertEquals(expResult, result);
    }
    
}
