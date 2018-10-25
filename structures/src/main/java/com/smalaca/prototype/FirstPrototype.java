package com.smalaca.prototype;

public class FirstPrototype implements Prototype {
    private final PartA partA;
    private final PartB partB;

    public FirstPrototype(PartA partA, PartB partB) {
        this.partA = partA;
        this.partB = partB;
    }

    private FirstPrototype(FirstPrototype prototype) {
        this(prototype.partA, prototype.partB);
    }

    @Override
    public Prototype clone() {
        return new FirstPrototype(this);
    }

    @Override
    public void doSomething() {

    }
}
