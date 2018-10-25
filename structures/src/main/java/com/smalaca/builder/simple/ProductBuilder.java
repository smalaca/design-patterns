package com.smalaca.builder.simple;

public class ProductBuilder {
    private final Product product;

    public ProductBuilder(PartA partA, PartB partB) {
        this.product = new Product(partA, partB);
    }

    public void withPartC() {
        product.setPartC(new PartC());
    }

    public void with(PartD partD) {
        product.setPartD(partD);
    }

    public Product build() {
        return product;
    }
}
