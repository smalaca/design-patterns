package com.smalaca.proxy.domain;

public class RealImage implements Image {
    private final ImageId id;
    private final String name;
    private final String description;
    private final Thumbnail thumbnail;

    public RealImage(ImageId id, String name, String description, Thumbnail thumbnail) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.thumbnail = thumbnail;
    }

    @Override
    public String name() {
        return name;
    }

    @Override
    public String description() {
        return description;
    }

    @Override
    public Thumbnail thumbnail() {
        return thumbnail;
    }
}
