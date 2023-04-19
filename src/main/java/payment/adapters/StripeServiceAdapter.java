package payment.adapters;

import payment.interfaces.StripeService;
import payment.interfaces.PaymentServiceAdapter;
import payment.records.PaymentCard;

public class StripeServiceAdapter implements PaymentServiceAdapter {
    private final StripeService stripeService;

    public StripeServiceAdapter(StripeService stripeService) {
        this.stripeService = stripeService;
    }

    @Override
    public void processPayment(double amount) {
        PaymentCard paymentCard = stripeService.requestCardInformation();
        stripeService.processPayment(amount, paymentCard);
    }
}
