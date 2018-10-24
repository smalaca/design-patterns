package com.smalaca.abstractfactory;

public class FirstFactory implements AbstractFactory {
    public ProductA productA() {
        return new FirstProductA();
    }

    public ProductB productB() {
        return new FirstProductB();
    }
}
