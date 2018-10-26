package com.smalaca.mediator.simple;

public interface Mediator {
    void send(String message, Colleague colleague);
}
