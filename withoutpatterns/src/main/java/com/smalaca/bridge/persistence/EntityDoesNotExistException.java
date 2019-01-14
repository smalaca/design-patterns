package com.smalaca.bridge.persistence;

public class EntityDoesNotExistException extends RuntimeException {
    public EntityDoesNotExistException(Id id) {
        super("Entity with id: " + id + " does not exist.");
    }
}
