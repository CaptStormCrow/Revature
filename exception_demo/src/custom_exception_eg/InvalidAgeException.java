package custom_exception_eg;

public class InvalidAgeException extends Exception{
    public InvalidAgeException() {
    }

    public InvalidAgeException(final String message) {
        super(message);
    }
}
