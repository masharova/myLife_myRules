package selenium.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import selenium.excrptions.ValidationExceptions;
import selenium.utils.WaitUtils;

import static selenium.enumeration.PageUrls.MAIN_PAGE;

public class MainPage extends BasePage {

    public MainPage(){
        PageFactory.initElements(getWebDriver(),this);
    }
    @FindBy(xpath = "//input[@id='search-form__input']")
    private WebElement inputField;

    @FindBy(xpath = "//a[@title='lg']")
    private WebElement itemFromDropDown;

    public WebElement getSwitcherToggle() {
        return switcherToggle;
    }

    @FindBy(xpath = "//span[@class='switcher-enabled active']")
    private WebElement switcherToggle;

    @Override
    public MainPage open(){
        super.open();
        return this;
    }
    @Override
    public String getUrl(){return MAIN_PAGE.getPageUrl();}

    public MainPage isEnterText(String text){
        inputField.sendKeys(text);
        inputField.click();
        WaitUtils.explicitWait(itemFromDropDown);
        itemFromDropDown.click();
        return this;

    }
    public MainPage switchTheme() {
        switcherToggle.click();
        WaitUtils.implicitWait(getWebDriver());
        return this;
   }
}
