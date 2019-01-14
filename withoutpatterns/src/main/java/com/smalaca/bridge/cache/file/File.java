package com.smalaca.bridge.cache.file;

import com.smalaca.bridge.persistence.Entity;

import java.util.List;

interface File {
    void write(Entity entity);

    List<String> lines();
}
