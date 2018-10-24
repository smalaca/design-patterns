package com.smalaca.factorymethod;

public class ProductBCreator implements Creator {
    public Product product() {
        return new ProductB();
    }
}
