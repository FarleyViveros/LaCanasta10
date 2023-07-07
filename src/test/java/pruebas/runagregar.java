package pruebas;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
    features = "src/test/java/pruebas/agregar.feature",
    glue = "steps",
    plugin = {
        "io.qameta.allure.cucumber6jvm.AllureCucumber6Jvm",
        "json:target/cucumber-report/agregartest/cucumber.json",
        "html:target/cucumber-report/agregartest/cucumber-html-report",
        "html:target/cucumber-report/agregartest/agregarreport.html",
    }
)
public class runagregar {
    
}