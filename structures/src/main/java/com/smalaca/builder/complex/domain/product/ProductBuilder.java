package com.smalaca.builder.complex.domain.product;

public interface ProductBuilder {
    ProductBuilder with(PartA partA);
    void with(PartB partB);

    ProductBuilder withPartC();
    void withPartD();

    Product build();

    void reset();
}
