package com.smalaca.factorymethod.product.second;

import com.smalaca.factorymethod.product.Factory;
import com.smalaca.factorymethod.product.Product;

public class ProductSecondFactory implements Factory {
    @Override
    public Product product() {
        return new ProductSecond();
    }
}
