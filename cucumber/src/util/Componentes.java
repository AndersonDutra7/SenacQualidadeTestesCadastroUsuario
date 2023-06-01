package util;

import org.junit.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Componentes{
    private WebDriver driver;
    private Select select;


    public void inicializar() {
        String chromedriver = System.getProperty("user.dir")
                + "/Driver/chromedriver.exe";
        System.out.println(chromedriver);
        System.setProperty("webdriver.chrome.driver", chromedriver);
        driver = new ChromeDriver();
    }

    public void clicarEnter() {
        driver.findElement(By.name("q")).sendKeys((Keys.ENTER));
    }

    public void acessarGoogle() {
        driver.get("https://www.google.com.br/");
    }

    public void pesquisarGoogle() {
        driver.findElement(By.name("q")).sendKeys("Globo Renault");
    }

    public void resultadoPesquisa() {
        driver.findElement(By.id("res")).isDisplayed();
        Assert.assertTrue(driver.getTitle().contains("Globo Renault"));
    }

    public void acessarSitedaEmpresa(){
        WebElement firstResult = driver.findElement(By.cssSelector("div#res a:first-child"));
        String empresaUrl = firstResult.getAttribute("href");
        driver.get(empresaUrl);
    }

    public void validarAcessoSite(){
        String urlDesejada = "https://www.globorenault.com.br/";
        String urlAtual = driver.getCurrentUrl();
        Assert.assertEquals(urlDesejada, urlAtual);
        fecharNavegador();
    }



    public void fecharNavegador() {
//        try {
//            Thread.sleep(10000); // Aguarda 10 segundos antes de fechar)
        driver.quit();
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
    }

    public void inicializarComponentes() {
        String chromedriver = System.getProperty("user.dir")
                + "/Driver/chromedriver.exe";
        System.out.println(chromedriver);
        System.setProperty("webdriver.chrome.driver", chromedriver);
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("file:///" + System.getProperty("user.dir") + "/Driver/componentes.html");
    }

    public void testarTextfieldNome() {
        driver.findElement(By.id("elementosForm:nome")).sendKeys("Anderson");
    }

    public void validarTextfieldNome() {

        Assert.assertEquals("Anderson", driver.findElement(By.id("descNome")).findElement(By.tagName("span")).getText());

    }


    public void testarTextfieldSobrenome() {
        driver.findElement(By.id("elementosForm:sobrenome")).sendKeys("Dutra");
    }

    public void validarTextfieldSobrenome() {
        Assert.assertEquals("Dutra", driver.findElement((By.id("descSobrenome"))).findElement(By.tagName("span")).getText());
    }

    public void testarRadioButtonSexo() {
        driver.findElement(By.id("elementosForm:sexo:0")).click();
    }

    public void validarRadioButtonSexo() {
        Assert.assertEquals("Masculino", driver.findElement((By.id("descSexo"))).findElement(By.tagName("span")).getText());
    }

    public void testarCheckboxComidaFavorita() {
        driver.findElement(By.id("elementosForm:comidaFavorita:0")).click();
    }

    public void validarCheckboxComidaFavorita() {
        Assert.assertEquals("Carne", driver.findElement((By.id("descComida"))).findElement(By.tagName("span")).getText());
    }

    public void testarSelectEscolaridade() {
        select = new Select(driver.findElement(By.id("elementosForm:escolaridade")));
        select.selectByValue("superior");
    }

    public void validarSelectEscolaridade() {
        Assert.assertEquals("superior", driver.findElement((By.id("descEscolaridade"))).findElement(By.tagName("span")).getText());
    }

    public void testarSelectEsportes() {
        select = new Select(driver.findElement(By.id("elementosForm:esportes")));
        select.selectByValue("futebol");
    }

    public void validarSelectEsportes() {
        Assert.assertTrue(driver.findElement(By.id("descEsportes")).getText().contains(select.getFirstSelectedOption().getText()));
    }

    public void testarTextareaSugestoes() {
        driver.findElement(By.id("elementosForm:sugestoes")).sendKeys("Estudar Mais");
    }

    public void validarTextareaSugestoes() {
        Assert.assertEquals("Estudar Mais", driver.findElement((By.id("descSugestoes"))).findElement(By.tagName("span")).getText());
    }

    public void testarBotaoCadastrar() {
            driver.findElement(By.id("elementosForm:cadastrar")).click();
    }

    public void testarTextfieldNomeObrigatorio() {
        driver.findElement(By.id("elementosForm:nome")).sendKeys("");
    }

    public void validarNomeObrigatorio() {
        Alert msg = driver.switchTo().alert();
        Assert.assertEquals(msg.getText(), "Nome eh obrigatorio");
        msg.accept();
    }

    public void testarTextfieldSobrenomeObrigatorio() {
        driver.findElement(By.id("elementosForm:sobrenome")).sendKeys("");
    }

    public void validarSobrenomeObrigatorio() {
        Alert msg = driver.switchTo().alert();
        Assert.assertEquals(msg.getText(), "Sobrenome eh obrigatorio");
        msg.accept();
    }

    public void testarRadioButtonSexoObrigatorio() {
        driver.findElement(By.id("elementosForm:sexo"));
    }

    public void validarSexoObrigatorio() {
        Alert msg = driver.switchTo().alert();
        Assert.assertEquals(msg.getText(), "Sexo eh obrigatorio");
        msg.accept();

    }

}


