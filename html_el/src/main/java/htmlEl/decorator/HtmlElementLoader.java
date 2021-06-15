package htmlEl.decorator;

import htmlEl.decorator.proxyhandlers.WebElementNamedProxyHandler;
import htmlEl.element.HtmlElement;
import htmlEl.element.TypifiedElement;
import htmlEl.exeptions.HtmlElementsException;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.ElementLocator;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;

import static htmlEl.decorator.HtmlElementUtils.*;
import static htmlEl.decorator.ProxyFactory.createWebElementProxy;

public class HtmlElementLoader {

    public static <T extends HtmlElement> T createHtmlElement(Class<T> clazz, SearchContext searchContext) {
        ElementLocator locator = new HtmlElementLocatorFactory(searchContext).createLocator(clazz);
        String elementName = getElementName(clazz);

        InvocationHandler handler = new WebElementNamedProxyHandler(locator, elementName);
        WebElement elementToWrap = createWebElementProxy(clazz.getClassLoader(), handler);
        return createHtmlElement(clazz, elementToWrap, elementName);
    }

    public static <T extends HtmlElement> T createHtmlElement(Class<T> elementClass, WebElement elementToWrap,
                                                              String name) {
        try {
            T instance = newInstance(elementClass);
            instance.setWrappedElement(elementToWrap);
            instance.setName(name);
            populatePageObject(instance, elementToWrap);
            return instance;
        } catch (NoSuchMethodException | InstantiationException | IllegalAccessException
                | InvocationTargetException e) {
            throw new HtmlElementsException(e);
        }
    }

    public static <T extends TypifiedElement> T createTypifiedElement(Class<T> clazz, SearchContext searchContext) {
        ElementLocator locator = new HtmlElementLocatorFactory(searchContext).createLocator(clazz);
        String elementName = getElementName(clazz);

        InvocationHandler handler = new WebElementNamedProxyHandler(locator, elementName);
        WebElement elementToWrap = createWebElementProxy(clazz.getClassLoader(), handler);

        return createTypifiedElement(clazz, elementToWrap, elementName);
    }

    public static <T extends TypifiedElement> T createTypifiedElement(Class<T> elementClass, WebElement elementToWrap,
                                                                      String name) {
        try {
            T instance = newInstance(elementClass, elementToWrap);
            instance.setName(name);
            return instance;
        } catch (NoSuchMethodException | InstantiationException | IllegalAccessException
                | InvocationTargetException e) {
            throw new HtmlElementsException(e);
        }
    }

    public static void populatePageObject(Object page, SearchContext searchContext) {
        populatePageObject(page, new HtmlElementLocatorFactory(searchContext));
    }

    public static void populatePageObject(Object page, CustomElementLocatorFactory locatorFactory) {
        PageFactory.initElements(new HtmlElementDecorator(locatorFactory), page);
    }
}
