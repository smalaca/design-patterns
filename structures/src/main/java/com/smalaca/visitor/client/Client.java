package com.smalaca.visitor.client;

import com.smalaca.visitor.component.Component;
import com.smalaca.visitor.functionality.first.FirstVisitor;
import com.smalaca.visitor.functionality.second.SecondVisitor;

public class Client {
    private final FirstVisitor firstVisitor;
    private final SecondVisitor secondVisitor;

    public Client(FirstVisitor firstVisitor, SecondVisitor secondVisitor) {
        this.firstVisitor = firstVisitor;
        this.secondVisitor = secondVisitor;
    }

    public void doFirstThing(Component component) {
        component.accept(firstVisitor);
    }

    public void doSecondThing(Component component) {
        component.accept(firstVisitor);
    }
}
