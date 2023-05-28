import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

// O nome antes de .feature, deve ser o nome do arquivo feature que queres testar
@RunWith(Cucumber.class)
@CucumberOptions(features = "src/features/TrabalhoFinal/Desafio01e02.feature", glue = "", tags = "@validar_formulário_final")

public class TestRunner {
}
