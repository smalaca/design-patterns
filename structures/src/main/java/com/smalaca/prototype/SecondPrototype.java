package com.smalaca.prototype;

public class SecondPrototype implements Prototype {
    private final PartA partA;

    public SecondPrototype(PartA partA) {
        this.partA = partA;
    }

    private SecondPrototype(SecondPrototype prototype) {
        this(prototype.partA);
    }

    @Override
    public Prototype clone() {
        return new SecondPrototype(this);
    }

    @Override
    public void doSomething() {

    }
}
