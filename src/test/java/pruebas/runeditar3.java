package pruebas;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
    features = "src/test/java/pruebas/editar3.feature",
    glue = "steps",
    plugin = {
        "io.qameta.allure.cucumber6jvm.AllureCucumber6Jvm",
        "json:target/cucumber-report/editar3test/cucumber.json",
        "html:target/cucumber-report/editar3test/cucumber-html-report",
        "html:target/cucumber-report/editar3test/editar3report.html",
    }
)
public class runeditar3 {
    
}