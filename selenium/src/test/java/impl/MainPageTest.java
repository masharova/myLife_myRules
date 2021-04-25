package impl;

import api.BaseTest;
import org.junit.Assert;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import selenium.excrptions.ValidationExceptions;
import selenium.pages.MainPage;
import selenium.pages.ResultPage;

public class MainPageTest extends BaseTest {
    @Test
    @DisplayName("Verify ability to enter words in the input field")
    public void isEnterWords() {
        storage
                .getPage(MainPage.class)
                .open()
                .isEnterText("lg");
        String actual = storage.getPage(ResultPage.class).open().getTitle().getText();
        Assert.assertTrue("Page is different!", actual.equals("Результати пошуку для 'lg'"));
    }

    @Test
    @DisplayName("Verify change theme")
    public void isThemeChanged() {
        storage
                .getPage(MainPage.class)
                .open()
                .switchTheme();
        boolean actual = storage.getPage(MainPage.class).getSwitcherToggle().getAttribute("class").contains("active");
        Assert.assertTrue("Theme is not changed!",actual);
    }
}
