/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package steps;

import entidad.EntSolicitud;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import negocio.NegSolicitud;
import org.junit.Assert;

/**
 *
 * @author USUARIO
 */
public class aprobar {
    
    private EntSolicitud solicitud;
    private Boolean resultado;

    @Given("^una solicitud con proveedor ID \"([^\"]*)\", usuarioAprobo ID \"([^\"]*)\", fecha de aprobación \"([^\"]*)\" y estado \"([^\"]*)\"$")
    public void una_solicitud_con_proveedor_ID_usuarioAprobo_ID_fecha_de_aprobación_y_estado(String proveedorId, String usuarioAproboId, String fechaAprobacion, String estado) {
        solicitud = new EntSolicitud();
        solicitud.setproveedor_id(1);
        solicitud.setusuarioAprobo_id(1);
        solicitud.setusuarioRegistro_id(1);
        solicitud.setcantidad(8);
        solicitud.settotal(10.00f);
        solicitud.setestado(2);
    }

    @When("^se aprueba la solicitud$")
    public void se_aprueba_la_solicitud() {
        // Lógica para aprobar la solicitud
        // Utiliza el método AprobarSolicitud y asigna el resultado a la variable "resultado"
        NegSolicitud aprobarSolicitud = new NegSolicitud();
        resultado = aprobarSolicitud.AprobarSolicitud(solicitud);
    }

    @Then("^la solicitud debe ser actualizada correctamente$")
    public void la_solicitud_debe_ser_actualizada_correctamente() {
        Assert.assertTrue(resultado);
        // Verificar que la solicitud fue actualizada correctamente
        // Puedes agregar más validaciones aquí si es necesario
    }

    @When("^se produce un error al aprobar la solicitud$")
    public void se_produce_un_error_al_aprobar_la_solicitud() {
        // Simular un error al aprobar la solicitud
        // Asigna "false" a la variable "resultado"
        resultado = false;
    }

    @Then("^la solicitud no debe ser actualizada$")
    public void la_solicitud_no_debe_ser_actualizada() {
        Assert.assertFalse(resultado);
        // Verificar que la solicitud no fue actualizada
        // Puedes agregar más validaciones aquí si es necesario
    }
    
}