package com.smalaca.chainofresponsibility.simple.steps;

class FirstChainStep implements ChainStep {
    private final ChainStep nextStep;

    protected FirstChainStep(ChainStep nextStep) {
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
