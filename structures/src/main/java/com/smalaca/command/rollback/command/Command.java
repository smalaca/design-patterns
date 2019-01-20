package com.smalaca.command.rollback.command;

public interface Command {
    void execute();

    void rollback();
}
