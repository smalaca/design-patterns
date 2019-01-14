package com.smalaca.bridge.repository.mongodb;

interface MongoClient {
    Object save(Object entity);

    void delete(Object entity);

    Object findBy(Object id);

    boolean exists(Object id);
}
