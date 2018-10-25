package com.smalaca.decorator;

abstract public class BaseDecorator implements Component {
    private final Component component;

    protected BaseDecorator(Component component) {
        this.component = component;
    }

    protected Component component() {
        return component;
    }
}
