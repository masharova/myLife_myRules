package selenium.enumeration;

public enum PageUrls {
    MAIN_PAGE("https://allo.ua/"),
    RESULT_PAGE("https://allo.ua/ua/catalogsearch/result/?q=lg"),
    PRODUCT_PAGE("https://allo.ua/ua/televizory/xiaomi-mi-tv-uhd-4s-65-eu-u1_29.html"),
    SOME_PRODUCTS_PAGE("https://allo.ua/ua/televizory/proizvoditel-lg/");


    private String pageUrl;

    PageUrls(String pageUrl) {
        this.pageUrl = pageUrl;
    }

    public String getPageUrl() {
        return pageUrl;
    }
}
