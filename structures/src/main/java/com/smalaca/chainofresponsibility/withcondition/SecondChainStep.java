package com.smalaca.chainofresponsibility.withcondition;

class SecondChainStep extends BaseChainStep {
    protected SecondChainStep(ChainStep nextStep) {
        super(nextStep);
    }

    @Override
    public void doSomething() {
        if (isConditionFulfilled()) {
            doItsOwnStuff();
        }

        nextStep().doSomething();
    }

    private boolean isConditionFulfilled() {
        return false;
    }

    private void doItsOwnStuff() {

    }
}
