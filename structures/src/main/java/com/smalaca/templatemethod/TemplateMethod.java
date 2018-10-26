package com.smalaca.templatemethod;

abstract public class TemplateMethod {

    public void doSomething() {
        firstStep();
        secondStep();
        thirdStep();
    }

    private void thirdStep() {

    }

    protected abstract void secondStep();

    private void firstStep() {

    }
}
