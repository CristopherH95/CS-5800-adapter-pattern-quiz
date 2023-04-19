package payment.exceptions;

public class UnsupportedServiceException extends RuntimeException {
    public UnsupportedServiceException(String message) {
        super(message);
    }
}
