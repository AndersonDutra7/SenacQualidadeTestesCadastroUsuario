package util;

import org.junit.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Componentes {
    private WebDriver driver;
    private Select select;

    public void inicializar(){
        String chromedriver = System.getProperty("user.dir")
                + "/Driver/chromedriver.exe";
        System.out.println(chromedriver);
        System.setProperty("webdriver.chrome.driver", chromedriver);
        driver = new ChromeDriver();
    }

    public void clicarEnter(){
        driver.findElement(By.name("q")).sendKeys((Keys.ENTER));
    }

    public void acessarGoogle(){
        driver.get("https://www.google.com.br/");
    }

    public void pesquisarGoogle(){
        driver.findElement(By.name("q")).sendKeys("SENAC Palhoça");
    }

    public void resultadoPesquisa(){
        driver.findElement(By.id("res")).isDisplayed();
        Assert.assertTrue(driver.getTitle().contains("SENAC"));
    }

    public void fecharNavegador(){
        try {
            Thread.sleep(10000); // Aguarda 10 segundos antes de fechar)
            driver.quit();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void inicializarComponentes(){
        String chromedriver = System.getProperty("user.dir")
                + "/Driver/chromedriver.exe";
        System.out.println(chromedriver);
        System.setProperty("webdriver.chrome.driver", chromedriver);
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("file:///" + System.getProperty("user.dir") + "/Driver/componentes.html");
    }

    public void testarTextfieldNome(){
        driver.findElement(By.id("elementosForm:nome")).sendKeys("Anderson");
    }

    public void validarTextfieldNome(){
        Assert.assertEquals("Anderson", driver.findElement((By.id("elementosForm:nome"))).getAttribute("value"));
    }

    public void testarTextfieldSobrenome(){
        driver.findElement(By.id("elementosForm:sobrenome")).sendKeys("Dutra");
    }

    public void validarTextfieldSobrenome(){
        Assert.assertEquals("Dutra", driver.findElement((By.id("elementosForm:sobrenome"))).getAttribute("value"));
    }

    public void testarRadioButtonSexo(){
        driver.findElement(By.id("elementosForm:sexo:0")).click();
    }

    public void validarRadioButtonSexo(){
        Assert.assertTrue(driver.findElement(By.id("elementosForm:sexo:0")).isSelected());
    }

    public void testarCheckboxComidaFavorita() {
        driver.findElement(By.id("elementosForm:comidaFavorita:0")).click();
    }

    public void validarCheckboxComidaFavorita() {
        Assert.assertTrue(driver.findElement(By.id("elementosForm:comidaFavorita:0")).isSelected());
    }

    public void testarSelectEscolaridade() {
        select = new Select(driver.findElement(By.id("elementosForm:escolaridade")));
        select.selectByValue("superior");
    }

    public void validarSelectEscolaridade(){
        Select select = new Select(driver.findElement(By.id("elementosForm:escolaridade")));
        Assert.assertTrue(driver.findElement(By.id("descEscolaridade")).getText().contains(select.getFirstSelectedOption().getText()));
        WebElement elementoResultado = driver.findElement(By.id("resultado"));
        JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
        jsExecutor.executeScript("arguments[0].innerText = 'Superior';", elementoResultado);
    }
    public void testarSelectEsportes(){
        select = new Select(driver.findElement(By.id("elementosForm:esportes")));
        select.selectByValue("futebol");
    }
    public void validarSelectEsportes(){
        Select select = new Select(driver.findElement(By.id("elementosForm:esportes")));
        Assert.assertTrue(driver.findElement(By.id("descEsportes")).getText().contains(select.getFirstSelectedOption().getText()));
    }

    public void testarTextareaSugestoes(){
        driver.findElement(By.id("elementosForm:sugestoes")).sendKeys("Estudar Mais");
    }

    public void validarTextareaSugestoes() {
        Assert.assertEquals("Estudar Mais", driver.findElement((By.id("elementosForm:sugestoes"))).getAttribute("value"));
    }

    public void testarBotaoCadastrar() {
        driver.findElement(By.id("elementosForm:cadastrar")).click();
    }

    public void validarBotaoCadastrar() {
//        driver.findElement(By.id("elementosForm:cadastrar")).click();
        Assert.assertTrue(driver.findElement(By.id("informacao")).getText().contains("Cadastrado!"));
    }

    public void validarNomeObrigatorio(){
        Alert alerta = driver.switchTo().alert();
//        driver.findElement(By.id("elementosForm:nome")).sendKeys();
        WebElement campoNome = driver.findElement(By.id("elementosForm:nome"));
        String valorCampoNome = campoNome.getAttribute("value");
        Assert.assertTrue(valorCampoNome.isEmpty());
        Assert.assertEquals("O campo Nome é obrigatório", alerta.getText());

//        Alert alerta = driver.switchTo().alert();
//        Assert.assertEquals("O campo Nome é obrigatório", alerta.getText());
//        alerta.accept();
//        WebElement campoNome = driver.findElement(By.id("elementosForm:nome"));
//        String valorCampoNome = campoNome.getAttribute("value");
//        Assert.assertTrue(valorCampoNome.isEmpty());
//        WebElement mensagemErro = driver.findElement(By.id("mensagemNome"));
//        Assert.assertEquals("O campo Nome é obrigatório!", mensagemErro.getText());


    }

    public void validarSobrenomeObrigatorio(){
//        alert = driver.switchTo().alert();
//        Assert.assertEquals(alert.getText(), "O campo Sobrenome é obrigatório");
//        alert.accept();
//        driver.findElement(By.id("elementosForm:sobrenome")).sendKeys("");
//        WebElement campoNome = driver.findElement(By.id("elementosForm:sobrenome"));
//        String valorCampoNome = campoNome.getAttribute("value");
//        Assert.assertTrue(valorCampoNome.isEmpty());

        driver.findElement(By.id("elementosForm:sobrenome")).sendKeys("");
        Alert alerta = driver.switchTo().alert();
        Assert.assertEquals("O campo Sobrenome é obrigatório", alerta.getText());
        alerta.accept();
    }

    public void validarSexoObrigatorio(){
//        alert = driver.switchTo().alert();
//        Assert.assertEquals(alert.getText(), "Escolher Sexo é obrigatório");
//        alert.accept();
//        driver.findElement(By.id("elementosForm:sexo")).sendKeys("");
//
//        WebElement campoNome = driver.findElement(By.id("elementosForm:sexo"));
//        String valorCampoNome = campoNome.getAttribute("value");
//        Assert.assertTrue(valorCampoNome.isEmpty());

        driver.findElement(By.id("elementosForm:sexo")).sendKeys("");
        Alert alerta = driver.switchTo().alert();
        Assert.assertEquals("O campo Sexo é obrigatório", alerta.getText());
        alerta.accept();

    }

}
