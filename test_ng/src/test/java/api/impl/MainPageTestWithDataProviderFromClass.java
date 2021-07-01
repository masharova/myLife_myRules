package api.impl;

import api.BaseTest;
import api.MyDataProvider;
import org.testng.Assert;
import org.testng.annotations.Test;
import selenium.pages.MainPage;
import selenium.pages.ResultPage;

public class MainPageTestWithDataProviderFromClass extends BaseTest {

    @Test(dataProvider = "data-provider",dataProviderClass = MyDataProvider.class)
    public void verifyEnteringToSearchFieldUseDataProvider(String text){
        storage
                .getPage(MainPage.class)
                .open()
                .isEnterWordsInSearchField(text);
        String actual = storage.getPage(ResultPage.class).open().getTitle().getText();
        Assert.assertTrue(actual.equals("Результати пошуку для 'lg'"),"Page is different!");
    }
}
