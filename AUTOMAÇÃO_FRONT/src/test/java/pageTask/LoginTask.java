package pageTask;

import browser.Waits;
import org.openqa.selenium.WebDriver;
import pageElements.LoginPage;



public class LoginTask {

    private final WebDriver driver;
    private final Waits waits;
    private final LoginPage loginPage;


    public LoginTask(WebDriver driver) {
        this.driver = driver;
        this.waits = new Waits(this.driver);
        this.loginPage = new LoginPage(this.driver);

    }

    public void clickMaisSolucoes() {
        waits.loadElement(loginPage.MaisSolucoes());
        loginPage.MaisSolucoes().click();
    }

    public void clickSolTef() {
        waits.loadElement(loginPage.SolTef());
        loginPage.SolTef().click();
    }

    public void ValidaTextSolTef() {
        waits.loadElement(loginPage.TextSolTef());
        loginPage.TextSolTef().isDisplayed();
    }
}
