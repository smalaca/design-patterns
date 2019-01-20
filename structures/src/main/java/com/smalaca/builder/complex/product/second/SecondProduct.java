package com.smalaca.builder.complex.product.second;

import com.smalaca.builder.complex.client.product.PartA;
import com.smalaca.builder.complex.client.product.PartB;
import com.smalaca.builder.complex.client.product.PartC;
import com.smalaca.builder.complex.client.product.PartD;
import com.smalaca.builder.complex.client.product.Product;

class SecondProduct implements Product {
    private PartD partD;
    private PartC partC;
    private PartB partB;
    private PartA partA;

    @Override
    public void doSomething() {

    }

    void setPartD(PartD partD) {
        this.partD = partD;
    }

    void setPartC(PartC partC) {
        this.partC = partC;
    }

    void setPartB(PartB partB) {
        this.partB = partB;
    }

    void setPartA(PartA partA) {
        this.partA = partA;
    }
}
