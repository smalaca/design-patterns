package com.smalaca.proxy.repository.mysql;

import com.smalaca.proxy.domain.Image;
import com.smalaca.proxy.domain.ImageRepository;
import com.smalaca.proxy.domain.Query;

import java.util.List;

public class MysqlImageRepository implements ImageRepository {
    @Override
    public List<Image> findAllBy(Query query) {
        return null;
    }
}
