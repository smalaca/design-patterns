package com.smalaca.proxy.client;

import com.smalaca.proxy.product.Product;
import com.smalaca.proxy.product.ProductRepository;

public class Client {
    private final ProductRepository productRepository;

    public Client(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public void doSomething(String id, boolean shouldInvokeHeavyOperation) {
        Product product = productRepository.findBy(id);

        product.operation1();
        product.operation2();

        if (shouldInvokeHeavyOperation) {
            product.heavyOperation();
        }
    }
}
