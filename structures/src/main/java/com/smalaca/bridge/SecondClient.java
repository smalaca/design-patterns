package com.smalaca.bridge;

public class SecondClient extends Client {
    protected SecondClient(Contract contract) {
        super(contract);
    }

    @Override
    public void doSomething() {
        instruction();
        doStuff();
    }

    private void instruction() {

    }
}
