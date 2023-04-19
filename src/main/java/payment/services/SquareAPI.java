package payment.services;

import payment.interfaces.SquareService;

import java.util.concurrent.ThreadLocalRandom;

public class SquareAPI implements SquareService {
    @Override
    public void processPayment(double amount, long locationID) {
        System.out.printf("Square processing payment of $%.2f at location '%d'%n", amount, locationID);
    }

    public long lookupLocationID() {
        return ThreadLocalRandom.current().nextLong();
    }
}
