package com.smalaca.prototype.domain;

public class File implements Node {
    private String name;

    public File(String name) {
        this.name = name;
    }

    @Override
    public Node clone() {
        return new File(name);
    }
}
