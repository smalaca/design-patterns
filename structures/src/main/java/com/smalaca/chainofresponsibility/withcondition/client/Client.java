package com.smalaca.chainofresponsibility.withcondition.client;

import com.smalaca.chainofresponsibility.withcondition.steps.ChainStepsFactory;

public class Client {
    private final ChainStepsFactory factory;

    public Client(ChainStepsFactory factory) {
        this.factory = factory;
    }

    public void doSomething() {
        factory.steps().doSomething();
    }
}
