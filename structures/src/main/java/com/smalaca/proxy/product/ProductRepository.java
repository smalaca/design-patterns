package com.smalaca.proxy.product;

public class ProductRepository {
    private final RealProductRepository realProductRepository;

    public ProductRepository(RealProductRepository realProductRepository) {
        this.realProductRepository = realProductRepository;
    }

    public Product findBy(String id) {
        return findOneBy(id);
    }

    private ProxyProduct findOneBy(String id) {
        return new ProxyProduct(realProductRepository, id);
    }
}
