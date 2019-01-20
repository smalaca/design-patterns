package com.smalaca.command.rollback.second;

import com.smalaca.command.rollback.command.Commands;

public class SecondClient {
    private final Commands commands;

    public SecondClient(Commands commands) {
        this.commands = commands;
    }

    public void doSomething() {
        doStuff();
        commands.add(new SecondCommand());
    }

    private void doStuff() {

    }
}
