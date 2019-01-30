package com.smalaca.state.interfacebased.client;


import com.smalaca.state.interfacebased.task.FirstState;
import com.smalaca.state.interfacebased.task.SecondState;
import com.smalaca.state.interfacebased.task.Task;

public class Client {
    public void changeStateToFirst(Task task) {
        task.change(new FirstState());
    }

    public void changeStateToSecond(Task task) {
        task.change(new SecondState());
    }

    public void doSomething(Task task) {
        // some code
        task.doStuff();
    }
}
