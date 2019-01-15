package com.smalaca.proxy.domain;

public class Image {
    private final ImageId id;
    private final String name;
    private final String description;
    private final Thumbnail thumbnail;

    public Image(ImageId id, String name, String description, Thumbnail thumbnail) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.thumbnail = thumbnail;
    }

    public String name() {
        return name;
    }

    public String description() {
        return description;
    }

    public Thumbnail thumbnail() {
        return thumbnail;
    }
}
