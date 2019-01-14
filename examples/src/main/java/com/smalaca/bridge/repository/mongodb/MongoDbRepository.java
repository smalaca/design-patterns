package com.smalaca.bridge.repository.mongodb;

import com.smalaca.bridge.persistence.BaseRepository;
import com.smalaca.bridge.persistence.Cache;
import com.smalaca.bridge.persistence.Entity;
import com.smalaca.bridge.persistence.Id;

public class MongoDbRepository<T extends Id, V extends Entity> extends BaseRepository<T, V> {
    private final MongoClient mongoClient;

    protected MongoDbRepository(Cache cache, MongoClient mongoClient) {
        super(cache);
        this.mongoClient = mongoClient;
    }


    @Override
    public V persist(V entity) {
        return (V) mongoClient.save(entity);
    }

    @Override
    protected void safeUpdate(V entity) {
        mongoClient.save(entity);
    }

    @Override
    protected void safeDelete(V entity) {
        mongoClient.delete(entity);
    }

    @Override
    protected V findBy(T id) {
        return (V) mongoClient.findBy(id);
    }

    @Override
    protected boolean isPersisted(T id) {
        return mongoClient.exists(id);
    }
}
