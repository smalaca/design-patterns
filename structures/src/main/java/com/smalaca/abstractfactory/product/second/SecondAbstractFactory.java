package com.smalaca.abstractfactory.product.second;

import com.smalaca.abstractfactory.product.AbstractFactory;
import com.smalaca.abstractfactory.product.ProductA;
import com.smalaca.abstractfactory.product.ProductB;

public class SecondAbstractFactory implements AbstractFactory {
    public ProductA productA() {
        return new SecondProductA();
    }

    public ProductB productB() {
        return new SecondProductB();
    }
}
