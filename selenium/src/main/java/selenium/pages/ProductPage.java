package selenium.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import selenium.utils.WaitUtils;

import static selenium.enumeration.PageUrls.PRODUCT_PAGE;

public class ProductPage extends BasePage{
    public ProductPage (){
        PageFactory.initElements(getWebDriver(),this);
    }

    @FindBy(xpath = "//span[contains(text(),'LG 75UN71006LC Black (У1)')]")
    private WebElement breadcrumbs;

    @FindBy(xpath = "//button[@id='product-buy-button']")
    private WebElement buyButton;

    @FindBy(xpath = "//span[@class='wrap']")
    private WebElement titleOnPopup;

    @FindBy(xpath = "//button[@class='comeback']")
    private WebElement comebackButton;

    public WebElement getBreadcrumbs() {
        return breadcrumbs;
    }

    public WebElement getTitleOnPopup() {
        return titleOnPopup;
    }


    @Override
    public ProductPage open(){
        super.open();
        return this;
    }
    @Override
    public String getUrl(){
        return PRODUCT_PAGE.getPageUrl();
    }

    public ProductPage isBuyButtonClick(){
        buyButton.click();
        WaitUtils.explicitWait(comebackButton);
        comebackButton.click();
        return this;

    }
}
