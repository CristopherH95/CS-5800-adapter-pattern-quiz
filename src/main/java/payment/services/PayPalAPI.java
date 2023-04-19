package payment.services;

import payment.interfaces.PayPalService;

import java.util.concurrent.ThreadLocalRandom;

public class PayPalAPI implements PayPalService {
    private static final String[] simulatedEmailData = new String[]{
            "fakemail@gmail.com",
            "notreal@hotmail.com",
            "simulation@yahoo.com"
    };

    @Override
    public void processPayment(double amount, String userEmail) {
        System.out.printf("PayPal processed payment of $%.2f for user '%s'%n", amount, userEmail);
    }

    @Override
    public String requestUserEmail() {
        int userIndex = ThreadLocalRandom.current().nextInt(simulatedEmailData.length);
        return simulatedEmailData[userIndex];
    }
}
