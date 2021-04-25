package selenium.utils;

import selenium.enumeration.Pages;
import selenium.pages.*;

import java.util.HashMap;
import java.util.Map;

public class PageStorage {
    Map<Pages, BasePage> pages = new HashMap<>();

    public PageStorage(){
        pages.put(Pages.MAIN_PAGE, new MainPage());
        pages.put(Pages.RESULT_PAGE,new ResultPage());
        pages.put(Pages.PRODUCT_PAGE, new ProductPage());
        pages.put(Pages.SOME_PRODUCTS_PAGE,new SomeProductsPage());

    }
    @SuppressWarnings("unchecked")
    public <T extends BasePage> T getPage(Class<T> clazz){
        Pages page = Pages.byType(clazz);
        return clazz.cast(pages.get(page));
    }
}
