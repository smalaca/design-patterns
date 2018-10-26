package com.smalaca.chainofresponsibility.simple;

class FirstChainStep extends BaseChainStep {
    protected FirstChainStep(ChainStep nextStep) {
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
