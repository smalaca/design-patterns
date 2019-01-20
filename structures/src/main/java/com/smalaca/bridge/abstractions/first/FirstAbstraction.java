package com.smalaca.bridge.abstractions.first;

import com.smalaca.bridge.client.Abstraction;
import com.smalaca.bridge.client.Contract;

public class FirstAbstraction extends Abstraction {
    public FirstAbstraction(Contract contract) {
        super(contract);
    }

    @Override
    protected void doSomethingMore() {
        instruction1();
        instruction2();
    }

    private void instruction1() {

    }

    private void instruction2() {

    }
}
