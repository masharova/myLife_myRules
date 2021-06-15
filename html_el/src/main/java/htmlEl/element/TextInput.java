package htmlEl.element;

import org.openqa.selenium.*;

import java.util.List;
import java.util.Optional;

public class TextInput extends TypifiedElement{

    public TextInput(WebElement wrappedElement){super(wrappedElement);}

    @Deprecated
    public String getEnteredText(){return getText();}

    @Override
    public String getTagName() {
        return null;
    }

    @Override
    public String getAttribute(String name) {
        return null;
    }

    @Override
    public boolean isSelected() {
        return false;
    }

    @Override
    public boolean isEnabled() {
        return false;
    }

    @Override
    public String getText(){
        if("textarea".equals(getWrappedElement().getTagName())){
            return getWrappedElement().getText();
        }
        return Optional.ofNullable(getWrappedElement().getAttribute("name")).orElse("");
    }

    @Override
    public List<WebElement> findElements(By by) {
        return null;
    }

    @Override
    public WebElement findElement(By by) {
        return null;
    }

    @Override
    public boolean isDisplayed() {
        return false;
    }

    @Override
    public Point getLocation() {
        return null;
    }

    @Override
    public Dimension getSize() {
        return null;
    }

    @Override
    public Rectangle getRect() {
        return null;
    }

    @Override
    public String getCssValue(String propertyName) {
        return null;
    }



    @Override
    public <X> X getScreenshotAs(OutputType<X> target) throws WebDriverException {
        return null;
    }
}
