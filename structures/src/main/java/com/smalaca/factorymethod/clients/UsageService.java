package com.smalaca.factorymethod.clients;

import com.smalaca.factorymethod.product.Factory;
import com.smalaca.factorymethod.product.Product;

public class UsageService {
    private Factory factory;

    public void change(Factory factory) {
        this.factory = factory;
    }

    public void doSomething() {
        Product product = factory.product();

        doSomething(product);
    }

    private void doSomething(Product product) {

    }
}
