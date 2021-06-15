package htmlEl.decorator;

import org.openqa.selenium.support.pagefactory.ElementLocator;
import org.openqa.selenium.support.pagefactory.ElementLocatorFactory;

public interface CustomElementLocatorFactory extends ElementLocatorFactory {
    ElementLocator createLocator(Class clazz);
}
