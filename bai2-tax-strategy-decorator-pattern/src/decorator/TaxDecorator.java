package decorator;

import component.TaxableProduct;

public abstract class TaxDecorator implements TaxableProduct {
    protected TaxableProduct product;

    public TaxDecorator(TaxableProduct product) {
        this.product = product;
    }

    @Override
    public String getNameProduct() {
        return product.getNameProduct();
    }

    @Override
    public double getPrice() {
        return product.getPrice();
    }
}
