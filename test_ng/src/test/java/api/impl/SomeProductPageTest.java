package api.impl;

import api.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import selenium.pages.SomeProductsPage;
import selenium.utils.WaitUtils;

public class SomeProductPageTest extends BaseTest {

    @Test
    public void isAddSomeProducts(){
        storage
                .getPage(SomeProductsPage.class)
                .open()
                .addedProductsInCart();
        WaitUtils.implicitWait(storage.getPage(SomeProductsPage.class).getWebDriver());
        boolean actual = storage.getPage(SomeProductsPage.class).getFirstItemInCart().isDisplayed()||storage.getPage(SomeProductsPage.class)
                .getSecondItemInCart().isDisplayed();
        Assert.assertTrue(actual);
    }
}
