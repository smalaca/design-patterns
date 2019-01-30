package com.smalaca.prototype.product;

public class FirstPrototype implements Prototype {
    private final PartA partA;
    private final PartB partB;

    public FirstPrototype(PartA partA, PartB partB) {
        this.partA = partA;
        this.partB = partB;
    }

    @Override
    public Prototype clone() {
        return new FirstPrototype(partA, partB);
    }

    @Override
    public void doSomething() {

    }
}
