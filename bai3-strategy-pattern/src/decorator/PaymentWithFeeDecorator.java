package decorator;

import strategy.PaymentMethodStrategy;

public class PaymentWithFeeDecorator extends PaymentDecorator {
    public PaymentWithFeeDecorator(PaymentMethodStrategy paymentMethodStrategy) {
        super(paymentMethodStrategy);
    }

    @Override
    public void pay(double amount) {
        System.out.println("Applying fee 5%");
        super.pay(amount + amount * 0.05);
    }
}
