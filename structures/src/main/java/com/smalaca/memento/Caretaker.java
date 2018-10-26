package com.smalaca.memento;

import java.util.ArrayList;
import java.util.List;

public class Caretaker {
    private final List<Memento> mementos = new ArrayList<>();

    public void addMemento(Memento memento) {
        mementos.add(memento);
    }

    public Memento getMemento(int index) {
        return mementos.get(index);
    }

    public Memento getLast() {
        return mementos.get(mementos.size() - 1);
    }
}
