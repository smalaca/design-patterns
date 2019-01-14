package com.smalaca.prototype.domain;

public class Folder implements Node {
    private final String name;

    public Folder(String name) {
        this.name = name;
    }

    @Override
    public Node clone() {
        return new Folder(name);
    }
}
