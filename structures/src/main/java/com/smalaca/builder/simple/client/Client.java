package com.smalaca.builder.simple.client;


import com.smalaca.builder.simple.domain.product.PartA;
import com.smalaca.builder.simple.domain.product.PartB;
import com.smalaca.builder.simple.domain.product.PartD;
import com.smalaca.builder.simple.domain.product.Product;
import com.smalaca.builder.simple.domain.product.ProductBuilder;

public class Client {
    public void doSomething(Input input) {
        ProductBuilder productBuilder = new ProductBuilder(new PartA(), new PartB());

        if (input.withPartC()) {
            productBuilder.withPartC();
        }

        if (input.withPartD()) {
            productBuilder.with(new PartD());
        }

        Product product = productBuilder.build();
        product.doSomething();
    }

    private boolean validate(Input input) {
        return false;
    }
}
