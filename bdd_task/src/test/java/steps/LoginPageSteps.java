package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import page.LoginPage;

public class LoginPageSteps {

    private LoginPage loginPage;

    public LoginPageSteps() {
        this.loginPage = new LoginPage();
    }

    @Given("Github login page is opened")
    public void githubHomePageIsOpened() {
        loginPage.openLoginPage();
    }

    @When("user enters {} into email field")
    public void userEntersValueIntoEmailField(String text) {
        this.loginPage.entersValueInEmailField(text);
    }

    @Then("red error sign inside the email field should be displayed")
    public void redErrorSignInsideTheEmailFieldShouldBeDisplayed() {
        Assert.assertTrue("Red error single isn't display", loginPage.isErrorSingDisplayed());
    }

    @And("error message below email field should be displayed")
    public void errorMessageBelowEmailFieldShouldBeDisplayed() {
        loginPage.checkErrorPopupDisplay();
    }

    @Given("Github login page is opened 1")
    public void githubLoginPageIsOpenedForSecondScenario() {
        loginPage.openLoginPage();
    }

    @When("user enters {} into password field")
    public void userEntersValueIntoPasswordField(String text) {
        loginPage.entersValueInPasswordField(text);
    }

    @Then("“at least fifteen characters” message should be marked red")
    public void atLeastFifteenCharactersMessageShouldBeMarkedRed() {
        Assert.assertTrue(loginPage.isLeastCharactersMessageChangedToClassFromColorRed());
    }

    @And("“a lowercase letter” message should be marked red")
    public void aLowercaseLetterMessageShouldBeMarkedRed() {
        Assert.assertTrue(loginPage.isLowercaseMessageChangedToClassFromColorRed());
    }

    @When("user enters {} into password field again")
    public void userEntersInvalidIntoPasswordFieldAgain(String text) { //e
        loginPage.entersValueInPasswordField(text);
    }

    @Then("“at least fifteen characters” message should be marked red again")
    public void atLeastFifteenCharactersMessageShouldBeMarkedRedAgain() {
        Assert.assertTrue(loginPage.isLeastCharactersMessageChangedToClassFromColorRed());
    }

    @And("“a lowercase letter” message should be marked green")
    public void aLowercaseLetterMessageShouldBeMarkedGreen() {
        Assert.assertTrue(loginPage.isLowercaseMessageChangedToClassFromColorGreen());
    }

    @Given("Github login page is opened 2")
    public void githubLoginPageIsOpened() {
        loginPage.openLoginPage();
    }

    @When("user enters {} already existent username into username field")
    public void userEntersAlreadyExistentUsernameIntoUsernameField(String text) {
        loginPage.entersValueInEmailField(text);
    }

    @Then("red error sign inside username field should be displayed")
    public void redErrorSignInsideUsernameFieldShouldBeDisplayed() {
        Assert.assertTrue(loginPage.isErrorSingDisplayed());
    }

    @And("error message below username field should be displayed")
    public void errorMessageBelowUsernameFieldShouldBeDisplayed() {
        Assert.assertTrue(loginPage.checkErrorPopupDisplay());
    }

    @And("suggested usernames in error message contains the username entered")
    public void suggestedUsernamesInErrorMessageContainsTheUsernameEntered() {
        Assert.assertTrue(loginPage.isMessageContainsUsernameEntered());
    }
}
