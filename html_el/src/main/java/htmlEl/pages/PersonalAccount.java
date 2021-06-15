package htmlEl.pages;

import htmlEl.decorator.HtmlElementDecorator;
import htmlEl.decorator.HtmlElementLocatorFactory;
import htmlEl.pages.blocks.EnteredField;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static htmlEl.enumeration.PageUrls.PERSONAL_ACCOUNT_PAGE;

public class PersonalAccount extends BasePage {
    public PersonalAccount() {
        PageFactory.initElements(new HtmlElementDecorator(new HtmlElementLocatorFactory(getWebDriver())), this);
    }

    @FindBy(xpath = "//div[@class='input-wrapper account-login__input-wrapper']/child::input")
    private EnteredField emailField;

    @FindBy(xpath = "//div[@class='input-wrapper input-wrapper--type-password account-login__input-wrapper']/child::input")
    private EnteredField passwordField;

    @FindBy(xpath = "//button[@data-testid='login-submit-button']")
    private EnteredField loginButton;

    @Override
    public PersonalAccount open() {
        super.open();
        return this;
    }

    @Override
    public String getUrl() {
        return PERSONAL_ACCOUNT_PAGE.getPageUrl();
    }

    public void loginInPersonalAccount(String email, String password) {
        emailField.inputEmail(email);
        passwordField.inputPassword(password);
        loginButton.click();
    }
}
