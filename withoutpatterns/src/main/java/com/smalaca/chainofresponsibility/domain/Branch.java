package com.smalaca.chainofresponsibility.domain;

public class Branch {
    private final String name;
    private final User author;

    public Branch(String name, User author) {
        this.name = name;
        this.author = author;
    }

    public String name() {
        return name;
    }

    public User anAuthor() {
        return author;
    }
}
