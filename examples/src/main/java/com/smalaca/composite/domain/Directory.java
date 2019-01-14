package com.smalaca.composite.domain;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Directory implements FileNode {
    private final List<FileNode> fileNodes = new ArrayList<>();
    private final FilePath path;

    public Directory(FilePath path) {
        this.path = path;
    }

    @Override
    public boolean existsWith(FilePath path) {
        return this.path.equals(path) ||
                fileNodes.stream().anyMatch(fileNode -> fileNode.existsWith(path));
    }

    @Override
    public FileNode get(FilePath path) {
        if (this.path.equals(path)) {
            return this;
        }

        Optional<FileNode> first = fileNodes.stream()
                .filter(fileNode -> fileNode.existsWith(path))
                .findFirst();

        if (first.isPresent()) {
            return first.get();
        }

        throw new NotExistingFileException(path);

    }

    @Override
    public FileSize size() {
        FileSize sum = FileSize.ZERO;

        for (FileNode fileNode : fileNodes) {
            sum = sum.add(fileNode.size());
        }

        return sum;
    }
}
