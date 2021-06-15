package htmlEl.enumeration;

public enum PageUrls {
    HOME_PAGE("https://www.eobuv.com/"),
    PERSONAL_ACCOUNT_PAGE("https://www.eobuv.com/customer/account/login/"),
    PRODUCT_PAGE("https://www.eobuv.com/adidas-landing-page?searchterm=adidas&frontendContext=JTdCJTIyc2VhcmNoRGF0YSUyMiUzQSU3QiUyMnNlYXJjaFVybCUyMiUzQSUyMi8lMjIlMkMlMjJzZWFyY2hRdWVyeSUyMiUzQSUyMmFkaWRhcyUyMiUyQyUyMnNlYXJjaFF1ZXJ5Q29tcGxleGl0eSUyMiUzQTElMkMlMjJzZWFyY2hQYWdlVHlwZSUyMiUzQSUyMmhvbWUlMjIlMkMlMjJzZWFyY2hTdWdnZXN0aW9ucyUyMiUzQSU3QiUyMnNlYXJjaFN1Z2dlc3Rpb25zVXNlJTIyJTNBZmFsc2UlMkMlMjJzZWFyY2hTdWdnZXN0aW9uc1R5cGUlMjIlM0FudWxsJTJDJTIyc2VhcmNoU3VnZ2VzdGlvbnNUYXJnZXQlMjIlM0FudWxsJTdEJTdEJTdE"),
    ITEM_PAGE("https://www.eobuv.com/obuv-adidas-runfalcon-2-0-k-fy5899-gretwo-crenav-halsil.html?snrai_campaign=87IRKQy5Ce4D&snrai_id=85cb722677aa0268316b416e74f6a080"),
    CHECKOUT_PAGE("https://www.eobuv.com/checkout/cart/"),
    CUSTOMER_ACCOUNT("https://www.eobuv.com/customer/account/");

    private String pageUrl;
    PageUrls(String pageUrl){
        this.pageUrl = pageUrl;
    }
    public String getPageUrl(){
        return pageUrl;
    }
}
