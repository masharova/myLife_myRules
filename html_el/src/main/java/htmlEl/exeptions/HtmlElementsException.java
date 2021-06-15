package htmlEl.exeptions;

public class HtmlElementsException extends RuntimeException {
    public HtmlElementsException() {
        super();
    }

    public HtmlElementsException(String message) {
        super(message);
    }

    public HtmlElementsException(Throwable cause) {
        super(cause);
    }
}
