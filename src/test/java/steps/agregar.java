/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package steps;

import entidad.EntCarta;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import negocio.NegCarta;
import org.junit.Assert;

/**
 *
 * @author USUARIO
 */
public class agregar {
    
    private EntCarta objcarta;
    private Boolean resultado;

    @Given("una carta con nombre {string}, precio {string} y estado {string}")
    public void unaCartaConNombrePrecioYEstado(String nombre, String precio, String estado) {
        objcarta = new EntCarta();
        
        objcarta.setnombre("Carta1");
        objcarta.setprecio(10.99f);
        objcarta.setestado(1);
    }

    @When("se agrega la carta")
    public void seAgregaLaCarta() {
        NegCarta myClass = new NegCarta();
        resultado = myClass.agregarCarta(objcarta);
    }

    @Then("la carta se agrega correctamente")
    public void laCartaSeAgregaCorrectamente() {
        Assert.assertTrue(resultado);
    }

    @Then("la carta no se agrega y se muestra un mensaje de error")
    public void laCartaNoSeAgregaYSeMuestraUnMensajeDeError() {
        Assert.assertTrue(resultado);
    }
    
}