package util;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Componentes {
    private WebDriver driver;

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
        driver.quit();
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

    public void testarTextfield(){
        driver.findElement(By.id("elementosForm:nome")).sendKeys("Batatinha");
    }

    public void validarTextfield(){
        Assert.assertEquals("Batatinha", driver.findElement((By.id("elementosForm:nome"))).getAttribute("value"));
    }

    public void fecharComponentes(){
        driver.quit();
    }

    public void testarTextarea(){
        driver.findElement(By.id("elementosForm:sugestoes")).sendKeys("Batatinha1\n\nBatatinha2");
    }

    public void validarTextarea() {
        Assert.assertEquals("Batatinha1\n\nBatatinha2", driver.findElement((By.id("elementosForm:sugestoes"))).getAttribute("value"));
    }

    public void testarRadioButton(){
        driver.findElement(By.id("elementosForm:sexo:0")).click();
    }

    public void validarRadioButton(){
        Assert.assertTrue(driver.findElement(By.id("elementosForm:sexo:0")).isSelected());
    }

    public void validarCheckbox() {
        Assert.assertTrue(driver.findElement(By.id("elementosForm:comidaFavorita:0")).isSelected());
    }

    public void testarCheckbox() {
        driver.findElement(By.id("elementosForm:comidaFavorita:0")).click();
    }
}
