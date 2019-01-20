package com.smalaca.command.rollback.first;

import com.smalaca.command.rollback.command.Commands;

public class FirstClient {
    private final Commands commands;

    public FirstClient(Commands commands) {
        this.commands = commands;
    }

    public void doSomething() {
        doStuff();
        commands.add(new FirstCommand());
    }

    private void doStuff() {

    }
}
