package com.smalaca.abstractfactory;

import com.smalaca.abstractfactory.ui.IdeThemeAbstractFactory;
import com.smalaca.abstractfactory.ui.ThemeTypes;
import com.smalaca.abstractfactory.ui.dark.DarkThemeAbstractFactory;
import com.smalaca.abstractfactory.ui.light.LightThemeAbstractFactory;

public class IdeThemeController {
    private IdeThemeAbstractFactory ideThemeAbstractFactory;

    public void chooseTemplate(ThemeTypes type) {
        if (type.equals(ThemeTypes.DARK)) {
            ideThemeAbstractFactory = new DarkThemeAbstractFactory();
        } else if (type.equals(ThemeTypes.LIGHT)) {
            ideThemeAbstractFactory = new LightThemeAbstractFactory();
        } else {
            ideThemeAbstractFactory = aDefaultIdeTheme();
        }

    }

    private LightThemeAbstractFactory aDefaultIdeTheme() {
        return new LightThemeAbstractFactory();
    }
}
