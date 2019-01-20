package com.smalaca.command.rollback.clients;

import com.smalaca.command.rollback.command.Commands;

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

    public void revertAll() {
        commands.rollback();
        instruction2();
    }

    private void instruction2() {

    }
}
