package com.smalaca.builder.complex.product.first;

import com.smalaca.builder.complex.domain.product.PartA;
import com.smalaca.builder.complex.domain.product.PartB;
import com.smalaca.builder.complex.domain.product.PartC;
import com.smalaca.builder.complex.domain.product.PartD;
import com.smalaca.builder.complex.domain.product.Product;
import com.smalaca.builder.complex.domain.product.ProductBuilder;

import java.util.Optional;

import static java.util.Optional.empty;
import static java.util.Optional.of;

public class FirstProductBuilder implements ProductBuilder {
    private Optional<PartA> partA;
    private Optional<PartB> partB;
    private Optional<PartC> partC;
    private Optional<PartD> partD;

    public FirstProductBuilder() {
        reset();
    }

    @Override
    public void reset() {
        partA = empty();
        partB = empty();
        partC = empty();
        partD = empty();
    }

    public ProductBuilder with(PartA partA) {
        this.partA = of(partA);
        return this;
    }

    public void with(PartB partB) {
        this.partB = of(partB);
    }

    public ProductBuilder withPartC() {
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
