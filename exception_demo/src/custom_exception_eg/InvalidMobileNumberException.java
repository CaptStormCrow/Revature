package custom_exception_eg;

public class InvalidMobileNumberException extends RuntimeException{
    public InvalidMobileNumberException() {
    }

    public InvalidMobileNumberException(final String message) {
        super(message);
    }
}
