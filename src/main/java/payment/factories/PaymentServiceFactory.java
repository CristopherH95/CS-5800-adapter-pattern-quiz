package payment.factories;

import payment.adapters.PayPalServiceAdapter;
import payment.adapters.SquareServiceAdapter;
import payment.adapters.StripeServiceAdapter;
import payment.enums.ServiceType;
import payment.exceptions.UnsupportedServiceException;
import payment.interfaces.PaymentServiceAdapter;
import payment.services.PayPalAPI;
import payment.services.SquareAPI;
import payment.services.StripeAPI;

public class PaymentServiceFactory {
    public static PaymentServiceAdapter getService(ServiceType serviceType) {
        switch (serviceType) {
            case PAYPAL -> {
                PayPalAPI payPalService = new PayPalAPI();
                return new PayPalServiceAdapter(payPalService);
            }
            case SQUARE -> {
                SquareAPI squareService = new SquareAPI();
                return new SquareServiceAdapter(squareService);
            }
            case STRIPE -> {
                StripeAPI stripeService = new StripeAPI();
                return new StripeServiceAdapter(stripeService);
            }
            default -> throw new UnsupportedServiceException(
                    String.format("Payment service '%s' not supported", serviceType)
            );
        }
    }
}
