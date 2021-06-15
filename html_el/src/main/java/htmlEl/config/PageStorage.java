package htmlEl.config;

import htmlEl.enumeration.Pages;
import htmlEl.pages.*;

import java.util.HashMap;
import java.util.Map;

public class PageStorage {
    Map<Pages, BasePage> pages = new HashMap<>();

    public PageStorage() {
        pages.put(Pages.HOME_PAGE, new HomePage());
        pages.put(Pages.ITEM_PAGE, new ItemPage());
        pages.put(Pages.PERSONAL_ACCOUNT_PAGE, new PersonalAccount());
        pages.put(Pages.PRODUCT_PAGE, new ProductPage());
        pages.put(Pages.CHECKOUT_PAGE, new CheckoutPage());
        pages.put(Pages.CUSTOMER_ACCOUNT, new CustomerAccount());
    }

    @SuppressWarnings("unchecked")
    public <T extends BasePage> T getPage(Class<T> clazz) {
        Pages page = Pages.byType(clazz);
        return clazz.cast(pages.get(page));
    }
}
