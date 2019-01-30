package com.smalaca.flyweight.component;

class UnsupportedComponentTypeException extends RuntimeException {
    UnsupportedComponentTypeException(ComponentType type) {
        super("Not supported type given: " + type.name());
    }
}
