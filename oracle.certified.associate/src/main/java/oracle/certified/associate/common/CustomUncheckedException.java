package oracle.certified.associate.common;

public class CustomUncheckedException extends RuntimeException {
    private static final long serialVersionUID = 1L;

    public CustomUncheckedException() {
        super();
    }

    public CustomUncheckedException(String message) {
        super(message);
    }

    public CustomUncheckedException(Throwable cause) {
        super(cause);
    }

    public CustomUncheckedException(String message, Throwable cause) {
        super(message, cause);
    }

    public CustomUncheckedException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
