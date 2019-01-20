package com.smalaca.chainofresponsibility.withcondition.steps;

public class ChainStepsFactory {
    public ChainStep steps() {
        return new FirstChainStep(
                new SecondChainStep(
                    new FinalChainStep()
                )
        );
    }
}
