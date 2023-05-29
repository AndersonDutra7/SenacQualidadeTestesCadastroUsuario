package util;

import org.junit.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
//import FormularioFinal;

public class Componentes extends FormularioFinal{
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
        try{
            Assert.assertEquals("Anderson", driver.findElement((By.id("elementosForm:nome"))).getAttribute("value"));
        } catch (UnhandledAlertException e){
            Alert msg = driver.switchTo().alert();
            Assert.assertEquals(msg.getText(), "Nome eh obrigatorio");
            msg.dismiss();
        }

    }

//    public void validarTextfieldNome() {
//        try {
//            this.testarTextfieldNome();
//            driver.findElement(By.id("elementosForm:cadastrar")).click();
//            Assert.assertEquals("Anderson", driver.findElement((By.id("elementosForm:nome"))).getAttribute("value"));
//
//            Alert alert = driver.switchTo().alert();
//            String alertMessage = alert.getText();
//
//            if (alertMessage.equals("Sobrenome eh obrigatorio")) {
//                this.testarTextfieldSobrenome();
//                System.out.println("Sobrenome é obrigatório");
//                alert.accept(); // Aceitar a janela de alerta
//            } else if (alertMessage.equals("Sexo eh obrigatorio")) {
//                this.testarRadioButtonSexo();
//                System.out.println("Sexo é obrigatório");
//                alert.accept(); // Aceitar a janela de alerta
//            } else {
//                 O campo Nome foi validado corretamente
//                System.out.println("Campo Nome validado com sucesso");
//            }

//        } catch (NoAlertPresentException e) {
//             Não foi exibida nenhuma janela de alerta
//            System.out.println("Nenhuma janela de alerta encontrada");
//        }
//    }


    public void testarTextfieldSobrenome() {
        driver.findElement(By.id("elementosForm:sobrenome")).sendKeys("Dutra");
    }

    public void validarTextfieldSobrenome() {
        Assert.assertEquals("Dutra", driver.findElement((By.id("elementosForm:sobrenome"))).getAttribute("value"));
    }

    public void testarRadioButtonSexo() {
        driver.findElement(By.id("elementosForm:sexo:0")).click();
    }

    public void validarRadioButtonSexo() {
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

    public void validarSelectEscolaridade() {
        Select select = new Select(driver.findElement(By.id("elementosForm:escolaridade")));
        Assert.assertTrue(driver.findElement(By.id("descEscolaridade")).getText().contains(select.getFirstSelectedOption().getText()));
        WebElement elementoResultado = driver.findElement(By.id("resultado"));
        JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
        jsExecutor.executeScript("arguments[0].innerText = 'Superior';", elementoResultado);
    }

    public void testarSelectEsportes() {
        select = new Select(driver.findElement(By.id("elementosForm:esportes")));
        select.selectByValue("futebol");
    }

    public void validarSelectEsportes() {
        Select select = new Select(driver.findElement(By.id("elementosForm:esportes")));
        Assert.assertTrue(driver.findElement(By.id("descEsportes")).getText().contains(select.getFirstSelectedOption().getText()));
    }

    public void testarTextareaSugestoes() {
        driver.findElement(By.id("elementosForm:sugestoes")).sendKeys("Estudar Mais");
    }

    public void validarTextareaSugestoes() {
        Assert.assertEquals("Estudar Mais", driver.findElement((By.id("elementosForm:sugestoes"))).getAttribute("value"));
    }

    public void testarBotaoCadastrar() {
        try {
            driver.findElement(By.id("elementosForm:cadastrar")).click();
            Alert alert = driver.switchTo().alert();
            String alertMessage = alert.getText();
            this.preencherFormulário();

            if (alertMessage.equals("Nome eh obrigatorio")){
                this.testarTextfieldNome();
                System.out.println("Nome é obrigatório");
                alert.accept(); // Aceitar a janela de alerta
            } else if (alertMessage.equals("Sobrenome eh obrigatorio")) {
                this.testarTextfieldSobrenome();
                System.out.println("Sobrenome é obrigatório");
                alert.accept(); // Aceitar a janela de alerta
            } else if (alertMessage.equals("Sexo eh obrigatorio")) {
                this.testarRadioButtonSexo();
                System.out.println("Sexo é obrigatório");
                alert.accept(); // Aceitar a janela de alerta
            } else {
//                 O campo Nome foi validado corretamente
                System.out.println("Campo Nome validado com sucesso");
            }

        } catch (NoAlertPresentException e) {
//             Não foi exibida nenhuma janela de alerta
            System.out.println("Nenhuma janela de alerta encontrada");
        }
    }

//        }

    public void validarBotaoCadastrar() {
        driver.findElement(By.id("elementosForm:cadastrar")).click();
        Assert.assertTrue(driver.findElement(By.id("resultado")).getText().contains("Cadastrado!"));
    }

    public void validarNomeObrigatorio() {
        Alert msg = driver.switchTo().alert();
        Assert.assertEquals(msg.getText(), "Nome eh obrigatorio");
        msg.accept();

//        Assert.assertEquals("O campo Nome é obrigatório", alerta.getText());
//        alerta.accept();
//        WebElement campoNome = driver.findElement(By.id("elementosForm:nome"));
//        String valorCampoNome = campoNome.getAttribute("value");
//        Assert.assertTrue(valorCampoNome.isEmpty());
//        WebElement mensagemErro = driver.findElement(By.id("mensagemNome"));
//        Assert.assertEquals("O campo Nome é obrigatório!", mensagemErro.getText());


    }

    public void validarSobrenomeObrigatorio() {
        Alert msg = driver.switchTo().alert();
        Assert.assertEquals(msg.getText(), "Sobrenome eh obrigatorio");
        msg.accept();
    }

    public void validarSexoObrigatorio() {
        Alert msg = driver.switchTo().alert();
        Assert.assertEquals(msg.getText(), "Sexo eh obrigatorio");
        msg.accept();

    }

    public void preencherFormulário() {
        Assert.assertTrue(driver.findElement(By.id("resultado")).getText().contains("Cadastrado!"));
        this.testarTextfieldNome();
        this.validarTextfieldNome();
        this.testarTextfieldSobrenome();
        this.validarTextfieldSobrenome();
        this.testarRadioButtonSexo();
        this.validarRadioButtonSexo();
//        driver.findElement(By.id("elementosForm:nome")).sendKeys("Anderson");
//        driver.findElement(By.id("elementosForm:sobrenome")).sendKeys("Dutra");
//        driver.findElement(By.id("elementosForm:sexo:0")).click();
//        driver.findElement(By.id("elementosForm:comidaFavorita:0")).click();
//        select = new Select(driver.findElement(By.id("elementosForm:escolaridade")));
//        select.selectByValue("superior");
//        select = new Select(driver.findElement(By.id("elementosForm:esportes")));
//        select.selectByValue("futebol");
//        driver.findElement(By.id("elementosForm:sugestoes")).sendKeys("Estudar Mais");
//        driver.findElement(By.id("elementosForm:cadastrar")).click();
    }

}
