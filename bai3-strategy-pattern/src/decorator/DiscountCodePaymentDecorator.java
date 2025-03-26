package decorator;

import strategy.PaymentMethodStrategy;

public class DiscountCodePaymentDecorator extends PaymentDecorator {
    public DiscountCodePaymentDecorator(PaymentMethodStrategy paymentMethodStrategy) {
        super(paymentMethodStrategy);
    }
    @Override
    public void pay(double amount) {
        System.out.println("Applying discount 10%");
        super.pay(amount - amount * 0.1);
    }
}
