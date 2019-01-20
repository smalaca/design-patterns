package com.smalaca.chainofresponsibility.simple.steps;

class SecondChainStep implements ChainStep {
    private final ChainStep nextStep;

    SecondChainStep(ChainStep nextStep) {
        this.nextStep = nextStep;
    }

    @Override
    public void doSomething() {
        doItsOwnStuff();

        nextStep.doSomething();
    }

    private void doItsOwnStuff() {

    }
}
