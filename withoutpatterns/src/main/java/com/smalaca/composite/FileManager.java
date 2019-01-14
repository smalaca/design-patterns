package com.smalaca.composite;

import com.smalaca.composite.domain.Directory;
import com.smalaca.composite.domain.File;
import com.smalaca.composite.domain.FilePath;
import com.smalaca.composite.domain.FileSize;
import com.smalaca.composite.domain.NotExistingFileException;

public class FileManager {
    private Directory root;

    public boolean existsDirectory(FilePath path) {
        return root.existsDirectory(path);
    }

    public boolean existsFile(FilePath path) {
        return root.existsFile(path);
    }

    public File findFile(FilePath path) {
        if (existsFile(path)) {
            return root.getFile(path);
        }

        throw new NotExistingFileException(path);
    }

    public Directory findDirectory(FilePath path) {
        if (existsDirectory(path)) {
            return root.getDirectory(path);
        }

        throw new NotExistingFileException(path);
    }

    public FileSize sizeOf(FilePath path) {
        if (existsFile(path)) {
            return findFile(path).size();
        }

        if (existsDirectory(path)) {
            return findDirectory(path).size();
        }

        return FileSize.ZERO;
    }
}
