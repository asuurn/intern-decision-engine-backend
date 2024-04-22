package ee.taltech.inbankbackend.exceptions;

/**
 * Thrown when requested loan amount is invalid.
 */
public class NotInTheApprovedAgeRangeException extends Throwable {
    private final String message;
    private final Throwable cause;

    public NotInTheApprovedAgeRangeException(String message) {
        this(message, null);
    }

    public NotInTheApprovedAgeRangeException(String message, Throwable cause) {
        this.message = message;
        this.cause = cause;
    }

    @Override
    public Throwable getCause() {
        return cause;
    }

    @Override
    public String getMessage() {
        return message;
    }
}
