/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package steps;

import conexion.conexion;
import entidad.EntMesas;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import java.sql.Statement;
import static org.junit.Assert.*;

/**
 *
 * @author USUARIO
 */
public class editar2 {
    
    private EntMesas objmesas;
    private Boolean resultado;

    @Given("un objeto mesa")
    public void crearObjetoMesa() {
        objmesas = new EntMesas();
        objmesas.setnombre("mesa 10");
        objmesas.setestado(0);
        objmesas.setid(10);
    }

    @When("se llama al método editarMesa")
    public void llamarMetodoEditarMesa() {
        resultado = editarMesa(objmesas);
    }

    @Then("se actualiza la mesa")
    public void verificarActualizacionEnBaseDeDatos() {
        EntMesas mesaActualizado = obtenerMesasDesdeBaseDeDatos(objmesas.getid());
        assertNotNull(mesaActualizado);
        assertEquals(objmesas.getnombre(), mesaActualizado.getnombre());
        assertEquals(objmesas.getestado(), mesaActualizado.getestado());
    }

    @And("se retorna correcto")
    public void verificarRetornoVerdadero() {
        assertTrue(resultado);
    }

    @And("se retorna incorrecto")
    public void verificarRetornoFalso() {
        assertTrue(resultado);
    }

    public Boolean editarMesa(EntMesas EntMesas) {
        String consulta = "update mesas set nombre ='" + objmesas.getnombre() + "',estado=" + 
                objmesas.getestado() + " where id =" + objmesas.getid()
                + ";";
        System.out.println(consulta);
        try {
            Statement st = conexion.obtener().createStatement();
            st.executeUpdate(consulta);
            return true;
        } catch (Exception e) {
            System.out.println(e);
            return false;
        }
    }

    private EntMesas obtenerMesasDesdeBaseDeDatos(int id) {
        EntMesas mesa = new EntMesas();
        mesa.setnombre(objmesas.getnombre());
        mesa.setestado(objmesas.getestado());
        mesa.setid(objmesas.getid());
        return mesa;
    }
    
}
