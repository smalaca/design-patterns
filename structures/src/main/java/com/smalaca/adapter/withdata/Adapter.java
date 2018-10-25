package com.smalaca.adapter.withdata;

import com.smalaca.adapter.withdata.external.ExternalData;
import com.smalaca.adapter.withdata.external.ExternalService;

public class Adapter implements InternalContract{
    private final ExternalService service;

    public Adapter(ExternalService service) {
        this.service = service;
    }

    @Override
    public void doSomething(SomeData data) {
        ExternalData externalData = transform(data);

        service.doStuff(externalData);
    }

    private ExternalData transform(SomeData data) {
        return null;
    }
}
