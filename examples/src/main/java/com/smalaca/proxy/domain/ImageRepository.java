package com.smalaca.proxy.domain;

import java.util.List;

public interface ImageRepository {
    List<Image> findAllBy(Query query);
}
