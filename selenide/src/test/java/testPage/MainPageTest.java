package testPage;

import org.junit.*;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import task.pages.MainPage;
import task.pages.ResultPage;

@RunWith(JUnit4.class)
public class MainPageTest extends BaseTest {

    @Test
    public void isEnterWordsInSearchFieldAndRedirectOnResultPage() {
        MainPage mainPage = new MainPage();
        mainPage.openMainPage();
        mainPage.enterWordsInSearchField();
        ResultPage resultPage = new ResultPage();

        Assert.assertTrue("Invalid page after search!", resultPage.isTitleDisplayed());
    }

    @Test
    public void isThemeChanged() {
        MainPage mainPage = new MainPage();
        mainPage.openMainPage();

        Assert.assertTrue("Theme is not switched!", mainPage.isSwitchTheme());
    }
}
