package com.smalaca.state.interfacebased.task;

public class Task {
    private State state;

    public Task(State state) {
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
