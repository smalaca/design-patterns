package com.smalaca.prototype.domain;

class File implements Node {
    private String name;

    File(String name) {
        this.name = name;
    }

    @Override
    public Node clone() {
        return new File(name);
    }
}
