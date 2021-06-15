package htmlEl.pages.blocks;

import htmlEl.config.WaitUtils;
import htmlEl.element.Button;
import htmlEl.element.HtmlElement;
import htmlEl.element.TextInput;
import org.openqa.selenium.support.FindBy;

import static htmlEl.config.WebDriverConfig.getWebDriver;

public class SearchField extends HtmlElement {

    @FindBy(xpath = "//div[@class='header-content__search-wrapper']//input[@class='header-search__input']")
    private TextInput searchField;

    @FindBy(xpath = "//div[@class='header-content__search-wrapper']//button[@type='submit']")
    private Button searchButton;

    public void inputTextToSearchField(String text){
        searchField.sendKeys(text);
        WaitUtils.implicitWait(getWebDriver());
        searchButton.click();
    }

}
