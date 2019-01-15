package com.smalaca.proxy.repository.mysql;

import com.smalaca.proxy.domain.ImageId;

public interface ImageData {
    String name();

    String description();

    ImageId id();
}
