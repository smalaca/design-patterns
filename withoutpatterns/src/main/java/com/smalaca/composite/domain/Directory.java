package com.smalaca.composite.domain;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Directory {
    private final List<File> files = new ArrayList<>();
    private final List<Directory> directories = new ArrayList<>();
    private final FilePath path;

    public Directory(FilePath path) {
        this.path = path;
    }

    public boolean existsFile(FilePath path) {
        return
                files.stream().anyMatch(file -> file.existsWith(path)) ||
                directories.stream().anyMatch(directory -> directory.existsFile(path));
    }

    public boolean existsDirectory(FilePath path) {
        return
                this.path.equals(path) ||
                directories.stream().anyMatch(directory -> directory.existsDirectory(path));
    }

    public File getFile(FilePath path) {
        Optional<File> first = files.stream()
                .filter(file -> file.existsWith(path))
                .findFirst();

        if (first.isPresent()) {
            return first.get();
        }

        first = directories.stream()
                .filter(directory -> directory.existsFile(path))
                .map(directory -> directory.getFile(path))
                .findFirst();

        if (first.isPresent()) {
            return first.get();
        }

        throw new NotExistingFileException(path);
    }

    public Directory getDirectory(FilePath path) {
        if (this.path.equals(path)) {
            return this;
        }

        Optional<Directory> first = directories.stream()
                .filter(directory -> directory.existsDirectory(path))
                .findFirst();

        if (first.isPresent()) {
            return first.get();
        }

        throw new NotExistingFileException(path);
    }

    public FileSize size() {
        FileSize sum = FileSize.ZERO;

        for (File file : files) {
            sum = sum.add(file.size());
        }

        for (Directory directory : directories) {
            sum = sum.add(directory.size());
        }

        return sum;
    }
}
