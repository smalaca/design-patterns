package com.smalaca.command.rollback;

import java.util.ArrayList;
import java.util.List;

public class Invoker {
    private final List<Command> commands = new ArrayList<>();

    public void add(Command command) {
        commands.add(command);
    }

    public void doSomething() {
        doStuff();
        commands.forEach(Command::execute);
    }

    private void doStuff() {

    }

    public void revertSomething() {
        doOtherThing();
        commands.forEach(Command::rollback);
    }

    private void doOtherThing() {

    }

}
