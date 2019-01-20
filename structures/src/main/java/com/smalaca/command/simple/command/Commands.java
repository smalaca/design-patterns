package com.smalaca.command.simple.command;

import java.util.ArrayList;
import java.util.List;

public class Commands {
    private final List<Command> commands = new ArrayList<>();

    public void add(Command command) {
        commands.add(command);
    }

    public void execute() {
        commands.forEach(Command::execute);
    }
}
