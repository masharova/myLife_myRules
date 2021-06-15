package task.pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

public class SomeProductsPage {
    private static final String SOME_PRODUCTS_PAGE_URL = "https://allo.ua/ua/televizory/proizvoditel-lg/";
    private static final String BUY_BUTTON_FIRST_ELEMENT = "//div[@data-product-id='3296958']/descendant::button";
    private static final String BUY_BUTTON_SECOND_ELEMENT = "//div[@data-product-id='3295413']/descendant::button";
    private static final String COMEBACK_BUTTON = "//button[@class='comeback']";
    private static final String CART = "//li[@class='main-header__item cart']";
    private static final String FIRST_ITEM_IN_CART = "//li[@data-product-id='3297004']";
    private static final String SECOND_ITEM_IN_CART = "//li[@data-product-id='3295430']";

    public void openSomeProductsPage() {
        Selenide.open(SOME_PRODUCTS_PAGE_URL);
    }

    public void addTwoFirstProductsToCart() {
        $x(BUY_BUTTON_FIRST_ELEMENT).click();
        $x(COMEBACK_BUTTON).should(Condition.exist);
        $x(COMEBACK_BUTTON).click();
        $x(BUY_BUTTON_FIRST_ELEMENT).should(Condition.exist);
        $x(BUY_BUTTON_SECOND_ELEMENT).click();
        $x(COMEBACK_BUTTON).should(Condition.exist);
        $x(COMEBACK_BUTTON).click();
    }

    public boolean isTwoProductsInCartAndDisplayedInCart() {
        $x(CART).should(Condition.exist);
        $x(CART).click();
        return $x(FIRST_ITEM_IN_CART).isDisplayed()&$x(SECOND_ITEM_IN_CART).isDisplayed();
    }
}
