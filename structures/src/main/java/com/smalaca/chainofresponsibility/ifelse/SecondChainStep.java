package com.smalaca.chainofresponsibility.ifelse;

class SecondChainStep extends BaseChainStep {
    protected SecondChainStep(ChainStep nextStep) {
        super(nextStep);
    }

    @Override
    public void doSomething() {
        if (isConditionFulfilled()) {
            doItsOwnStuff();
        } else {
            nextStep().doSomething();
        }
    }

    private boolean isConditionFulfilled() {
        return false;
    }

    private void doItsOwnStuff() {

    }
}