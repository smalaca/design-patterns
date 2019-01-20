package com.smalaca.bridge.client;

abstract public class Abstraction {
    private final Contract contract;

    protected Abstraction(Contract contract) {
        this.contract = contract;
    }

    public void doSomething() {
        contract.doStuff();
        doSomethingMore();
    }

    protected abstract void doSomethingMore();
}
