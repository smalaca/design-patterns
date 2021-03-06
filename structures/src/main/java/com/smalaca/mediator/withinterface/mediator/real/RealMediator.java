package com.smalaca.mediator.withinterface.mediator.real;

import com.smalaca.mediator.withinterface.mediator.Colleague;
import com.smalaca.mediator.withinterface.mediator.Mediator;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class RealMediator implements Mediator {
    private final List<Colleague> colleagues = new ArrayList<>();

    @Override
    public void add(Colleague colleague) {
        colleagues.add(colleague);
    }

    @Override
    public void send(String message, Colleague sender) {
        colleagues.stream()
                .filter(isNotSameAs(sender))
                .forEach(send(message));
    }

    private Predicate<Colleague> isNotSameAs(Colleague sender) {
        return colleague -> !colleague.equals(sender);
    }

    private Consumer<Colleague> send(String message) {
        return colleague -> colleague.receive(message);
    }
}
