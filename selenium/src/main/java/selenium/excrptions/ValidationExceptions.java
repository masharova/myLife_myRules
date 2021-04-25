package selenium.excrptions;

public class ValidationExceptions {
    public static class WrongPageOpenedException extends BaseException {
        public WrongPageOpenedException(String message) {
            super(message);
        }
    }

    public static class WrongElementStateException extends BaseException {
        public WrongElementStateException(String message) {
            super(message);
        }
    }
}
