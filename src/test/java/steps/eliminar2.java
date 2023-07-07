/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package steps;

import conexion.conexion;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import java.sql.Statement;

/**
 *
 * @author USUARIO
 */
public class eliminar2 {
    
    private int solicitudDetalleId;
    private boolean eliminacionExitosa;

    @Given("una solicitud con id {int}")
    public void una_solicitud_detalle_con_id(int solicitudDetalleId) {
        this.solicitudDetalleId = solicitudDetalleId;
    }

    @When("se quita la solicitud detalle")
    public void se_quita_la_solicitud_detalle() {
        // Llamar al método QuitarPedidoDetalle y almacenar el resultado en "eliminacionExitosa"
        this.eliminacionExitosa = QuitarSolicitudDetalle(solicitudDetalleId);
    }

    @Then("la solicitud detalle es eliminado")
    public void la_solicitud_detalle_es_eliminado() {
        // Verificar si la eliminación fue exitosa
        // Agregar aquí las aserciones necesarias para verificar si el detalle de pedido fue eliminado correctamente
        assert eliminacionExitosa;
    }

    // Método QuitarPedidoDetalle - Debes agregar este método al código existente
    public Boolean QuitarSolicitudDetalle(int solicitudDetalle_id)
    {
        String consulta="delete from solicitud_detalle where id ="+ solicitudDetalle_id;
        System.out.println(consulta);
        try
        {
            Statement st = conexion.obtener().createStatement();
            st.executeUpdate(consulta);
            return true;
        }
        catch(Exception e)
        {
            System.out.println(e);
            return false;
        }
    }
    
}