package com.smalaca.abstractfactory;

import com.smalaca.abstractfactory.ui.dark.DarkThemeAbstractFactory;
import com.smalaca.abstractfactory.ui.IdeThemeAbstractFactory;
import com.smalaca.abstractfactory.ui.light.LightThemeAbstractFactory;
import com.smalaca.abstractfactory.ui.ThemeTypes;

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
