package com.smalaca.bridge;

public class FirstClient extends Client {
    protected FirstClient(Contract contract) {
        super(contract);
    }

    @Override
    public void doSomething() {
        instruction1();
        doStuff();
        instruction2();
    }

    private void instruction1() {

    }

    private void instruction2() {

    }
}
