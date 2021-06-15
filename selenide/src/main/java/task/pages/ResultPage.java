package task.pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;

import static com.codeborne.selenide.Selenide.$x;


public class ResultPage {
    private static final String RESULT_PAGE_URL = "https://allo.ua/ua/catalogsearch/result/?q=lg";
    private static final String CHECKBOX = "//a[@href='https://allo.ua/ua/catalogsearch/result/index/markdown-da/?q=lg']";
    private static final String BUTTON_FOR_CHECKBOX = "//button[@class='filter-popup__button']";
    private static final String PRODUCT = "//div[@data-product-id='6207442']";
    private static final String LIST_OF_PRODUCTS = "//div[@class='v-catalog__products']";
    private static final String TITLE = "//span[contains(text(),'LG')]";

    public boolean isTitleDisplayed() {
        return $x(TITLE).isDisplayed();
    }

    public void openResultPage() {
        Selenide.open(RESULT_PAGE_URL);
    }

    public void checkBoxSelected() {
        Selenide.$x(CHECKBOX).click();
        Selenide.$x(BUTTON_FOR_CHECKBOX).shouldHave(Condition.visible);
        Selenide.$x(BUTTON_FOR_CHECKBOX).click();
        Selenide.$$x(LIST_OF_PRODUCTS).shouldHaveSize(28);
        Selenide.$x(PRODUCT).shouldHave(Condition.visible);
        Selenide.$x(PRODUCT).click();
    }
}
