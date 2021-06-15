package htmlEl.pages.blocks;

import htmlEl.config.WaitUtils;
import htmlEl.element.Button;
import htmlEl.element.HtmlElement;
import htmlEl.element.TextInput;
import org.openqa.selenium.support.FindBy;

import static htmlEl.config.WebDriverConfig.getWebDriver;

public class EnteredField extends HtmlElement {
    @FindBy(xpath = "//div[@class='input-wrapper account-login__input-wrapper']/child::input")
    private TextInput enteredEmailField;

    @FindBy(xpath = "//div[@class='input-wrapper input-wrapper--type-password account-login__input-wrapper']/child::input")
    private TextInput enteredPasswordField;

    @FindBy(xpath = "//button[@data-testid='login-submit-button']")
    private Button loginButton;

    public void inputEmail(String email){
        WaitUtils.implicitWait(getWebDriver());
        enteredEmailField.sendKeys((CharSequence) email);
    }
    public void inputPassword(String password){
        WaitUtils.implicitWait(getWebDriver());
        enteredPasswordField.sendKeys((CharSequence) password);
    }
}
