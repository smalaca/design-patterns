package com.smalaca.chainofresponsibility.ifelse.steps;

public class ChainStepsFactory {
    public ChainStep steps() {
        return new FirstChainStep(
                new SecondChainStep(
                    new FinalChainStep()
                )
        );
    }
}
