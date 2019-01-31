package com.smalaca.strategy.functionality;

public class Functionality {
    private Strategy strategy;

    public Functionality(Strategy strategy) {
        change(strategy);
    }

    public void change(Strategy strategy) {
        this.strategy = strategy;
    }

    public void doSomething() {
        instruction();
        strategy.doStuff();
    }

    private void instruction() {

    }
}
