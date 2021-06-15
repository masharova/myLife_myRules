package task.pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;

import static com.codeborne.selenide.Selenide.$x;

public class MainPage {
    private static final String MAIN_PAGE_URL = "https://allo.ua/";
    private static final String ITEM_FROM_DROP_DOWN = "//a[@title='lg']";
    private static final String SWITCHER_TOGGLE = "//span[@class='switcher-enabled active']";
    private static final String INPUT_SEARCH_FIELD = "//input[@id='search-form__input']";

    public void openMainPage() {
        Selenide.open(MAIN_PAGE_URL);
    }

    public void enterWordsInSearchField() {
        $x(INPUT_SEARCH_FIELD).sendKeys("lg");
        $x(INPUT_SEARCH_FIELD).click();
        $x(ITEM_FROM_DROP_DOWN).shouldBe(Condition.visible);
        $x(ITEM_FROM_DROP_DOWN).click();
    }

    public boolean isSwitchTheme() {
        $x(SWITCHER_TOGGLE).click();
        return $x(SWITCHER_TOGGLE).getAttribute("class").contains("active");
    }
}
