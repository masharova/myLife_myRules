package impl;

import htmlEl.pages.CheckoutPage;
import htmlEl.pages.ItemPage;
import org.junit.Assert;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class ItemPageTest extends BaseTest{
    @Test
    @DisplayName("Verify ability to add item to cart")
    public void addItemInCart(){
        storage
                .getPage(ItemPage.class)
                .open()
                .addProductToCart();
        boolean actual = storage.getPage(CheckoutPage.class).open().isDisplayedTitleOnCart();
        Assert.assertTrue("The item has not been added to the cart",actual);
    }
}
