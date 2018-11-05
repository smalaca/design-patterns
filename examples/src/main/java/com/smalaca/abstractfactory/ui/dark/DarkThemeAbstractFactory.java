package com.smalaca.abstractfactory.ui.dark;

import com.smalaca.abstractfactory.ui.IdeThemeAbstractFactory;
import com.smalaca.abstractfactory.ui.Toolbar;
import com.smalaca.abstractfactory.ui.ToolbarIcons;
import com.smalaca.abstractfactory.ui.Window;

public class DarkThemeAbstractFactory implements IdeThemeAbstractFactory {
    public Window createWindow() {
        return new DarkWindow();
    }

    public Toolbar createToolbar(ToolbarIcons icons) {
        return new DarkToolbar(icons);
    }
}
