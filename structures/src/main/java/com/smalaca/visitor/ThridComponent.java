package com.smalaca.visitor;

public class ThridComponent implements Component {
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
