package com.smalaca.visitor.component;

public interface Visitor {
    void visit(FirstComponent firstComponent);
    void visit(SecondComponent secondComponent);
    void visit(ThridComponent thridComponent);
}
