package com.smalaca.composite.component;

import java.util.ArrayList;
import java.util.Collection;

public class Composite implements Component {
    private final Collection<Component> components = new ArrayList<>();

    public void add(Component component) {
        components.add(component);
    }

    public void remove(Component component) {
        components.remove(component);
    }

    public boolean contains(Component component) {
        return components.contains(component);
    }

    @Override
    public void doSomething() {
        components.forEach(Component::doSomething);
    }
}
