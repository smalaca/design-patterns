package com.smalaca.flyweight.component;

import java.util.HashMap;
import java.util.Map;

public class ComponentFactory {
    private final Map<ComponentType, Component> components = new HashMap<>();

    public Component aComponentFor(ComponentType type) {
        if (isNotCreated(type)) {
            components.put(type, createFor(type));
        }

        return components.get(type);
    }

    private boolean isNotCreated(ComponentType type) {
        return !components.containsKey(type);
    }

    private Component createFor(ComponentType type) {
        switch (type) {
            case FIRST:
                return new FirstComponent();
            case SECOND:
                return new SecondComponent();
            case THIRD:
                return new ThirdComponent();
        }

        throw new UnsupportedComponentTypeException(type);
    }
}
