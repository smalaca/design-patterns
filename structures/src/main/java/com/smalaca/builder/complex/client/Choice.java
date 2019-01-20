package com.smalaca.builder.complex.client;

import com.google.common.collect.ImmutableMap;
import com.smalaca.builder.complex.client.product.ProductBuilder;
import com.smalaca.builder.complex.product.first.FirstProductBuilder;
import com.smalaca.builder.complex.product.second.SecondProductBuilder;

import java.util.Map;
import java.util.function.Supplier;

public class Choice {
    private final Map<ProductType, Supplier<ProductBuilder>> products = ImmutableMap.of(
            ProductType.FIRST, FirstProductBuilder::new,
            ProductType.SECOND, SecondProductBuilder::new
    );
    private final Client client;

    public Choice(Client client) {
        this.client = client;
    }

    public void doSomething(Input input, ProductType productType) {
        ProductBuilder productBuilder = products.get(productType).get();

        client.doSomething(input, productBuilder);
    }
}
