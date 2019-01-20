package com.smalaca.chainofresponsibility.ifelse.steps;

class SecondChainStep extends BaseChainStep {
    SecondChainStep(ChainStep nextStep) {
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
