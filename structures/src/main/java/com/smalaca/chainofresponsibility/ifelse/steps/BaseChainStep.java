package com.smalaca.chainofresponsibility.ifelse.steps;

abstract class BaseChainStep implements ChainStep {
    private final ChainStep nextStep;

    protected BaseChainStep(ChainStep nextStep) {
        this.nextStep = nextStep;
    }

    protected ChainStep nextStep() {
        return nextStep;
    }
}
