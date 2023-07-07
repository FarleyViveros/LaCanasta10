package pruebas;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
    features = "src/test/java/pruebas/editar2.feature",
    glue = "steps",
    plugin = {
        "io.qameta.allure.cucumber6jvm.AllureCucumber6Jvm",
        "json:target/cucumber-report/editar2test/cucumber.json",
        "html:target/cucumber-report/editar2test/cucumber-html-report",
        "html:target/cucumber-report/editar2test/editar2report.html",
    }
)
public class runeditar2 {
    
}