package com.smalaca.state.interfacebased;

public class Context {
    private State state;

    public Context(State state) {
        change(state);
    }

    public void change(State state) {
        this.state = state;
        state.setContext(this);
    }

    public void doStuff() {
        instruction();
        state.doSomething();
    }

    private void instruction() {

    }
}
