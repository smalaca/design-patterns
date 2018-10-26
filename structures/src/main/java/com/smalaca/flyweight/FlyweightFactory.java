package com.smalaca.flyweight;

import java.util.HashMap;
import java.util.Map;

public class FlyweightFactory {
    private final Map<FlyweightState, Flyweight> cache = new HashMap<>();

    public Flyweight aFlyweightFor(FlyweightState state) {
        if (flyweightNotCreatedFor(state)) {
            cache.put(state, createFlyweightFor(state));
        }

        return cache.get(state);
    }

    private boolean flyweightNotCreatedFor(FlyweightState state) {
        return !cache.containsKey(state);
    }

    private Flyweight createFlyweightFor(FlyweightState state) {
        switch (state) {
            case START:
                return new StartFlyweight();
            case CONTINUATION:
                return new ContinuationFlyweigh();
            case END:
                return new EndFlyweight();
        }

        throw new FlyweightStateException(state);
    }
}
