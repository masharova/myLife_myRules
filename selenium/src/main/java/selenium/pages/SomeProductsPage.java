package selenium.pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import selenium.utils.WaitUtils;

import static selenium.enumeration.PageUrls.SOME_PRODUCTS_PAGE;

public class SomeProductsPage extends BasePage {
    public SomeProductsPage() {
        PageFactory.initElements(getWebDriver(), this);
    }

    @FindBy(xpath = "//div[@data-product-id='3296958']/descendant::button")
    private WebElement buyButtonFirstProduct;

    @FindBy(xpath = "//div[@data-product-id='3296624']/descendant::button")
    private WebElement buyButtonSecondProduct;

    @FindBy(xpath = "//button[@class='comeback']")
    private WebElement comebackButton;

    @FindBy(xpath = "//li[@class='main-header__item cart']")
    private WebElement cart;

    @FindBy(xpath = "//div[@class='products__list']")
    private WebElement productList;

    public WebElement getFirstItemInCart() {
        return firstItemInCart;
    }

    @FindBy(xpath = "//li[@data-product-id='3297004']")
    private WebElement firstItemInCart;

    public WebElement getSecondItemInCart() {
        return secondItemInCart;
    }

    @FindBy(xpath = "//li[@data-product-id='3296662']")
    private WebElement secondItemInCart;

    @Override
    public SomeProductsPage open() {
        super.open();
        return this;
    }

    @Override
    public String getUrl() {
        return SOME_PRODUCTS_PAGE.getPageUrl();
    }

    public SomeProductsPage isProductsAdded() {
        buyButtonFirstProduct.click();
        WaitUtils.explicitWait(comebackButton);
        comebackButton.click();
        WaitUtils.explicitWait(buyButtonSecondProduct);
        buyButtonSecondProduct.click();
        WaitUtils.explicitWait(comebackButton);
        comebackButton.click();
        WaitUtils.explicitWait(cart);
        cart.click();
        return this;
    }
}
