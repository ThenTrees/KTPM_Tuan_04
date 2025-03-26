package decorator;

import component.TaxableProduct;

public class LuxuryTaxDecorator extends TaxDecorator {
    public LuxuryTaxDecorator(TaxableProduct product) {
        super(product);
    }

    @Override
    public double getPrice() {
        return product.getPrice() * 1.2; // luxury tax 20%
    }

    @Override
    public String getNameProduct() {
        return product.getNameProduct() + " + Luxury Tax";
    }

}
