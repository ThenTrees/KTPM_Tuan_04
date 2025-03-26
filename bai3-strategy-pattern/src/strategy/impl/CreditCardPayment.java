package strategy.impl;

import strategy.PaymentMethodStrategy;

public class CreditCardPayment implements PaymentMethodStrategy {

    private String cardNumber;
    private String name;

    public CreditCardPayment(String cardNumber, String name) {
        this.cardNumber = cardNumber;
        this.name = name;
    }

    @Override
    public void pay(double amount) {
        System.out.println("Paying " + amount + " using Credit Card");
    }
}
