package testPage;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import task.pages.ProductPage;

@RunWith(JUnit4.class)
public class ProductPageTest {

    @Test
    public void isAddedProductToCartAndDisplayedToCart() {
        ProductPage productPage = new ProductPage();
        productPage.openProductPage();
        productPage.addProductToCart();

        Assert.assertTrue("The item has not been added to the cart!",productPage.isProductAddedToCart());
    }

}
