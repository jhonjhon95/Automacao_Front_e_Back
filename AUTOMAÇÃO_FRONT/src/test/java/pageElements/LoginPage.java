package pageElements;

import browser.Waits;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
    private final WebDriver driver;
    private final Waits waits;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
        this.waits = new Waits(this.driver);
    }

    public WebElement MaisSolucoes() {
        return driver.findElement(By.xpath("/html/body/header/section/div/nav/ul/li[2]/span"));
    }

    public WebElement SolTef() {
        return driver.findElement(By.xpath("/html/body/header/section/div/nav/ul/li[2]/ul/li[1]/ul/li[1]/a/div/h4"));
    }

    public WebElement TextSolTef() {
        return driver.findElement(By.xpath("//*[contains(text(), 'Maior praticidade no pagamento para seus clientes, melhor eficiência em gestão para o seu negócio')]"));
    }
}
