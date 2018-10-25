package com.smalaca.builder.simple;

public class Product {
    private final PartA partA;
    private final PartB partB;
    private PartC partC;
    private PartD partD;

    Product(PartA partA, PartB partB) {
        this.partA = partA;
        this.partB = partB;
    }

    void setPartC(PartC partC) {
        this.partC = partC;
    }

    void setPartD(PartD partD) {
        this.partD = partD;
    }

    public void doSomething() {

    }
}
