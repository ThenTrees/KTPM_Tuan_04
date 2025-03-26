import component.TaxableProduct;
import concrete.Product;
import decorator.LuxuryTaxDecorator;
import decorator.VATTaxDecorator;

public class Main {
    public static void main(String[] args) {
        TaxableProduct laptop = new Product("Laptop", 1000);
        System.out.println("Laptop price: " + laptop.getPrice());

        laptop = new VATTaxDecorator(laptop);
        System.out.println( laptop.getNameProduct() +laptop.getPrice());
        laptop = new LuxuryTaxDecorator(laptop);

        System.out.println( laptop.getNameProduct() +laptop.getPrice());

    }
}