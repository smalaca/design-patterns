package com.smalaca.command.simple.first;

import com.smalaca.command.simple.command.Commands;

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
