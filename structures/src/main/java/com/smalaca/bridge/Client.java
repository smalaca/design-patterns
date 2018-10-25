package com.smalaca.bridge;

abstract public class Client {
    private final Contract contract;

    protected Client(Contract contract) {
        this.contract = contract;
    }

    abstract public void doSomething();

    protected void doStuff() {
        contract.doStuff();
    }
}
