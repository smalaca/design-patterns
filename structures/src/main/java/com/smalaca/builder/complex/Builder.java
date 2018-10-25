package com.smalaca.builder.complex;

public interface Builder {
    Builder with(PartA partA);
    void with(PartB partB);

    Builder withPartC();
    void withPartD();

    Product build();

    void reset();
}
