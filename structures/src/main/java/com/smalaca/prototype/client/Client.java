package com.smalaca.prototype.client;

import com.smalaca.prototype.product.FirstPrototype;
import com.smalaca.prototype.product.PartA;
import com.smalaca.prototype.product.PartB;
import com.smalaca.prototype.product.Prototype;
import com.smalaca.prototype.product.SecondPrototype;

import java.util.HashMap;
import java.util.Map;

public class Client {
    private final Map<PrototypeType, Prototype> prototypes = new HashMap<>();

    public Prototype createNew(PrototypeType type) {
        Prototype prototype = aPrototypeOf(type);

        return prototype.clone();
    }

    private Prototype aPrototypeOf(PrototypeType type) {
        if (!prototypes.containsKey(type)) {
            prototypes.put(type, aFirstPrototype(type));
        }

        return prototypes.get(type);
    }

    private Prototype aFirstPrototype(PrototypeType type) {
        switch (type) {
            case FIRST:
                return new FirstPrototype(new PartA(), new PartB());
            case SECOND:
                return new SecondPrototype(new PartA());
        }

        throw new UnsupportedPrototypeException(type);
    }

    public void doSomething(Prototype prototype) {
        prototype.doSomething();
    }
}
