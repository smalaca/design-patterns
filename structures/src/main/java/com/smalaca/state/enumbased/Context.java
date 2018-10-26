package com.smalaca.state.enumbased;

public class Context {
    private State state;

    public Context(State state) {
        change(state);
    }

    public void change(State state) {
        this.state = state;
    }

    public void doStuff() {
        instruction();
        state.doSomething(this);
    }

    private void instruction() {

    }

}
