package com.smalaca.visitor;

public class FirstComponent implements Component {
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
