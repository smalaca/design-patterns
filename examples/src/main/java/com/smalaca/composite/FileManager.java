package com.smalaca.composite;

import com.smalaca.composite.domain.FileNode;
import com.smalaca.composite.domain.FilePath;
import com.smalaca.composite.domain.FileSize;
import com.smalaca.composite.domain.NotExistingFileException;

public class FileManager {
    private FileNode root;

    public boolean exists(FilePath path) {
        return root.existsWith(path);
    }

    public FileNode find(FilePath path) {
        if (exists(path)) {
            return root.get(path);
        }

        throw new NotExistingFileException(path);
    }

    public FileSize sizeOf(FilePath path) {
        return find(path).size();
    }
}
