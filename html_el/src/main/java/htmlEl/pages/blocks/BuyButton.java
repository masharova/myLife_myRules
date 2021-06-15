package htmlEl.pages.blocks;

import htmlEl.config.WaitUtils;
import htmlEl.element.Button;
import htmlEl.element.HtmlElement;
import org.openqa.selenium.support.FindBy;

import static htmlEl.config.WebDriverConfig.getWebDriver;

public class BuyButton extends HtmlElement {

    @FindBy(xpath = "//button[@data-testid='product-add-to-cart-button']")
    private Button buyButton;

    @FindBy(xpath = "(//div[@class='e-size-picker__options']//button)[1]")
    private Button sizeButton;

    @FindBy(xpath = "//div[@class='precart-popup__actions']//button")
    private Button comeBackButton;

    @FindBy(xpath = "(//div[@class='e-carousel']//a)[1]")
    private Button itemButton;

    public void addItemToCart(){
        WaitUtils.implicitWait(getWebDriver());
        buyButton.click();
        sizeButton.click();
        comeBackButton.click();

    }
    public void clickOnItemButton(){
        WaitUtils.implicitWait(getWebDriver());
        itemButton.click();
    }
}
