package com.smalaca.command.simple;

import java.util.ArrayList;
import java.util.List;

public class Invoker {
    private final List<Command> commands = new ArrayList<>();

    public void add(Command command) {
        commands.add(command);
    }

    public void doSomething() {
        instruction();
        commands.forEach(Command::execute);
    }

    private void instruction() {

    }
}
