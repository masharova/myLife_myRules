package selenium.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import selenium.utils.WaitUtils;

import static selenium.enumeration.PageUrls.RESULT_PAGE;

public class ResultPage extends BasePage{
    public ResultPage(){
        PageFactory.initElements(getWebDriver(),this);
    }

    @FindBy(xpath = "//h1[contains(text(),'lg')]")
    private WebElement title;

    @FindBy(xpath = "//a[@href='https://allo.ua/ua/catalogsearch/result/index/markdown-da/?q=lg']")
    private WebElement checkBox;

    @FindBy(xpath = "//button[@class='filter-popup__button']")
    private WebElement buttonForCheckBox;

    @FindBy(xpath = "//div[@data-product-id='6207448']")
    private WebElement product;

    public WebElement getTitle() {
        return title;
    }


    @Override
    public String getUrl(){return RESULT_PAGE.getPageUrl();}
    @Override
    public ResultPage open(){
        super.open();
        return this;
    }
    public ResultPage isCheckBoxClicked(){
        checkBox.click();
        WaitUtils.explicitWait(buttonForCheckBox);
        buttonForCheckBox.click();
        WaitUtils.explicitWait(product);
        product.click();
        return this;
    }


}
