package com.smalaca.mediator.withinterface.mediator;

public interface Mediator {
    void add(Colleague colleague);

    void send(String message, Colleague colleague);
}
