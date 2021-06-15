package htmlEl.pages;

import htmlEl.decorator.HtmlElementDecorator;
import htmlEl.decorator.HtmlElementLocatorFactory;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static htmlEl.enumeration.PageUrls.CUSTOMER_ACCOUNT;

public class CustomerAccount extends BasePage {
    public CustomerAccount() {
        PageFactory.initElements(new HtmlElementDecorator(new HtmlElementLocatorFactory(getWebDriver())), this);
    }

    @FindBy(xpath = "(//div[@class='col-left']//div)[3]")
    private WebElement customerTitle;

    public WebElement getCustomerTitle() {
        return customerTitle;
    }

    @Override
    public CustomerAccount open() {
        super.open();
        return this;
    }

    @Override
    public String getUrl() {
        return CUSTOMER_ACCOUNT.getPageUrl();
    }
}
