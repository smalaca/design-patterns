package com.smalaca.composite.domain;

public interface FileNode {
    boolean existsWith(FilePath path);

    FileNode get(FilePath path);

    FileSize size();
}
