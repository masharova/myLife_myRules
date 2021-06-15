package impl;

import htmlEl.config.PageStorage;
import htmlEl.config.WebDriverConfig;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.openqa.selenium.WebDriver;

@RunWith(JUnit4.class)
public class BaseTest {
    protected PageStorage storage;
    protected WebDriver driver;

    @BeforeEach
    public void initDriver(){
        driver = WebDriverConfig.setWebDriver();
        storage = new PageStorage();
    }

    @AfterEach
    public void tearDown(){
        WebDriverConfig.clearCookies();
        WebDriverConfig.tearDown();
    }
}
