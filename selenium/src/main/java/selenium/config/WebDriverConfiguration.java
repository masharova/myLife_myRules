package selenium.config;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import selenium.enumeration.SupportedDrivers;

public final class WebDriverConfiguration {
    private static WebDriver driverInstance;

    private WebDriverConfiguration() {
        throw new IllegalStateException("This is static class!");
    }

    public static WebDriver setWebDriver(SupportedDrivers driver) {
        if (driverInstance != null) return driverInstance;
        ChromeOptions chromeOptions = new ChromeOptions();
        WebDriverManager.chromedriver().setup();
        driverInstance = new ChromeDriver(chromeOptions);
        return driverInstance;
    }

    public static WebDriver getWebDriver() {
        return driverInstance;
    }

    public static void clearCookies() {
        if (driverInstance != null) driverInstance.manage().deleteAllCookies();
    }

    public static void tearDown() {
        if (driverInstance != null) {
            driverInstance.quit();
            driverInstance = null;
        }
    }
}
