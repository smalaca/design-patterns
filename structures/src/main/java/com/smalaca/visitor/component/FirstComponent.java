package com.smalaca.visitor.component;

public class FirstComponent implements Component {
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
