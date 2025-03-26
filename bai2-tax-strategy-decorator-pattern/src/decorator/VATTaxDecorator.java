package decorator;


import component.TaxableProduct;

public class VATTaxDecorator extends TaxDecorator {

    public VATTaxDecorator(TaxableProduct product) {
        super(product);
    }

    @Override
    public double getPrice() {
        return product.getPrice() * 1.1; // vat 10%
    }

    @Override
    public String getNameProduct() {
        return product.getNameProduct() + " + VAT";
    }

}
