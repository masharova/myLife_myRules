package impl;

import htmlEl.pages.ItemPage;
import htmlEl.pages.ProductPage;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class ProductPageTest extends BaseTest{
    @Test
    @DisplayName("Verify ability go to item page")
    public void goToProductPage(){
        storage
                .getPage(ProductPage.class)
                .open()
                .clickOnProductButton();
        boolean actual = storage.getPage(ItemPage.class).open().getItemTitle().getAttribute("class")
                .contains("Runfalcon 2.0 K FY5899 Gretwo/Crenav/Halsil");
        Assertions.assertTrue(actual, "Item is different!");
    }
}
