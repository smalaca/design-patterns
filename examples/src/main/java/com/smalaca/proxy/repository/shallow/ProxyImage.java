package com.smalaca.proxy.repository.shallow;

import com.smalaca.proxy.domain.Image;
import com.smalaca.proxy.domain.ImageId;
import com.smalaca.proxy.domain.Thumbnail;
import com.smalaca.proxy.repository.mysql.ImageData;

import java.util.function.Function;

public class ProxyImage implements Image {
    private final ImageId id;
    private final String name;
    private final String description;
    private final Function<ImageId, Image> imageQuery;
    private Image image;

    ProxyImage(ImageData imageData, Function<ImageId, Image> imageQuery) {
        id = imageData.id();
        name = imageData.name();
        description = imageData.description();
        this.imageQuery = imageQuery;
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
        if (image == null) {
            image = imageQuery.apply(id);
        }

        return image.thumbnail();
    }
}
