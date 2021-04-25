package selenium.enumeration;

import selenium.pages.*;

public enum Pages {
    MAIN_PAGE(MainPage.class),
    RESULT_PAGE(ResultPage.class),
    PRODUCT_PAGE(ProductPage.class),
    SOME_PRODUCTS_PAGE(SomeProductsPage.class);


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
