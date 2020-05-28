package com.smalaca.abstractfactory.ui;

public class ThemeTypesChoice {
    private ThemeTypes themeTypes;

    public void change(ThemeTypes themeTypes) {
        this.themeTypes = themeTypes;
    }

    public ThemeTypes get() {
        return themeTypes;
    }
}
