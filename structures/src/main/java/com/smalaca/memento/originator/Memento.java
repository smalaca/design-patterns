package com.smalaca.memento.originator;

public class Memento {
    private final Originator originator;
    private final FirstValue firstValue;
    private final SecondValue secondValue;

    Memento(Originator originator, FirstValue firstValue, SecondValue secondValue) {
        this.originator = originator;
        this.firstValue = firstValue;
        this.secondValue = secondValue;
    }

    public void restore() {
        originator.changeTo(firstValue, secondValue);
    }
}
