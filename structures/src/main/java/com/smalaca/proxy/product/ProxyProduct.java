package com.smalaca.proxy.product;

class ProxyProduct implements Product {
    private final RealProductRepository realProductRepository;
    private final String id;
    private Product product;

    ProxyProduct(RealProductRepository realProductRepository, String id) {
        this.realProductRepository = realProductRepository;
        this.id = id;
    }

    @Override
    public void operation1() {
        // some code
    }

    @Override
    public void operation2() {
        // some code
    }

    @Override
    public void heavyOperation() {
        aRealProduct().heavyOperation();
    }

    private Product aRealProduct() {
        if (product == null) {
            product = realProductRepository.findBy(id);
        }

        return product;
    }
}
