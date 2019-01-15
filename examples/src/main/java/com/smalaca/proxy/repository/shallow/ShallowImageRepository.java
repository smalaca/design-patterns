package com.smalaca.proxy.repository.shallow;

import com.smalaca.proxy.domain.Image;
import com.smalaca.proxy.domain.ImageRepository;
import com.smalaca.proxy.domain.Query;
import com.smalaca.proxy.repository.mysql.ImageData;
import com.smalaca.proxy.repository.mysql.MysqlImageRepository;

import java.util.List;
import java.util.stream.Collectors;

public class ShallowImageRepository implements ImageRepository {
    private final MysqlImageRepository mysqlImageRepository;

    public ShallowImageRepository(MysqlImageRepository mysqlImageRepository) {
        this.mysqlImageRepository = mysqlImageRepository;
    }

    @Override
    public List<Image> findAllBy(Query query) {
        List<ImageData> shallowImages = mysqlImageRepository.findShallowImageBy(query);

        return shallowImages.stream()
                .map(this::asProxyImage)
                .collect(Collectors.toList());
    }

    private Image asProxyImage(ImageData imageData) {
        return new ProxyImage(imageData, mysqlImageRepository::findImageBy);
    }
}
