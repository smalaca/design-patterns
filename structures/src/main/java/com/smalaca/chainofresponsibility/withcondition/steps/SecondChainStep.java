package com.smalaca.chainofresponsibility.withcondition.steps;

class SecondChainStep implements ChainStep {
    private final ChainStep nextStep;

    SecondChainStep(ChainStep nextStep) {
        this.nextStep = nextStep;
    }

    @Override
    public void doSomething() {
        if (isConditionFulfilled()) {
            doItsOwnStuff();
        }

        nextStep.doSomething();
    }

    private boolean isConditionFulfilled() {
        return false;
    }

    private void doItsOwnStuff() {

    }
}
