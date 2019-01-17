package com.smalaca.adapter.simple.client;

public class Client {
    private InternalContract contract;

    public void doSomething() {
        contract.doSomething();
    }

    public void change(InternalContract internalContract) {
        contract = internalContract;
    }
}
