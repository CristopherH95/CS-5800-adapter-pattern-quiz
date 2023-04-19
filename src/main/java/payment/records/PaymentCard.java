package payment.records;

import java.util.Date;

public record PaymentCard(String cardholderName, String cardNumber, Date expirationDate) {}
