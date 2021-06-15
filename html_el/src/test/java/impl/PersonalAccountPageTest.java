package impl;

import htmlEl.pages.CustomerAccount;
import htmlEl.pages.PersonalAccount;
import org.junit.Assert;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class PersonalAccountPageTest extends BaseTest {
    @Test
    @DisplayName("Login with valid customer")
    public void loginWithValidValue() {
        storage
                .getPage(PersonalAccount.class)
                .open()
                .loginInPersonalAccount("ann@yopmail.com", "parol123");
        boolean actual = storage.getPage(CustomerAccount.class).open().getCustomerTitle().getAttribute("class")
                .contains("Ann Masharova");
        Assert.assertTrue("Invalid customer!", actual);
    }
}
