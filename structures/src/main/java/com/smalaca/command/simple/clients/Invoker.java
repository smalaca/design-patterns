package com.smalaca.command.simple.clients;

import com.smalaca.command.simple.command.Commands;

public class Invoker {
    private final Commands commands;

    public Invoker(Commands commands) {
        this.commands = commands;
    }

    public void doSomething() {
        instruction1();
        commands.execute();
    }

    private void instruction1() {

    }
}
