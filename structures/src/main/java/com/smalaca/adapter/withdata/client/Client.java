package com.smalaca.adapter.withdata.client;

public class Client {
    private InternalContract contract;

    public void doSomething(InternalData data) {
        contract.doSomething(data);
    }

    public void change(InternalContract internalContract) {
        contract = internalContract;
    }
}
