package concrete;

import component.TaxableProduct;

public class Product implements TaxableProduct {
    private String name;
    private double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String getNameProduct() {
        return name;
    }


    @Override
    public double getPrice() {
        return price;
    }



}
