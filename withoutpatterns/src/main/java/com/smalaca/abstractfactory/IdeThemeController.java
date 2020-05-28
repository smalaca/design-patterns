package com.smalaca.abstractfactory;

import com.smalaca.abstractfactory.ui.ThemeTypes;
import com.smalaca.abstractfactory.ui.ThemeTypesChoice;

public class IdeThemeController {
    private final ThemeTypesChoice themeTypesChoice;

    public IdeThemeController(ThemeTypesChoice themeTypesChoice) {
        this.themeTypesChoice = themeTypesChoice;
    }

    public void chooseTemplate(ThemeTypes themeTypes) {
        themeTypesChoice.change(themeTypes);
    }
}
