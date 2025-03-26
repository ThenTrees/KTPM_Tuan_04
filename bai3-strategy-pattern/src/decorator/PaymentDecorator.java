package decorator;

import strategy.PaymentMethodStrategy;

public abstract class PaymentDecorator implements PaymentMethodStrategy {

    private final PaymentMethodStrategy paymentMethodStrategy;

    public PaymentDecorator(PaymentMethodStrategy paymentMethodStrategy) {
        this.paymentMethodStrategy = paymentMethodStrategy;
    }

    @Override
    public void pay(double amount) {
        paymentMethodStrategy.pay(amount);
    }
}
