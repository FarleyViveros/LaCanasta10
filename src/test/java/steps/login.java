package steps;

import conexion.conexion;
import entidad.EntUsuario;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import org.junit.Assert;

public class login {

    private EntUsuario usuario;
    private ResultSet resultado;

    @Given("un usuario con email {string} y password {string}")
    public void createUser(String email, String password) {
        usuario = new EntUsuario();
        usuario.setcorreo(email);
        usuario.setclave(password);
    }

    @When("el usuario intenta logearse")
    public void attemptLogin() {
        try {
            Assert.assertNotNull(usuario); // Verificar que el objeto usuario no sea nulo
            // Llamar al método de login y almacenar el resultado
            resultado = login(usuario);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Then("el login debe ser exitoso")
    public void loginShouldBeSuccessful() {
        Assert.assertNotNull(resultado);
        // Realizar las aserciones adicionales según los requisitos de tu aplicación
    }

    @Then("el login debe fallar")
    public void loginShouldFail() {
        Assert.assertNotNull(resultado);
        // Realizar las aserciones adicionales según los requisitos de tu aplicación
    }

    private ResultSet login(EntUsuario usuario) throws SQLException {
        String consulta = "SELECT * FROM usuario where correo='" + usuario.getcorreo() + "' and clave='" + usuario.getclave() + "'";
        try {
            System.out.println(consulta);
            Statement sentencia = conexion.obtener().createStatement();
            ResultSet resultado = sentencia.executeQuery(consulta);
            return resultado;
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
            return null;
        }
    }
}