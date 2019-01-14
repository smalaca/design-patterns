package com.smalaca.composite.domain;

public class File {
    private final FileSize size;
    private final FilePath path;

    public File(FileSize size, FilePath path) {
        this.size = size;
        this.path = path;
    }

    public boolean existsWith(FilePath path) {
        return this.path.equals(path);
    }

    public File get(FilePath path) {
        if (existsWith(path)) {
            return this;
        }

        throw new NotExistingFileException(path);
    }

    public FileSize size() {
        return size;
    }
}
