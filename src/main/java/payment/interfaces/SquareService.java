package payment.interfaces;

public interface SquareService {
    void processPayment(double amount, long locationID);
    long lookupLocationID();
}
