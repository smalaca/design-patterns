package com.smalaca.bridge.persistence;

public interface Repository<T extends Id, V extends Entity> {
    T save(V entity);

    void update(V entity);

    void delete(V entity);

    V find(T id);

    boolean exists(T id);
}
