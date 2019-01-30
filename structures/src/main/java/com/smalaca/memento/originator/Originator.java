package com.smalaca.memento.originator;

public class Originator {
    private FirstValue firstValue;
    private SecondValue secondValue;

    public Originator(FirstValue firstValue, SecondValue secondValue) {
        changeTo(firstValue, secondValue);
    }

    void changeTo(FirstValue firstValue, SecondValue secondValue) {
        this.firstValue = firstValue;
        this.secondValue = secondValue;
    }

    public Memento aMemento() {
        return new Memento(this, firstValue, secondValue);
    }
}
