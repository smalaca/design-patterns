package com.smalaca.adapter.simple.internalcontract.second;

import com.smalaca.adapter.simple.client.InternalContract;
import com.smalaca.adapter.simple.external.second.SecondExternalService;

public class SecondAdapter implements InternalContract {
    private final SecondExternalService secondExternalService;

    public SecondAdapter(SecondExternalService secondExternalService) {
        this.secondExternalService = secondExternalService;
    }

    @Override
    public void doSomething() {
        secondExternalService.doAmazingThings();
    }
}
