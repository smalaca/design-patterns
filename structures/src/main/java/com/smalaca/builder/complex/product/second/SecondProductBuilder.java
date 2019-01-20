package com.smalaca.builder.complex.product.second;

import com.smalaca.builder.complex.client.product.PartA;
import com.smalaca.builder.complex.client.product.PartB;
import com.smalaca.builder.complex.client.product.PartC;
import com.smalaca.builder.complex.client.product.PartD;
import com.smalaca.builder.complex.client.product.Product;
import com.smalaca.builder.complex.client.product.ProductBuilder;

public class SecondProductBuilder implements ProductBuilder {
    private SecondProduct product;

    public SecondProductBuilder() {
        reset();
    }

    @Override
    public ProductBuilder with(PartA partA) {
        product.setPartA(partA);
        return this;
    }

    @Override
    public void with(PartB partB) {
        product.setPartB(partB);
    }

    @Override
    public ProductBuilder withPartC() {
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
