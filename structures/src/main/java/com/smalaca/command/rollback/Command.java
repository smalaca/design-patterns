package com.smalaca.command.rollback;

public interface Command {
    void execute();

    void rollback();
}
