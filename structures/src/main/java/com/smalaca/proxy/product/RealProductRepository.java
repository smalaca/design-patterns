package com.smalaca.proxy.product;

interface RealProductRepository {
    RealProduct findBy(String id);
}
