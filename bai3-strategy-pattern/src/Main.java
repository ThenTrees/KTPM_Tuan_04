import decorator.DiscountCodePaymentDecorator;
import decorator.PaymentWithFeeDecorator;
import strategy.PaymentMethodStrategy;
import strategy.impl.PaypalPayment;

public class Main {
    public static void main(String[] args) {
        PaymentMethodStrategy payPalPayment = new PaypalPayment("thientri.tran@gmail.com", "123456");
        System.out.println("Thanh toán paypal:");
        payPalPayment.pay(1000);
        System.out.println("---");

        // 2. Thanh toán bằng PayPal với discount 10%
        payPalPayment = new DiscountCodePaymentDecorator(payPalPayment);
        System.out.println("Thanh toán PayPal với discount 10%:");
        payPalPayment.pay(1000);
        System.out.println("---");

        payPalPayment = new PaymentWithFeeDecorator(payPalPayment);
        System.out.println("Thanh toán PayPal với phi 5%: ");
        payPalPayment.pay(1000);
    }
}