package com.smalaca.builder.complex;

import java.util.Optional;

import static java.util.Optional.empty;
import static java.util.Optional.of;

public class FirstBuilder implements Builder {
    private Optional<PartA> partA;
    private Optional<PartB> partB;
    private Optional<PartC> partC;
    private Optional<PartD> partD;

    public FirstBuilder() {
        reset();
    }

    @Override
    public void reset() {
        partA = empty();
        partB = empty();
        partC = empty();
        partD = empty();
    }

    public Builder with(PartA partA) {
        this.partA = of(partA);
        return this;
    }

    public void with(PartB partB) {
        this.partB = of(partB);
    }

    public Builder withPartC() {
        this.partC = of(new PartC());
        return this;
    }

    public void withPartD() {
        this.partD = of(new PartD());
    }

    public Product build() {
        FirstProduct product = new FirstProduct();
        partA.ifPresent(product::setPartA);
        partB.ifPresent(product::setPartB);
        partC.ifPresent(product::setPartC);
        partD.ifPresent(product::setPartD);

        return product;
    }
}
