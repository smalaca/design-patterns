package com.smalaca.bridge.persistence;

public abstract class BaseRepository<T extends Id, V extends Entity> implements Repository<T, V> {
    private final Cache cache;

    protected BaseRepository(Cache cache) {
        this.cache = cache;
    }

    @Override
    public T save(V entity) {
        V persisted = persist(entity);
        cache.add(persisted);

        return persisted.id();
    }

    protected abstract V persist(V entity);

    @Override
    public void update(V entity) {
        if (exists(entity.id())) {
            safeUpdate(entity);
        }

        throw new EntityDoesNotExistException(entity.id());
    }

    protected abstract void safeUpdate(V entity);

    @Override
    public void delete(V entity) {
        if (exists(entity.id())) {
            safeDelete(entity);
        }

        throw new EntityDoesNotExistException(entity.id());
    }

    protected abstract void safeDelete(V entity);

    @Override
    public V find(T id) {
        if (cache.contains(id)) {
            return (V) cache.get(id);
        }

        return findBy(id);
    }

    protected abstract V findBy(T id);

    @Override
    public boolean exists(T id) {
        return cache.contains(id) || isPersisted(id);
    }

    protected abstract boolean isPersisted(T id);
}
