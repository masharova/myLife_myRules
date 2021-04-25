package impl;

import api.BaseTest;
import org.junit.Assert;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import selenium.pages.ProductPage;

public class ProductPageTest extends BaseTest {
    @Test
    @DisplayName("Verify product page")
    public void isProductPageCorrect(){
        storage
                .getPage(ProductPage.class)
                .open()
                .isBuyButtonClick();
        String actualBreadcrumbs = storage.getPage(ProductPage.class).getBreadcrumbs().getText();
        Assert.assertTrue("Different breadcrumbs!",actualBreadcrumbs.contains("LG 75UN71006LC Black (У1)"));

        String actualTitleOnPopup = storage.getPage(ProductPage.class).getTitleOnPopup().getText();
        Assert.assertTrue("",actualTitleOnPopup.contains("LG 75UN71006LC Black (У1)"));
    }
}
