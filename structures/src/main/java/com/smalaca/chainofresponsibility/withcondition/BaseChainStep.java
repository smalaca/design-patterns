package com.smalaca.chainofresponsibility.withcondition;

abstract class BaseChainStep implements ChainStep {
    private final ChainStep nextStep;

    protected BaseChainStep(ChainStep nextStep) {
        this.nextStep = nextStep;
    }

    protected ChainStep nextStep() {
        return nextStep;
    }
}
