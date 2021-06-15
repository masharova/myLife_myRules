package impl;

import htmlEl.pages.HomePage;
import htmlEl.pages.ProductPage;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class HomePageTest extends BaseTest {
    @Test
    @DisplayName("Verify ability to enter words in the input field")
    public void isEnterWords(){
        storage
                .getPage(HomePage.class)
                .open()
                .searchProducts("adidas");
        boolean actual = storage.getPage(ProductPage.class).open().isBrandDisplayed();
        Assertions.assertTrue(actual, "Invalid search!");
    }
}
