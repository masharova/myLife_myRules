package htmlEl.pages;

import htmlEl.decorator.HtmlElementDecorator;
import htmlEl.decorator.HtmlElementLocatorFactory;
import htmlEl.pages.blocks.BuyButton;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static htmlEl.enumeration.PageUrls.ITEM_PAGE;

public class ItemPage extends BasePage {
    public ItemPage() {
        PageFactory.initElements(new HtmlElementDecorator(new HtmlElementLocatorFactory(getWebDriver())), this);
    }

    @FindBy(xpath = "//button[@data-testid='product-add-to-cart-button']")
    private BuyButton buyButton;


    @FindBy(xpath = "//section[@class='product-view__group']//div[@class='e-product-name__model']")
    private WebElement itemTitle;

    public WebElement getItemTitle() {
        return itemTitle;
    }

    @Override
    public ItemPage open() {
        super.open();
        return this;
    }

    @Override
    public String getUrl() {
        return ITEM_PAGE.getPageUrl();
    }

    public void addProductToCart() {
        buyButton.addItemToCart();
    }
}
