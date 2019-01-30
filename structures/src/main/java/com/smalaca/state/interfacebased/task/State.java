package com.smalaca.state.interfacebased.task;

public interface State {
    void doSomething();

    void setContext(Task task);
}
