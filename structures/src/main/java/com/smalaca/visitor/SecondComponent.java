package com.smalaca.visitor;

public class SecondComponent implements Component {
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
