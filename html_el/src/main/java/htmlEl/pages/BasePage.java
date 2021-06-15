package htmlEl.pages;

import htmlEl.config.WaitConfiguration;
import htmlEl.config.WaitUtils;
import htmlEl.config.WebDriverConfig;
import htmlEl.decorator.HtmlElementDecorator;
import htmlEl.decorator.HtmlElementLocatorFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;


import java.util.concurrent.TimeUnit;

public abstract class BasePage {
    public BasePage() {
        WaitConfiguration waitConfiguration = new WaitConfiguration.Builder()
                .setDefaultImplicitTimeUnit(TimeUnit.SECONDS)
                .setDefaultImplicitTimeout(3)
                .setDefaultExplicitTimeout(3)
                .build();
        WaitUtils.setWaitConfiguration(waitConfiguration);
        PageFactory.initElements(new HtmlElementDecorator(new HtmlElementLocatorFactory(getWebDriver())), this);

    }

    public BasePage open() {
        getWebDriver().get(getUrl());
        return this;
    }

    public abstract String getUrl();

    public WebDriver getWebDriver() {
        return WebDriverConfig.getWebDriver();
    }

}
