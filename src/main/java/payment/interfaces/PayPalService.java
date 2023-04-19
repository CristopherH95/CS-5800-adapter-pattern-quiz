package payment.interfaces;

public interface PayPalService {
    void processPayment(double amount, String userEmail);
    String requestUserEmail();
}
