package com.smalaca.abstractfactory.clients;

import com.smalaca.abstractfactory.product.AbstractFactory;
import com.smalaca.abstractfactory.product.ProductA;
import com.smalaca.abstractfactory.product.ProductB;

public class UsageService {
    private AbstractFactory abstractFactory;

    public void change(AbstractFactory abstractFactory) {
        this.abstractFactory = abstractFactory;
    }

    public void doSomethingWithProductA() {
        ProductA productA = abstractFactory.productA();

        doSomething(productA);
    }

    private void doSomething(ProductA productA) {

    }

    public void doSomethingWithProductB() {
        ProductB productB = abstractFactory.productB();

        doSomething(productB);
    }

    private void doSomething(ProductB productB) {

    }
}
