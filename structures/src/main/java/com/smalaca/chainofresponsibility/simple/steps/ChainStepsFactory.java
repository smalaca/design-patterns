package com.smalaca.chainofresponsibility.simple.steps;

public class ChainStepsFactory {
    public ChainStep steps() {
        return new FirstChainStep(
                new SecondChainStep(
                    new FinalChainStep()
                )
        );
    }
}
