package util;

import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

    public class TitioneUtil {

        private WebDriver driver;
        private Select combo;

        public void inicializa() {
            String chromedriver = System.getProperty("user.dir")
                    + "/Driver/chromedriver.exe";
            System.out.println(chromedriver);
            System.setProperty("webdriver.chrome.driver", chromedriver);
            driver = new ChromeDriver();
        }

        public void fecharNavegador() {
            driver.quit();
        }

        public void interageBotao(String botao) {
            WebElement elemento = driver.findElement(By.id(botao));
            elemento.click();
        }

        public void preencheCampo(String campo, String dado) {
            WebElement elemento = driver.findElement(By.id(campo));
            elemento.sendKeys(dado);
        }

        public void selecionaRadioButton(String element) {
            driver.findElement(By.id(element)).click();
        }

        public void validaAlertConfirm(String valor) {
            Alert alert = driver.switchTo().alert();
            Assert.assertEquals(valor, alert.getText());
        }

        public void validaCampoResultado() {
            WebElement elemento = driver.findElement(By.id("resultado"));
            String teste = elemento.getText();
            Assert.assertNotEquals("Status: Nao cadastrado", elemento.getAttribute("value"));
        }

        public void validaDadosCampo(String campo, String dado) {
            WebElement elemento = driver.findElement(By.id(campo));
            Assert.assertEquals(dado, driver.findElement(By.id(campo)).getText());
        }

        public void validaCampoSexo(String campo, String dado) {
            WebElement elemento = driver.findElement(By.id(campo));
            Assert.assertEquals(dado , elemento.getText());
        }

        public void selecionaComida() {
            driver.findElement(By.id("elementosForm:comidaFavorita:0")).click();
        }

        public void validaSelecaoComida() {
            Assert.assertTrue(driver.findElement(By.id("elementosForm:comidaFavorita:0")).isSelected());
        }

        public void selecionarEscolaridade() {
            WebElement elemento = driver.findElement(By.id("elementosForm:escolaridade"));
            combo = new Select(elemento);
            combo.selectByIndex(5);
        }

        public void validaEscolaridadeSelecionada() {
            Assert.assertEquals("superior", combo.getFirstSelectedOption().getAttribute("value"));
        }

        public void selecionarValorEsporteMultiplo() {
            WebElement elemento = driver.findElement(By.id("elementosForm:esportes"));
            combo = new Select(elemento);
            combo.selectByVisibleText("O que eh esporte?");
        }

        public void preencheSugestoes() {
            driver.findElement(By.id("elementosForm:sugestoes")).sendKeys("Aqui funcionou! \n\n" +
                    "Na nova linha também!");
        }



}
