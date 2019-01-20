package com.smalaca.command.simple.second;

import com.smalaca.command.simple.command.Commands;

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
