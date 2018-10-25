package com.smalaca.builder.complex;

class FirstProduct implements Product {
    private PartA partA;
    private PartB partB;
    private PartC partC;
    private PartD partD;

    void setPartA(PartA partA) {
        this.partA = partA;
    }

    void setPartB(PartB partB) {
        this.partB = partB;
    }

    void setPartC(PartC partC) {
        this.partC = partC;
    }

    void setPartD(PartD partD) {
        this.partD = partD;
    }

    @Override
    public void doSomething() {

    }
}
