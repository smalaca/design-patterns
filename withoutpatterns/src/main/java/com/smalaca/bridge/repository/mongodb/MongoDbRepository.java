package com.smalaca.bridge.repository.mongodb;

import com.smalaca.bridge.persistence.Cache;
import com.smalaca.bridge.persistence.Entity;
import com.smalaca.bridge.persistence.EntityDoesNotExistException;
import com.smalaca.bridge.persistence.Id;
import com.smalaca.bridge.persistence.Repository;

public class MongoDbRepository<T extends Id, V extends Entity> implements Repository<T, V> {
    private final Cache cache;
    private final MongoClient mongoClient;

    protected MongoDbRepository(Cache cache, MongoClient mongoClient) {
        this.cache = cache;
        this.mongoClient = mongoClient;
    }

    @Override
    public T save(V entity) {
        V persisted = (V) mongoClient.save(entity);
        cache.add(persisted);

        return persisted.id();
    }

    @Override
    public void update(V entity) {
        if (exists(entity.id())) {
            mongoClient.save(entity);
        }

        throw new EntityDoesNotExistException(entity.id());
    }

    @Override
    public void delete(V entity) {
        if (exists(entity.id())) {
            mongoClient.delete(entity);
        }

        throw new EntityDoesNotExistException(entity.id());
    }

    @Override
    public V find(T id) {
        if (cache.contains(id)) {
            return (V) cache.get(id);
        }

        return (V) mongoClient.findBy(id);
    }

    @Override
    public boolean exists(T id) {
        return cache.contains(id) || mongoClient.exists(id);
    }
}
