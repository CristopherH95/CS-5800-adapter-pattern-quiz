package payment.interfaces;

import payment.records.PaymentCard;

public interface StripeService {
    void processPayment(double amount, PaymentCard cardInformation);
    PaymentCard requestCardInformation();
}
