package com.smalaca.bridge.persistence;

public interface Cache<T extends Id, V extends Entity> {
    boolean contains(T id);

    V get(T id);

    void add(V entity);
}
