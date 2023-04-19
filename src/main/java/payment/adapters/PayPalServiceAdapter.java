package payment.adapters;

import payment.interfaces.PayPalService;
import payment.interfaces.PaymentServiceAdapter;

public class PayPalServiceAdapter implements PaymentServiceAdapter {
    private final PayPalService payPalService;

    public PayPalServiceAdapter(PayPalService payPalService) {
        this.payPalService = payPalService;
    }

    @Override
    public void processPayment(double amount) {
        String userEmail = payPalService.requestUserEmail();
        payPalService.processPayment(amount, userEmail);
    }
}
