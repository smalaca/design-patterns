package com.smalaca.factorymethod;

public class ProductACreator implements Creator {
    public Product product() {
        return new ProductA();
    }
}
