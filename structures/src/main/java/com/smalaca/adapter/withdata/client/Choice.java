package com.smalaca.adapter.withdata.client;

import com.smalaca.adapter.withdata.external.first.FirstExternalService;
import com.smalaca.adapter.withdata.external.second.SecondExternalService;
import com.smalaca.adapter.withdata.internalcontract.first.FirstAdapter;
import com.smalaca.adapter.withdata.internalcontract.second.SecondAdapter;

public class Choice {
    private final Client client;
    private final FirstExternalService firstExternalService;
    private final SecondExternalService secondExternalService;

    public Choice(
            Client client, FirstExternalService firstExternalService, SecondExternalService secondExternalService) {
        this.client = client;
        this.firstExternalService = firstExternalService;
        this.secondExternalService = secondExternalService;
    }

    public void choose(ContractType type) {
        client.change(aContract(type));
    }

    private InternalContract aContract(ContractType contractType) {
        switch (contractType) {
            case FIRST:
                return new FirstAdapter(firstExternalService);
            case SECOND:
                return new SecondAdapter(secondExternalService);
            default:
                throw new UnsupportedContractTypeException(contractType);
        }
    }
}
