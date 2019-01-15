package com.smalaca.proxy.repository.mysql;

import com.smalaca.proxy.domain.Image;
import com.smalaca.proxy.domain.ImageId;
import com.smalaca.proxy.domain.Query;

import java.util.List;

public interface MysqlImageRepository {

    List<ImageData> findShallowImageBy(Query query);

    Image findImageBy(ImageId imageId);
}
