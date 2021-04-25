package impl;

import api.BaseTest;
import org.junit.Assert;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import selenium.pages.SomeProductsPage;
import selenium.utils.WaitUtils;

public class SomeProductPageTest extends BaseTest {
    @Test
    @DisplayName("Verify add to cart some products")
    public void isAddSomeProducts() {
        storage
                .getPage(SomeProductsPage.class)
                .open()
                .isProductsAdded();
        WaitUtils.implicitWait(storage.getPage(SomeProductsPage.class).getWebDriver());
        boolean actual = storage.getPage(SomeProductsPage.class).getFirstItemInCart().isDisplayed()||storage.getPage(SomeProductsPage.class)
            .getSecondItemInCart().isDisplayed();
        Assert.assertTrue("Cart is not contains selected products!",actual);

    }

}
