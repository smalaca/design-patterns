package com.smalaca.bridge.repository.mysql;

interface MysqlClient {
    Object save(Object entity);

    void delete(Object entity);

    Object findBy(Object id);

    boolean exists(Object id);
}
