package api;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.openqa.selenium.WebDriver;
import selenium.config.WebDriverConfiguration;
import selenium.enumeration.SupportedDrivers;
import selenium.utils.PageStorage;

@RunWith(JUnit4.class)
public class BaseTest {
    protected PageStorage storage;
    protected WebDriver driver;

    @BeforeEach
    public void initDriver(){
        driver = WebDriverConfiguration.setWebDriver(SupportedDrivers.CHROME);
        storage = new PageStorage();
    }
    @AfterEach
    public void tearDown(){
        WebDriverConfiguration.clearCookies();
        WebDriverConfiguration.tearDown();
    }

}
