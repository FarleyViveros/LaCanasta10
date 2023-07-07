package pruebas;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
    features = "src/test/java/pruebas/login.feature",
    glue = "steps",
    plugin = {
        "io.qameta.allure.cucumber6jvm.AllureCucumber6Jvm",
        "json:target/cucumber-report/logintest/cucumber.json",
        "html:target/cucumber-report/logintest/cucumber-html-report",
        "html:target/cucumber-report/logintest/loginreport.html",
    }
)
public class runlogin {
    // Esta clase estará vacía
}
