package payment;

import payment.enums.ServiceType;
import payment.factories.PaymentServiceFactory;
import payment.interfaces.PaymentServiceAdapter;

public class PaymentProcessor {
    public static void processPayment(double amount, ServiceType serviceType) {
        PaymentServiceAdapter serviceAdapter = PaymentServiceFactory.getService(serviceType);
        serviceAdapter.processPayment(amount);
    }
}
