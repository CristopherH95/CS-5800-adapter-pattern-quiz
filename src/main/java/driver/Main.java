package driver;

import payment.PaymentProcessor;
import payment.enums.ServiceType;

import java.util.concurrent.ThreadLocalRandom;

public class Main {
    public static void main(String[] args) {
        testServiceType(ServiceType.PAYPAL);
        testServiceType(ServiceType.STRIPE);
        testServiceType(ServiceType.SQUARE);
    }

    private static void testServiceType(ServiceType serviceType) {
        System.out.printf("---- TESTING SERVICE: %s ----%n", serviceType);
        double chargeAmount = ThreadLocalRandom.current().nextDouble(10, 100);
        PaymentProcessor.processPayment(chargeAmount, serviceType);
        System.out.println("---- TEST COMPLETE ----");
    }
}