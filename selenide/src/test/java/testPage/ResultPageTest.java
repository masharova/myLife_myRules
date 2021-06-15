package testPage;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import task.pages.ProductPage;
import task.pages.ResultPage;

@RunWith(JUnit4.class)
public class ResultPageTest {
    @Test
    public void isCheckBoxFilteringCorrect() {
        ResultPage resultPage = new ResultPage();
        resultPage.openResultPage();
        resultPage.checkBoxSelected();

        Assert.assertTrue("Page is not opened!",resultPage.isTitleDisplayed());
    }

}
