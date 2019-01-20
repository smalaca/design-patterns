package com.smalaca.chainofresponsibility.ifelse.client;

import com.smalaca.chainofresponsibility.ifelse.steps.ChainStepsFactory;

public class Client {
    private final ChainStepsFactory factory;

    public Client(ChainStepsFactory factory) {
        this.factory = factory;
    }

    public void doSomething() {
        factory.steps().doSomething();
    }
}
