package suiteTest;

import browser.TestBase;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import pageTask.LoginTask;

@Tag("REGRESSAO")
public class TransferBetweenTwoAccountsTest extends TestBase {

    private final WebDriver driver = getDriver();

    private final LoginTask loginTask = new LoginTask(driver);


    @DisplayName("Deve realizar a transferência entre contas com sucesso")
    @Test
    public void transferBetweenTwoAccounts() {

        loginTask.clickMaisSolucoes();
        loginTask.clickSolTef();
        loginTask.ValidaTextSolTef();

    }

}
