package com.smalaca.adapter.simple.internalcontract.first;

import com.smalaca.adapter.simple.client.InternalContract;
import com.smalaca.adapter.simple.external.first.FirstExternalService;

public class FirstAdapter implements InternalContract {
    private final FirstExternalService firstExternalService;

    public FirstAdapter(FirstExternalService firstExternalService) {
        this.firstExternalService = firstExternalService;
    }

    @Override
    public void doSomething() {
        firstExternalService.doStuff();
    }
}
