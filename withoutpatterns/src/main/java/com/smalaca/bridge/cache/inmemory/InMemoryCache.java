package com.smalaca.bridge.cache.inmemory;

import com.smalaca.bridge.persistence.Cache;
import com.smalaca.bridge.persistence.Entity;
import com.smalaca.bridge.persistence.Id;

import java.util.HashMap;
import java.util.Map;

public class InMemoryCache implements Cache {
    private final Map<Id, Entity> entities = new HashMap<>();

    @Override
    public void add(Entity entity) {
        entities.put(entity.id(), entity);
    }

    @Override
    public boolean contains(Id id) {
        return entities.containsKey(id);
    }

    @Override
    public Entity get(Id id) {
        return entities.get(id);
    }
}
