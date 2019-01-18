package com.smalaca.adapter.withdata.internalcontract.second;

import com.smalaca.adapter.withdata.client.InternalContract;
import com.smalaca.adapter.withdata.client.InternalData;
import com.smalaca.adapter.withdata.external.second.SecondExternalService;
import com.smalaca.adapter.withdata.external.second.SecondInputOne;
import com.smalaca.adapter.withdata.external.second.SecondInputTwo;

public class SecondAdapter implements InternalContract {
    private final SecondExternalService secondExternalService;

    public SecondAdapter(SecondExternalService secondExternalService) {
        this.secondExternalService = secondExternalService;
    }

    @Override
    public void doSomething(InternalData data) {
        SecondInputOne inputOne = extractOneFrom(data);
        SecondInputTwo inputTwo = extractTwoFrom(data);

        secondExternalService.doAmazingThings(inputOne, inputTwo);
    }

    private SecondInputOne extractOneFrom(InternalData data) {
        return null;
    }

    private SecondInputTwo extractTwoFrom(InternalData data) {
        return null;
    }
}
