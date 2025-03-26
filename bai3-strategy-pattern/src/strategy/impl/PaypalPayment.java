package strategy.impl;

import strategy.PaymentMethodStrategy;

public class PaypalPayment implements PaymentMethodStrategy {

    private String email;
    private String password;

    public PaypalPayment(String email, String password) {
        this.email = email;
        this.password = password;
    }

    @Override
    public void pay(double amount) {
        System.out.println("Paying " + amount + " using Paypal");
    }
}
