package com.smalaca.visitor.component;

public class ThridComponent implements Component {
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
