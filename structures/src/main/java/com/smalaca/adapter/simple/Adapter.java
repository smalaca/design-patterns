package com.smalaca.adapter.simple;

public class Adapter implements InternalContract {
    private final ExternalService externalService;

    public Adapter(ExternalService externalService) {
        this.externalService = externalService;
    }

    @Override
    public void doSomething() {
        externalService.doStuff();
    }
}
