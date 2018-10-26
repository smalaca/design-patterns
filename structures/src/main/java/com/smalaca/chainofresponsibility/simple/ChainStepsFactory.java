package com.smalaca.chainofresponsibility.simple;

public class ChainStepsFactory {
    public ChainStep steps() {
        return new FirstChainStep(
                new SecondChainStep(
                    new FinalChainStep()
                )
        );
    }
}
