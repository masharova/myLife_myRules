package selenium.utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import selenium.config.WaitConfiguration;
import selenium.config.WebDriverConfiguration;

import java.util.function.Function;

public class WaitUtils {
    private static WaitConfiguration waitConfig;

    public WaitUtils(WaitConfiguration waitConfiguration) {
        waitConfig = waitConfiguration;
    }

    public static void setWaitConfiguration(WaitConfiguration waitConfiguration) {
        waitConfig = waitConfiguration;
    }

    public static void implicitWait(WebDriver driver) {
        driver.manage().timeouts().implicitlyWait(waitConfig.getDefaultImplicitTimeout(), waitConfig.getDefaultImplicitTimeUnit());
    }

    public static <V> void explicitWait(WebElement webElement) {
        WebDriverWait wait = new WebDriverWait(WebDriverConfiguration.getWebDriver(), waitConfig.getDefaultExplicitTimeout());
        wait.until(ExpectedConditions.visibilityOf(webElement));
    }
}
