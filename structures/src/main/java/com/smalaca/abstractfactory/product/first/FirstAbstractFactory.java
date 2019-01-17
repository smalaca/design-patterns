package com.smalaca.abstractfactory.product.first;

import com.smalaca.abstractfactory.product.AbstractFactory;
import com.smalaca.abstractfactory.product.ProductA;
import com.smalaca.abstractfactory.product.ProductB;

public class FirstAbstractFactory implements AbstractFactory {
    public ProductA productA() {
        return new FirstProductA();
    }

    public ProductB productB() {
        return new FirstProductB();
    }
}
