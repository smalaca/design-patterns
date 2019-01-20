package com.smalaca.bridge.abstractions.second;

import com.smalaca.bridge.client.Abstraction;
import com.smalaca.bridge.client.Contract;

public class SecondAbstraction extends Abstraction {
    public SecondAbstraction(Contract contract) {
        super(contract);
    }

    @Override
    protected void doSomethingMore() {
        instruction();
    }

    private void instruction() {

    }
}
