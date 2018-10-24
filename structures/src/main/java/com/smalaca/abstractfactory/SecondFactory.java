package com.smalaca.abstractfactory;

public class SecondFactory implements AbstractFactory {
    public ProductA productA() {
        return new SecondProductA();
    }

    public ProductB productB() {
        return new SecondProductB();
    }
}
