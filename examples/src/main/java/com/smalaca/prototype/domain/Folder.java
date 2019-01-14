package com.smalaca.prototype.domain;

class Folder implements Node {
    private final String name;

    Folder(String name) {
        this.name = name;
    }

    @Override
    public Node clone() {
        return new Folder(name);
    }
}
