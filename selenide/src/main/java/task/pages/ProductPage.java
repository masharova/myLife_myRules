package task.pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.*;

public class ProductPage {
    private static final String PRODUCT_PAGE_URL = "https://allo.ua/ua/televizory/xiaomi-mi-tv-uhd-4s-65-eu-u1_31.html";
    private static final String BUY_BUTTON = "//button[@id='product-buy-button']";
    private static final String COME_BACK_BUTTON = "//button[@class='comeback']";
    private static final String CART = "//li[@class = 'main-header__item cart']";
    private static final String TITLE_ON_POPUP = "//span[@class='wrap']";

    public void openProductPage() {
        Selenide.open(PRODUCT_PAGE_URL);
    }

    public void addProductToCart() {
        $x(BUY_BUTTON).click();
        $x(COME_BACK_BUTTON).should(Condition.exist);
        $x(COME_BACK_BUTTON).click();
    }

    public boolean isProductAddedToCart() {
        $x(CART).click();
        return $x(TITLE_ON_POPUP).getText().contains("49 LG 49UN71006LB Black (У1)");
    }
}
