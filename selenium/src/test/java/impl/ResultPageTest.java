package impl;

import api.BaseTest;
import org.junit.Assert;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import selenium.pages.ResultPage;

public class ResultPageTest extends BaseTest {
    @Test
    @DisplayName("Verify filter")
    public void isFiltered(){
        storage
                .getPage(ResultPage.class)
                .open()
                .isCheckBoxClicked();
        String actual = storage.getPage(ResultPage.class).getTitle().getText();
        Assert.assertTrue("Title is different!",actual.contains("Результати пошуку для 'lg'"));
    }
}
