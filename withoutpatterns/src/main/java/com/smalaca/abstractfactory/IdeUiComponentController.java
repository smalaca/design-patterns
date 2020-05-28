package com.smalaca.abstractfactory;

import com.smalaca.abstractfactory.domain.Project;
import com.smalaca.abstractfactory.ui.ThemeTypesChoice;
import com.smalaca.abstractfactory.ui.Toolbar;
import com.smalaca.abstractfactory.ui.ToolbarIcons;
import com.smalaca.abstractfactory.ui.Window;
import com.smalaca.abstractfactory.ui.dark.DarkToolbar;
import com.smalaca.abstractfactory.ui.dark.DarkWindow;
import com.smalaca.abstractfactory.ui.light.LightToolbar;
import com.smalaca.abstractfactory.ui.light.LightWindow;

public class IdeUiComponentController {
    private final ThemeTypesChoice themeTypesChoice;

    public IdeUiComponentController(ThemeTypesChoice themeTypesChoice) {
        this.themeTypesChoice = themeTypesChoice;
    }

    public void createProject() {
        Window window = createWindow();
        window.display();
    }

    public void loadProject() {
        Project project = loadProjectFrom();

        Window window = createWindow();

        window.load(project);
        window.display();
    }

    private Window createWindow() {
        switch (themeTypesChoice.get()) {
            case DARK:
                return new DarkWindow();
            case LIGHT:
            default:
                return new LightWindow();
        }
    }

    private Project loadProjectFrom() {
        return null;
    }

    public void openToolbar(ToolbarIcons icons) {
        Toolbar toolbar = createToolbar(icons);

        toolbar.display();
    }

    private Toolbar createToolbar(ToolbarIcons icons) {
        switch (themeTypesChoice.get()) {
            case DARK:
                return new DarkToolbar(icons);
            case LIGHT:
            default:
                return new LightToolbar(icons);
        }
    }
}
