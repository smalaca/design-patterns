package com.smalaca.abstractfactory.ui.light;

import com.smalaca.abstractfactory.ui.IdeThemeAbstractFactory;
import com.smalaca.abstractfactory.ui.Toolbar;
import com.smalaca.abstractfactory.ui.ToolbarIcons;
import com.smalaca.abstractfactory.ui.Window;

public class LightThemeAbstractFactory implements IdeThemeAbstractFactory {
    public Window createWindow() {
        return new LightWindow();
    }

    public Toolbar createToolbar(ToolbarIcons icons) {
        return new LightToolbar(icons);
    }
}
