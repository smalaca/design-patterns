package com.smalaca.memento.client;

import com.smalaca.memento.originator.Caretaker;
import com.smalaca.memento.originator.Originator;

public class Client {
    private final Caretaker caretaker;

    public Client(Caretaker caretaker) {
        this.caretaker = caretaker;
    }

    public void save(Originator originator) {
        caretaker.addMemento(originator.aMemento());
    }

    public void restoreLastState() {
        caretaker.getLast().restore();
    }
}
