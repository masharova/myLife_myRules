package api.impl;

import api.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import selenium.pages.ProductPage;

public class ProductPageTest extends BaseTest {

    @Test()
    public void isProductPageCorrect(){
        storage
                .getPage(ProductPage.class)
                .open()
                .isAddProductInCart();
        String actualBreadcrumbs = storage.getPage(ProductPage.class).getBreadcrumbs().getText();
        Assert.assertTrue(actualBreadcrumbs.contains("LG 75UN71006LC Black (У1)"),"Different breadcrumbs!");

        String actualTitleOnPopup = storage.getPage(ProductPage.class).getTitleOnCartPopup().getText();
        Assert.assertTrue(actualTitleOnPopup.contains("LG 75UN71006LC Black (У1)"));

    }

}
