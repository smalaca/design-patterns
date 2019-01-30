package com.smalaca.state.enumbased.task;

public class Task {
    private State state;

    public Task(State state) {
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
