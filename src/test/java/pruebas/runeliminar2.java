package pruebas;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
    features = "src/test/java/pruebas/eliminar2.feature",
    glue = "steps",
    plugin = {
        "io.qameta.allure.cucumber6jvm.AllureCucumber6Jvm",
        "json:target/cucumber-report/eliminar2test/cucumber.json",
        "html:target/cucumber-report/eliminar2test/cucumber-html-report",
        "html:target/cucumber-report/eliminar2test/eliminar2report.html",
    }
)
public class runeliminar2 {
    
}