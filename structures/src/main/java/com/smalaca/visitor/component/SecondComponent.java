package com.smalaca.visitor.component;

public class SecondComponent implements Component {
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
