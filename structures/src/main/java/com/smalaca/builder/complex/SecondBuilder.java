package com.smalaca.builder.complex;

public class SecondBuilder implements Builder {
    private SecondProduct product;

    public SecondBuilder() {
        reset();
    }

    @Override
    public Builder with(PartA partA) {
        product.setPartA(partA);
        return this;
    }

    @Override
    public void with(PartB partB) {
        product.setPartB(partB);
    }

    @Override
    public Builder withPartC() {
        product.setPartC(new PartC());
        return this;
    }

    @Override
    public void withPartD() {
        product.setPartD(new PartD());
    }

    @Override
    public Product build() {
        return product;
    }

    @Override
    public void reset() {
        product = new SecondProduct();
    }
}
