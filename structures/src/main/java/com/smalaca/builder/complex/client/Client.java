package com.smalaca.builder.complex.client;

import com.smalaca.builder.complex.domain.product.PartA;
import com.smalaca.builder.complex.domain.product.PartB;
import com.smalaca.builder.complex.domain.product.Product;
import com.smalaca.builder.complex.domain.product.ProductBuilder;

public class Client {
    public void doSomething(Input input, ProductBuilder productBuilder) {
        if (input.withPartA()) {
            productBuilder.with(new PartA());
        }

        if (input.withPartB()) {
            productBuilder.with(new PartB());
        }

        if (input.withPartC()) {
            productBuilder.withPartC();
        }

        if (input.withPartD()) {
            productBuilder.withPartD();
        }

        if (validate(input)) {
            productBuilder.reset();
        } else {
            Product product = productBuilder.build();
            product.doSomething();
        }
    }

    private boolean validate(Input input) {
        return false;
    }
}
