import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

// O nome antes de .feature, deve ser o nome do arquivo feature que queres testar
@RunWith(Cucumber.class)
@CucumberOptions(features = "src/features/TrabalhoFinal/Titione.feature", glue = "", tags = "@acessar_varios_componentes_html")

public class TestRunner {
}
