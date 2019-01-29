package com.smalaca.abstractfactory.clients;

import com.smalaca.abstractfactory.product.AbstractFactory;
import com.smalaca.abstractfactory.product.AbstractFactoryType;
import com.smalaca.abstractfactory.product.UnsupportedAbstractFactoryTypeException;
import com.smalaca.abstractfactory.product.first.FirstAbstractFactory;
import com.smalaca.abstractfactory.product.second.SecondAbstractFactory;

public class ChoiceService {
    private final UsageService usageService;

    public ChoiceService(UsageService usageService) {
        this.usageService = usageService;
    }

    public void choose(AbstractFactoryType type) {
        usageService.change(anAbstractFactory(type));
    }

    private AbstractFactory anAbstractFactory(AbstractFactoryType type) {
        switch (type) {
            case FIRST:
                return new FirstAbstractFactory();

            case SECOND:
                return new SecondAbstractFactory();

            default:
                throw new UnsupportedAbstractFactoryTypeException(type);
        }
    }
}
