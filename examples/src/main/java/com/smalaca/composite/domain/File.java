package com.smalaca.composite.domain;

public class File implements FileNode {
    private final FileSize size;
    private final FilePath path;

    public File(FileSize size, FilePath path) {
        this.size = size;
        this.path = path;
    }

    @Override
    public boolean existsWith(FilePath path) {
        return this.path.equals(path);
    }

    @Override
    public FileNode get(FilePath path) {
        if (existsWith(path)) {
            return this;
        }

        throw new NotExistingFileException(path);
    }

    @Override
    public FileSize size() {
        return size;
    }
}
