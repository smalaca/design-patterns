package com.smalaca.proxy;

import com.smalaca.proxy.domain.Display;
import com.smalaca.proxy.domain.DisplayBlock;
import com.smalaca.proxy.domain.Image;
import com.smalaca.proxy.domain.ImageRepository;
import com.smalaca.proxy.domain.Request;

import java.util.List;

public class ImageService {
    private final ImageRepository imageRepository;

    public ImageService(ImageRepository imageRepository) {
        this.imageRepository = imageRepository;
    }

    public void displayAll(Display display, Request request) {
        List<Image> images = imageRepository.findAllBy(request.aQuery());

        for (Image image : images) {
            DisplayBlock displayBlock = new DisplayBlock(image.name(), image.description());

            if (request.shouldDisplayWithThumbnail()) {
                displayBlock.add(image.thumbnail());
            }

            display.add(displayBlock);
        }
    }
}
