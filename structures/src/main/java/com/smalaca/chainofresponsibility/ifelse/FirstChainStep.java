package com.smalaca.chainofresponsibility.ifelse;

class FirstChainStep extends BaseChainStep {
    protected FirstChainStep(ChainStep nextStep) {
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
