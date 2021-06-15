package testPage;

import org.junit.*;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import task.pages.SomeProductsPage;

@RunWith(JUnit4.class)
public class SomeProductPageTest {
    @Test
    public void isAddedSomeProductsToCartAndDisplayedInCart() {
        SomeProductsPage someProductsPage = new SomeProductsPage();
        someProductsPage.openSomeProductsPage();
        someProductsPage.addTwoFirstProductsToCart();

        Assert.assertTrue("Cart is not contains selected products!",
                someProductsPage.isTwoProductsInCartAndDisplayedInCart());
    }

}
