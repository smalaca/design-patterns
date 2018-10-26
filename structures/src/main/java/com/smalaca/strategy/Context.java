package com.smalaca.strategy;

public class Context {
    private Strategy strategy;

    public Context(Strategy strategy) {
        change(strategy);
    }

    private void change(Strategy strategy) {
        this.strategy = strategy;
    }

    public void doSomething() {
        instruction();
        strategy.doStuff();
    }

    private void instruction() {

    }
}
