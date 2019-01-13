package com.smalaca.abstractfactory;

import com.smalaca.abstractfactory.ui.ThemeTypes;

public class IdeThemeController {
    private ThemeTypes themeType;

    public void chooseTemplate(ThemeTypes type) {
        themeType = type;
    }
}
