package com.smalaca.adapter.withdata.internalcontract.first;

import com.smalaca.adapter.withdata.client.InternalContract;
import com.smalaca.adapter.withdata.client.InternalData;
import com.smalaca.adapter.withdata.external.first.FirstExternalData;
import com.smalaca.adapter.withdata.external.first.FirstExternalService;

public class FirstAdapter implements InternalContract {
    private final FirstExternalService firstExternalService;

    public FirstAdapter(FirstExternalService firstExternalService) {
        this.firstExternalService = firstExternalService;
    }

    @Override
    public void doSomething(InternalData data) {
        FirstExternalData firstExternalData = transform(data);

        firstExternalService.doStuff(firstExternalData);
    }

    private FirstExternalData transform(InternalData data) {
        return null;
    }
}
