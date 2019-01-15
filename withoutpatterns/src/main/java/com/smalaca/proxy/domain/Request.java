package com.smalaca.proxy.domain;

public interface Request {
    Query aQuery();

    boolean shouldDisplayWithThumbnail();
}
