package htmlEl.pages;

import htmlEl.decorator.HtmlElementDecorator;
import htmlEl.decorator.HtmlElementLocatorFactory;
import htmlEl.pages.blocks.BuyButton;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static htmlEl.enumeration.PageUrls.PRODUCT_PAGE;

public class ProductPage extends BasePage {
    public ProductPage() {
        PageFactory.initElements(new HtmlElementDecorator(new HtmlElementLocatorFactory(getWebDriver())), this);
    }

    @FindBy(xpath = "(//div[@class='e-carousel']//a)[1]")
    private BuyButton productItemButton;

    @FindBy(xpath = "//div[@class='adidas-brand']")
    private WebElement brand;

    @Override
    public ProductPage open() {
        super.open();
        return this;
    }

    @Override
    public String getUrl() {
        return PRODUCT_PAGE.getPageUrl();
    }

    public void clickOnProductButton() {
        productItemButton.clickOnItemButton();
    }

    public boolean isBrandDisplayed() {
        return brand.isDisplayed();
    }
}
