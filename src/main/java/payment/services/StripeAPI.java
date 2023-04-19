package payment.services;

import payment.interfaces.StripeService;
import payment.records.PaymentCard;

import java.util.Calendar;
import java.util.Date;
import java.util.concurrent.ThreadLocalRandom;

public class StripeAPI implements StripeService {
    private static final String[] simulatedNameData = new String[]{
            "Jose",
            "Bill",
            "Sarah",
            "Jessica"
    };

    @Override
    public void processPayment(double amount, PaymentCard cardInformation) {
        System.out.printf(
                "Stripe processing payment of $%.2f for card '%s' (name: '%s', expiration: '%s')%n",
                amount,
                cardInformation.cardNumber(),
                cardInformation.cardholderName(),
                cardInformation.expirationDate()
        );
    }

    @Override
    public PaymentCard requestCardInformation() {
        return new PaymentCard(
                getSimulatedName(),
                getSimulatedCardNumber(),
                getSimulatedExpirationDate()
        );
    }

    private String getSimulatedName() {
        int nameIndex = ThreadLocalRandom.current().nextInt(simulatedNameData.length);
        return simulatedNameData[nameIndex];
    }

    private String getSimulatedCardNumber() {
        int cardLength = 16;
        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < cardLength; i++) {
            stringBuilder.append(
                    ThreadLocalRandom.current().nextInt(1, 9)
            );
        }

        return stringBuilder.toString();
    }

    private Date getSimulatedExpirationDate() {
        int maxMonths = 12;
        int monthsAway = ThreadLocalRandom.current().nextInt(maxMonths);
        Calendar calendar = Calendar.getInstance();
        calendar.add(Calendar.MONTH, monthsAway);
        calendar.set(Calendar.HOUR_OF_DAY, 0);
        calendar.set(Calendar.MINUTE, 0);
        calendar.set(Calendar.SECOND, 0);
        calendar.set(Calendar.MILLISECOND, 0);
        return calendar.getTime();
    }
}
