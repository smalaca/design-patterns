package com.smalaca.bridge.client;

import com.google.common.collect.ImmutableMap;
import com.smalaca.bridge.abstractions.first.FirstAbstraction;
import com.smalaca.bridge.abstractions.second.SecondAbstraction;
import com.smalaca.bridge.contracts.first.FirstContract;
import com.smalaca.bridge.contracts.second.SecondContract;
import com.smalaca.bridge.contracts.third.ThirdContract;

import java.util.Map;
import java.util.function.Function;
import java.util.function.Supplier;

public class Client {
    private final Map<ContractType, Supplier<Contract>> contracts = ImmutableMap.of(
            ContractType.FIRST, FirstContract::new,
            ContractType.SECOND, SecondContract::new,
            ContractType.THIRD, ThirdContract::new
    );

    private final Map<AbstractionType, Function<Contract, Abstraction>> abstractions = ImmutableMap.of(
            AbstractionType.FIRST, FirstAbstraction::new,
            AbstractionType.SECOND, SecondAbstraction::new
    );

    public void use(AbstractionType abstractionType, ContractType contractType) {
        Contract contract = aContract(contractType);
        Abstraction abstraction = anAbstraction(contract, abstractionType);

        abstraction.doSomething();
    }

    private Contract aContract(ContractType contractType) {
        return contracts.get(contractType).get();
    }

    private Abstraction anAbstraction(Contract contract, AbstractionType abstractionType) {
        return abstractions.get(abstractionType).apply(contract);
    }
}
