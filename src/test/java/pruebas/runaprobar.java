package pruebas;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
    features = "src/test/java/pruebas/aprobar.feature",
    glue = "steps",
    plugin = {
        "io.qameta.allure.cucumber6jvm.AllureCucumber6Jvm",
        "json:target/cucumber-report/aprobartest/cucumber.json",
        "html:target/cucumber-report/aprobartest/cucumber-html-report",
        "html:target/cucumber-report/aprobartest/aprobarreport.html",
    }
)
public class runaprobar {
    
}