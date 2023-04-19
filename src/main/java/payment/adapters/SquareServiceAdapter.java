package payment.adapters;

import payment.interfaces.SquareService;
import payment.interfaces.PaymentServiceAdapter;

public class SquareServiceAdapter implements PaymentServiceAdapter {
    private final SquareService squareService;

    public SquareServiceAdapter(SquareService squareService) {
        this.squareService = squareService;
    }

    @Override
    public void processPayment(double amount) {
        long locationID = squareService.lookupLocationID();
        squareService.processPayment(amount, locationID);
    }
}
