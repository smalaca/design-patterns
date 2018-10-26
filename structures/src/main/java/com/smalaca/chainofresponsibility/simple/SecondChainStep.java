package com.smalaca.chainofresponsibility.simple;

class SecondChainStep extends BaseChainStep {
    protected SecondChainStep(ChainStep nextStep) {
        super(nextStep);
    }

    @Override
    public void doSomething() {
        doItsOwnStuff();
        nextStep().doSomething();
    }

    private void doItsOwnStuff() {

    }
}
