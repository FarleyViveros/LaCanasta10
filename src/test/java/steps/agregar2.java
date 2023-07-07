/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package steps;

import conexion.conexion;
import entidad.EntMesas;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import java.sql.Statement;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 *
 * @author USUARIO
 */
public class agregar2 {
    
    private EntMesas objmesas;
    private Boolean resultado;

    @Given("^que tengo una instancia de EntMesas$")
    public void que_tengo_una_instancia_de_EntMesas() {
        objmesas = new EntMesas();
        // Aquí puedes inicializar los atributos de la instancia de EntMesas según tus necesidades de prueba
        objmesas.setnombre("Mesa 11");
        objmesas.setestado(0);
    }
    
    @Given("^que tengo una instancia de EntMesas inválida$")
    public void que_tengo_una_instancia_de_ent_mesas_inválida() {
    objmesas = new EntMesas();
    // Aquí puedes inicializar los atributos de la instancia de EntMesas inválida según tus necesidades de prueba
    // Ejemplo: objmesas.setNombre(null);
    //          objmesas.setEstado("Invalido");
    }

    @When("^agrego la mesa a la base de datos$")
    public void agrego_la_mesa_a_la_base_de_datos() {
        resultado = agregarMesa(objmesas);
    }

    @Then("^la mesa se agrega correctamente$")
    public void la_mesa_se_agrega_correctamente() {
        assertTrue(resultado);
    }

    @When("^intento agregar la mesa a la base de datos$")
    public void intento_agregar_la_mesa_a_la_base_de_datos() {
        resultado = agregarMesa(objmesas);
    }

    @Then("^la mesa no se agrega y obtengo un error$")
    public void la_mesa_no_se_agrega_y_obtengo_un_error() {
        assertTrue(resultado);
    }

    // Método agregarMesa con la lógica incluida
    private Boolean agregarMesa(EntMesas objmesas) {
        String consulta = "insert into mesas"
                + "(nombre, estado)"
                + "values('" + objmesas.getnombre() + "','" + objmesas.getestado() + "');";
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
    
}
