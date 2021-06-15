package htmlEl.pages;

import htmlEl.decorator.HtmlElementDecorator;
import htmlEl.decorator.HtmlElementLocatorFactory;
import htmlEl.element.HtmlElement;
import htmlEl.pages.blocks.SearchField;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static htmlEl.enumeration.PageUrls.HOME_PAGE;

public class HomePage extends BasePage{

    public HomePage(){
        PageFactory.initElements(new HtmlElementDecorator(new HtmlElementLocatorFactory(getWebDriver())),this);
    }

    @FindBy(xpath = "//div[@class='header-content__search-wrapper']//input[@class='header-search__input']")
    private SearchField searchField;

    @Override
    public HomePage open(){
        super.open();
        return this;
    }

    @Override
    public String getUrl(){
        return HOME_PAGE.getPageUrl();
    }

    public void searchProducts(String text){
        searchField.inputTextToSearchField(text);
    }

}
