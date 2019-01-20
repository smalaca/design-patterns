package com.smalaca.composite.client;

import com.smalaca.composite.component.Component;
import com.smalaca.composite.component.Composite;

public class Client {
    public void add(Composite composite, Component component) {
        if (isValid(component)) {
            composite.add(component);
        }
    }

    private boolean isValid(Component component) {
        return false;
    }

    public void remove(Composite composite, Component component) {
        if (composite.contains(component)) {
            composite.remove(component);
        }
    }

    public void doSomething(Component component) {
        component.doSomething();
    }
}
