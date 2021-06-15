package htmlEl.enumeration;

import htmlEl.pages.*;

public enum Pages {
    HOME_PAGE(HomePage.class),
    ITEM_PAGE(ItemPage.class),
    PERSONAL_ACCOUNT_PAGE(PersonalAccount.class),
    PRODUCT_PAGE(ProductPage.class),
    CHECKOUT_PAGE(CheckoutPage.class),
    CUSTOMER_ACCOUNT(CustomerAccount.class);

    private Class<? extends BasePage> clazz;

    Pages(Class<? extends BasePage> clazz) {
        this.clazz = clazz;
    }

    public Class<? extends BasePage> getClazz() {
        return clazz;
    }

    public static Pages byType(Class<? extends BasePage> clz) {
        for (Pages item : Pages.values()) {
            if (item.getClazz().getSimpleName().equalsIgnoreCase(clz.getSimpleName())) {
                return item;
            } else {
                continue;
            }
        }
        return null;
    }

}
