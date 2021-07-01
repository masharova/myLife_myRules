package api.impl;

import api.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import selenium.pages.MainPage;

public class ThemeChangedTest extends BaseTest {

    @Test(priority = 1)
    public void verifyThemeChanging(){
        storage
                .getPage(MainPage.class)
                .open()
                .switchTheme();
        boolean actual = storage.getPage(MainPage.class).getSwitcherToggle().getAttribute("class").contains("active");
        Assert.assertTrue(actual, "Theme is not changed!");
    }
}
