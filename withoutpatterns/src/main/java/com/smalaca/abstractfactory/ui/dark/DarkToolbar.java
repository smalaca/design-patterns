package com.smalaca.abstractfactory.ui.dark;

import com.smalaca.abstractfactory.ui.Toolbar;
import com.smalaca.abstractfactory.ui.ToolbarIcons;

public class DarkToolbar implements Toolbar {
    private final ToolbarIcons icons;

    public DarkToolbar(ToolbarIcons icons) {
        this.icons = icons;
    }

    public void display() {

    }
}
