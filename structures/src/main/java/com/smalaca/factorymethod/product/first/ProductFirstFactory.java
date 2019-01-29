package com.smalaca.factorymethod.product.first;

import com.smalaca.factorymethod.product.Factory;
import com.smalaca.factorymethod.product.Product;

public class ProductFirstFactory implements Factory {
    @Override
    public Product product() {
        return new ProductFirst();
    }
}
