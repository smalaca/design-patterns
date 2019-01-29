package com.smalaca.factorymethod.clients;

import com.smalaca.factorymethod.product.Factory;
import com.smalaca.factorymethod.product.first.ProductFirstFactory;
import com.smalaca.factorymethod.product.second.ProductSecondFactory;

public class ChoiceService {
    private final UsageService usageService;

    public ChoiceService(UsageService usageService) {
        this.usageService = usageService;
    }

    public void choose(FactoryType type) {
        usageService.change(aFactory(type));
    }

    private Factory aFactory(FactoryType type) {
        switch (type) {
            case FIRST:
                return new ProductFirstFactory();

            case SECOND:
                return new ProductSecondFactory();

            default:
                throw new UnsupportedFactoryTypeException(type);
        }
    }
}
