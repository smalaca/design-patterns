package com.smalaca.abstractfactory.ui;

public interface IdeThemeAbstractFactory {
    Window createWindow();

    Toolbar createToolbar(ToolbarIcons icons);
}
