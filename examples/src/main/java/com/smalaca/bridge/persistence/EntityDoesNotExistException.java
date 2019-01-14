package com.smalaca.bridge.persistence;

class EntityDoesNotExistException extends RuntimeException {
    EntityDoesNotExistException(Id id) {
        super("Entity with id: " + id + " does not exist.");
    }
}
