package com.smalaca.flyweight;

public class FlyweightStateException extends RuntimeException {
    FlyweightStateException(FlyweightState state) {
        super("Not supported state given: " + state.name());
    }
}
