package com.smalaca.visitor;

public interface Component {
    void accept(Visitor visitor);
}
