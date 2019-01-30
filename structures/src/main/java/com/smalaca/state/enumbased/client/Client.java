package com.smalaca.state.enumbased.client;

import com.smalaca.state.enumbased.task.Task;

import static com.smalaca.state.enumbased.task.State.FIRST;
import static com.smalaca.state.enumbased.task.State.SECOND;

public class Client {
    public void changeStateToFirst(Task task) {
        task.change(FIRST);
    }

    public void changeStateToSecond(Task task) {
        task.change(SECOND);
    }

    public void doSomething(Task task) {
        // some code
        task.doStuff();
    }
}
