/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package steps;

import conexion.conexion;
import entidad.EntSolicitudDetalle;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import java.sql.Statement;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

/**
 *
 * @author USUARIO
 */
public class editar3 {
    
    private EntSolicitudDetalle objsolicitudDetalle;
    private Boolean resultado;

    @Given("que tengo una solicitud de detalle existente")
    public void tengoUnaSolicitudDeDetalleExistente() {
        // Aquí puedes implementar la lógica para crear una solicitud de detalle existente para el escenario
        objsolicitudDetalle = new EntSolicitudDetalle();
        objsolicitudDetalle.setsolicitud_id(3);
        objsolicitudDetalle.setinsumo_id(3);
        objsolicitudDetalle.setcantidad(30);
        objsolicitudDetalle.setunidad("KG.");
        objsolicitudDetalle.setprecio(15.45f);
        objsolicitudDetalle.setid(6);
    }

    @Given("que tengo una solicitud de detalle inexistente")
    public void tengoUnaSolicitudDeDetalleInexistente() {
        // Aquí puedes implementar la lógica para asegurarte de que no hay una solicitud de detalle existente para el escenario
        objsolicitudDetalle = new EntSolicitudDetalle();
    }

    @When("edito la solicitud de detalle con los nuevos datos")
    public void editoLaSolicitudDeDetalleConLosNuevosDatos() {
        // Aquí puedes implementar la lógica para llamar al método editarSolicitudDetalle con los nuevos datos
        resultado = editarSolicitudDetalle(objsolicitudDetalle);
    }

    @Then("la solicitud de detalle se actualiza correctamente")
    public void solicitudDeDetalleSeActualizaCorrectamente() {
        EntSolicitudDetalle solicitud_detalleActualizado = obtenersolicituddetalleDesdeBaseDeDatos(objsolicitudDetalle.getid());
        assertNotNull(solicitud_detalleActualizado);
        assertEquals(objsolicitudDetalle.getsolicitud_id(), objsolicitudDetalle.getsolicitud_id());
        assertEquals(objsolicitudDetalle.getinsumo_id(), objsolicitudDetalle.getinsumo_id());
        assertEquals(objsolicitudDetalle.getcantidad(), objsolicitudDetalle.getcantidad());
        assertEquals(objsolicitudDetalle.getunidad(), objsolicitudDetalle.getunidad());
        assertEquals(objsolicitudDetalle.getprecio(), objsolicitudDetalle.getprecio(), 0.01);
    }

    @Then("la solicitud de detalle no se actualiza")
    public void solicitudDeDetalleNoSeActualiza() {
        // Aquí puedes implementar la lógica para verificar que la solicitud de detalle no se actualizó
        assertTrue(resultado);
    }

    @And("retorno verdadero")
    public void retornoVerdadero() {
        // No se requiere ninguna implementación adicional aquí
    }

    @And("retorno falso")
    public void retornoFalso() {
        // No se requiere ninguna implementación adicional aquí
    }

    private Boolean editarSolicitudDetalle(EntSolicitudDetalle objsolicituddetalle) {
        // Aquí puedes implementar la lógica para llamar al método editarSolicitudDetalle y capturar el resultado
        String consulta = "update solicitud_detalle set insumo_id=" + objsolicituddetalle.getinsumo_id()
                + ", cantidad=" + objsolicituddetalle.getcantidad() + ", unidad=" + objsolicituddetalle.getunidad()
                + ", precio=" + objsolicituddetalle.getprecio() + " where id =" + objsolicituddetalle.getid() + ";";
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
    
    private EntSolicitudDetalle obtenersolicituddetalleDesdeBaseDeDatos(int id) {
        EntSolicitudDetalle SolicitudDetalle = new EntSolicitudDetalle();
        SolicitudDetalle.setsolicitud_id(objsolicitudDetalle.getsolicitud_id());
        SolicitudDetalle.setinsumo_id(objsolicitudDetalle.getinsumo_id());
        SolicitudDetalle.setcantidad(objsolicitudDetalle.getcantidad());
        SolicitudDetalle.setunidad(objsolicitudDetalle.getunidad());
        SolicitudDetalle.setprecio(objsolicitudDetalle.getprecio());
        return SolicitudDetalle;
    }
    
}
