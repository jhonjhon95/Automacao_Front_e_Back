package browser;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

import org.openqa.selenium.WebDriver;



public class TestBase {
    private static WebDriver driver;

    public static WebDriver getDriver() {
        driver = DriverFactory.getOrCreateDriver(Browser.CHROME);
        return driver;
    }


    @BeforeEach
    public void setupDriver() {

        driver.get("https://site.getnet.com.br/");
    }

    @AfterEach
    public void teardown() {
        if (driver != null) {
            DriverFactory.quitDriver();
        }
    }
}
