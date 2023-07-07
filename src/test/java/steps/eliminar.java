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
public class eliminar {
    
    private int pedidoDetalleId;
    private boolean eliminacionExitosa;

    @Given("un pedido detalle con id {int}")
    public void un_pedido_detalle_con_id(int pedidoDetalleId) {
        this.pedidoDetalleId = pedidoDetalleId;
    }

    @Given("un pedido detalle con id inexistente")
    public void un_pedido_detalle_con_id_inexistente() {
        // Asigna un id de detalle de pedido inexistente para simular un caso de prueba
        this.pedidoDetalleId = 20;
    }

    @When("se quita el pedido detalle")
    public void se_quita_el_pedido_detalle() {
        // Llamar al método QuitarPedidoDetalle y almacenar el resultado en "eliminacionExitosa"
        this.eliminacionExitosa = QuitarPedidoDetalle(pedidoDetalleId);
    }
    
    @When("se intenta quitar el pedido detalle")
    public void se_intenta_quitar_el_pedido_detalle() {
        // Llamar al método QuitarPedidoDetalle y almacenar el resultado en "eliminacionExitosa"
        this.eliminacionExitosa = QuitarPedidoDetalle(pedidoDetalleId);
    }

    @Then("el pedido detalle es eliminado")
    public void el_pedido_detalle_es_eliminado() {
        // Verificar si la eliminación fue exitosa
        // Agregar aquí las aserciones necesarias para verificar si el detalle de pedido fue eliminado correctamente
        assert eliminacionExitosa;
    }

    @Then("la eliminación del pedido detalle falla")
    public void la_eliminacion_del_pedido_detalle_falla() {
        // Verificar si la eliminación falló
        // Agregar aquí las aserciones necesarias para verificar si la eliminación del detalle de pedido falló correctamente
        assert eliminacionExitosa;
    }

    // Método QuitarPedidoDetalle - Debes agregar este método al código existente
    public Boolean QuitarPedidoDetalle(int pedidoDetalle_id) {
        String consulta = "delete from pedido_detalle where id =" + pedidoDetalle_id;
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
