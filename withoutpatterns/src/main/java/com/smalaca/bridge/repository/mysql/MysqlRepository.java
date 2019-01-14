package com.smalaca.bridge.repository.mysql;

import com.smalaca.bridge.persistence.Cache;
import com.smalaca.bridge.persistence.Entity;
import com.smalaca.bridge.persistence.EntityDoesNotExistException;
import com.smalaca.bridge.persistence.Id;
import com.smalaca.bridge.persistence.Repository;

public class MysqlRepository<T extends Id, V extends Entity>  implements Repository<T, V> {
    private final Cache cache;
    private final MysqlClient mysqlClient;

    protected MysqlRepository(Cache cache, MysqlClient mysqlClient) {
        this.cache = cache;
        this.mysqlClient = mysqlClient;
    }

    @Override
    public T save(V entity) {
        V persisted = (V) mysqlClient.save(entity);
        cache.add(persisted);

        return persisted.id();
    }

    @Override
    public void update(V entity) {
        if (exists(entity.id())) {
            mysqlClient.save(entity);
        }

        throw new EntityDoesNotExistException(entity.id());
    }

    @Override
    public void delete(V entity) {
        if (exists(entity.id())) {
            mysqlClient.delete(entity);
        }

        throw new EntityDoesNotExistException(entity.id());
    }

    @Override
    public V find(T id) {
        if (cache.contains(id)) {
            return (V) cache.get(id);
        }

        return (V) mysqlClient.findBy(id);
    }

    @Override
    public boolean exists(T id) {
        return cache.contains(id) || mysqlClient.exists(id);
    }
}
