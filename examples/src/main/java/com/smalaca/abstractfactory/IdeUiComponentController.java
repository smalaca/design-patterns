package com.smalaca.abstractfactory;

import com.smalaca.abstractfactory.domain.Project;
import com.smalaca.abstractfactory.ui.IdeThemeAbstractFactory;
import com.smalaca.abstractfactory.ui.Toolbar;
import com.smalaca.abstractfactory.ui.ToolbarIcons;
import com.smalaca.abstractfactory.ui.Window;

public class IdeUiComponentController {
    private final IdeThemeAbstractFactory ideThemeAbstractFactory;

    public IdeUiComponentController(IdeThemeAbstractFactory ideThemeAbstractFactory) {
        this.ideThemeAbstractFactory = ideThemeAbstractFactory;
    }

    public void createProject() {
        Window window = ideThemeAbstractFactory.createWindow();
        window.display();
    }

    public void loadProject() {
        Project project = loadProjectFrom();

        Window window = aWindow();

        window.load(project);
        window.display();
    }

    private Window aWindow() {
        return ideThemeAbstractFactory.createWindow();
    }

    private Project loadProjectFrom() {
        return null;
    }

    public void openToolbar(ToolbarIcons icons) {
        Toolbar toolbar = aToolbar(icons);

        toolbar.display();
    }

    private Toolbar aToolbar(ToolbarIcons icons) {
        return ideThemeAbstractFactory.createToolbar(icons);
    }
}
