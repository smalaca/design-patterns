package com.smalaca.chainofresponsibility.simple.client;

import com.smalaca.chainofresponsibility.simple.steps.ChainStepsFactory;

public class Client {
    private final ChainStepsFactory factory;

    public Client(ChainStepsFactory factory) {
        this.factory = factory;
    }

    public void doSomething() {
        factory.steps().doSomething();
    }
}
