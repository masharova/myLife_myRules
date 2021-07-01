package api;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import selenium.config.WebDriverConfiguration;
import selenium.utils.PageStorage;

public class BaseTest {

    protected PageStorage storage;
    protected WebDriver driver;

    @BeforeMethod
    public void initDriver() {
        driver = WebDriverConfiguration.setWebDriver();
        storage = new PageStorage();
    }
    @AfterMethod
    public void tearDown(){
        WebDriverConfiguration.clearCookies();
        WebDriverConfiguration.tearDown();
    }
}
