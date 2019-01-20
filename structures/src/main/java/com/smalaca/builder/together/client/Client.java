package com.smalaca.builder.together.client;

import com.smalaca.builder.together.domain.product.PartA;
import com.smalaca.builder.together.domain.product.PartB;
import com.smalaca.builder.together.domain.product.PartD;
import com.smalaca.builder.together.domain.product.Product;

public class Client {
    public void doSomething(Input input) {
        Product.ProductBuilder productBuilder = new Product.ProductBuilder(new PartA(), new PartB());

        if (input.withPartC()) {
            productBuilder.withPartC();
        }

        if (input.withPartD()) {
            productBuilder.with(new PartD());
        }

        Product product = productBuilder.build();
        product.doSomething();
    }
}
