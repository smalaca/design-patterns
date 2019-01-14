package com.smalaca.prototype.domain;

public class NodesFactory {
    public Node templateFile() {
        return new File("New File");
    }

    public Node templateFolder() {
        return new Folder("New Folder");
    }
}
