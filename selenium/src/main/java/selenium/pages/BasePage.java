package selenium.pages;

import org.openqa.selenium.WebDriver;
import selenium.config.WaitConfiguration;
import selenium.config.WebDriverConfiguration;
import selenium.utils.WaitUtils;

import java.util.concurrent.TimeUnit;

public abstract class BasePage {
    public BasePage() {
        WaitConfiguration waitConfiguration = new WaitConfiguration.Builder()
                .setDefaultImplicitTimeUnit(TimeUnit.SECONDS)
                .setDefaultImplicitTimeout(3)
                .setDefaultExplicitTimeout(3)
                .build();

        WaitUtils.setWaitConfiguration(waitConfiguration);

    }

    public BasePage open() {
        getWebDriver().get(getUrl());
        return this;
    }

    public WebDriver getWebDriver() {
        return WebDriverConfiguration.getWebDriver();
    }

    public abstract String getUrl();
}
