package decorator;

import component.TaxableProduct;

public class ConsumptionTaxDecorator extends TaxDecorator {

    public ConsumptionTaxDecorator(TaxableProduct product) {
        super(product);
    }

    @Override
    public double getPrice() {
        return product.getPrice() * 1.08; // consumption tax 8%
    }

    @Override
    public String getNameProduct() {
        return product.getNameProduct() + " + Consumption Tax";
    }
}
