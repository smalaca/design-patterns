package com.smalaca.bridge.repository.mysql;

import com.smalaca.bridge.persistence.BaseRepository;
import com.smalaca.bridge.persistence.Cache;
import com.smalaca.bridge.persistence.Entity;
import com.smalaca.bridge.persistence.Id;

public class MysqlRepository<T extends Id, V extends Entity>  extends BaseRepository<T, V> {
    private final MysqlClient mysqlClient;

    protected MysqlRepository(Cache cache, MysqlClient mysqlClient) {
        super(cache);
        this.mysqlClient = mysqlClient;
    }

    @Override
    public V persist(V entity) {
        return (V) mysqlClient.save(entity);
    }

    @Override
    protected void safeUpdate(V entity) {
        mysqlClient.save(entity);
    }

    @Override
    protected void safeDelete(V entity) {
        mysqlClient.delete(entity);
    }

    @Override
    protected V findBy(T id) {
        return (V) mysqlClient.findBy(id);
    }

    @Override
    protected boolean isPersisted(T id) {
        return mysqlClient.exists(id);
    }
}
