package pruebas;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
    features = "src/test/java/pruebas/eliminar.feature",
    glue = "steps",
    plugin = {
        "io.qameta.allure.cucumber6jvm.AllureCucumber6Jvm",
        "json:target/cucumber-report/eliminartest/cucumber.json",
        "html:target/cucumber-report/eliminartest/cucumber-html-report",
        "html:target/cucumber-report/eliminartest/eliminarreport.html",
    }
)
public class runeliminar {
    
}
