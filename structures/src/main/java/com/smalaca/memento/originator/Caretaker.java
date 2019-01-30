package com.smalaca.memento.originator;

import java.util.ArrayList;
import java.util.List;

public class Caretaker {
    private final List<Memento> mementos = new ArrayList<>();

    public void addMemento(Memento memento) {
        mementos.add(memento);
    }

    public Memento getLast() {
        return mementos.remove(mementos.size() - 1);
    }
}
