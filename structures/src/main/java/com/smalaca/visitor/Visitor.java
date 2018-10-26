package com.smalaca.visitor;

public interface Visitor {
    void visit(FirstComponent firstComponent);
    void visit(SecondComponent secondComponent);
    void visit(ThridComponent thridComponent);
}
