package com.smalaca.flyweight.client;

import com.smalaca.flyweight.component.Component;
import com.smalaca.flyweight.component.ComponentFactory;
import com.smalaca.flyweight.component.ComponentType;

public class Client {
    private final ComponentFactory componentFactory;

    public Client(ComponentFactory componentFactory) {
        this.componentFactory = componentFactory;
    }

    public void doSomethingWith(ComponentType type) {
        Component component = componentFactory.aComponentFor(type);

        doSomething(component);
    }

    private void doSomething(Component component) {

    }
}
