package htmlEl.element;

import org.openqa.selenium.*;

import java.util.List;

public class HtmlElement implements WebElement, WrapsElement,Named {

    private WebElement wrappedElement;
    private String name;

    @Override
    public WebElement getWrappedElement(){return wrappedElement;}

    public void setWrappedElement(WebElement wrappedElement){this.wrappedElement = wrappedElement;}

    @Override
    public String getName(){return name;}
    public void setName(String elementName){this.name = name;}

    @Override
    public void click(){wrappedElement.click();}

    @Override
    public void submit(){
        wrappedElement.submit();
    }
    @Override
    public void sendKeys(CharSequence ... charSequences){wrappedElement.sendKeys(charSequences);}

    @Override
    public void clear(){wrappedElement.clear();}

    @Override
    public String getTagName(){return wrappedElement.getTagName();}

    @Override
    public String getAttribute(String name) {
        return wrappedElement.getAttribute(name);
    }

    @Override
    public boolean isSelected() {
        return wrappedElement.isSelected();
    }

    @Override
    public boolean isEnabled() {
        return wrappedElement.isEnabled();
    }

    @Override
    public String getText() {
        return wrappedElement.getText();
    }

    @Override
    public List<WebElement> findElements(By by) {
        return wrappedElement.findElements(by);
    }

    @Override
    public WebElement findElement(By by) {
        return wrappedElement.findElement(by);
    }

    @Override
    public boolean isDisplayed() {
        return wrappedElement.isDisplayed();
    }

    @Override
    public Point getLocation() {
        return wrappedElement.getLocation();
    }

    @Override
    public Dimension getSize() {
        return wrappedElement.getSize();
    }

    @Override
    public Rectangle getRect() {
        return wrappedElement.getRect();
    }

    @Override
    public String getCssValue(String name) {
        return wrappedElement.getCssValue(name);
    }

    @Override
    public String toString() {
        return name;
    }

    @Override
    public <X> X getScreenshotAs(OutputType<X> outputType) throws WebDriverException {
        return wrappedElement.getScreenshotAs(outputType);
    }

}
