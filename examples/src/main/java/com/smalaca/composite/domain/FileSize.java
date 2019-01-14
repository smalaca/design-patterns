package com.smalaca.composite.domain;

public class FileSize {
    static final FileSize ZERO = new FileSize(0);

    private final long value;

    FileSize(long value) {
        this.value = value;
    }

    FileSize add(FileSize fileSize) {
        return new FileSize(value + fileSize.value);
    }
}
