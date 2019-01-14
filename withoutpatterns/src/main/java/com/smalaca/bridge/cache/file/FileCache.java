package com.smalaca.bridge.cache.file;

import com.smalaca.bridge.persistence.Cache;
import com.smalaca.bridge.persistence.Entity;
import com.smalaca.bridge.persistence.Id;

public class FileCache implements Cache {
    private final File file;

    public FileCache(File file) {
        this.file = file;
    }

    @Override
    public boolean contains(Id id) {
        return file.lines().stream().anyMatch(line -> line.startsWith(id.toString()));
    }

    @Override
    public Entity get(Id id) {
        String found = file.lines().stream()
                .filter(line -> line.startsWith(id.toString()))
                .findFirst()
                .get();
        return entityFrom(found);
    }

    private Entity entityFrom(String line) {
        return null;
    }

    @Override
    public void add(Entity entity) {
        file.write(entity);
    }
}
