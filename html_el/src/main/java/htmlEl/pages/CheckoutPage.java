package htmlEl.pages;

import htmlEl.config.WaitUtils;
import htmlEl.decorator.HtmlElementDecorator;
import htmlEl.decorator.HtmlElementLocatorFactory;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static htmlEl.enumeration.PageUrls.CHECKOUT_PAGE;

public class CheckoutPage extends BasePage{
    public CheckoutPage(){
        PageFactory.initElements(new HtmlElementDecorator(new HtmlElementLocatorFactory(getWebDriver())),this);
    }
    @FindBy(xpath = "//a[@href='https://www.eobuv.com/obuv-adidas-runfalcon-2-0-k-fy5899-gretwo-crenav-halsil.html' ]//div[@class='cart-item__name-second']")
    private WebElement title;

    public boolean isDisplayedTitleOnCart(){
        WaitUtils.implicitWait(getWebDriver());
        title.isDisplayed();
        return true;
    }

    @Override
    public CheckoutPage open(){
        super.open();
        return this;
    }
    @Override
    public String getUrl(){
        return CHECKOUT_PAGE.getPageUrl();
    }
}
