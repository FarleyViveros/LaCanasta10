/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package steps;

import entidad.EntInsumos;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import negocio.NegInsumos;

/**
 *
 * @author USUARIO
 */
public class agregar3 {
    
    private EntInsumos objinsumos;
    private Boolean resultado;

    @Given("que tengo un objeto de tipo EntInsumos")
    public void tengoUnObjetoEntInsumos() {
        objinsumos = new EntInsumos();
        // Configurar propiedades del objeto objinsumos para la prueba
        objinsumos.setnombre("rocoto");
        objinsumos.setprecio(3.50f);
        objinsumos.setunidad("U.");
        objinsumos.setcantidad(20);
        objinsumos.setestado(1);
    }

    @When("llamo al método agregarInsumos")
    public void llamoAlMetodoAgregarInsumos() {
        NegInsumos myClass = new NegInsumos();
        resultado = myClass.agregarInsumos(objinsumos);
    }

    @Then("el insumo se agrega correctamente")
    public void insumoAgregadoCorrectamente() {
        // Verificar que el insumo se agregó correctamente
        assert(resultado);
    }
    
}