package com.smalaca.proxy;

public class RealExternalService implements ExternalService {
    @Override
    public void doSomething() {
        heavyOperation();
    }

    private void heavyOperation() {

    }
}
