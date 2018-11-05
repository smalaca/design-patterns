package com.smalaca.abstractfactory.ui.dark;

import com.smalaca.abstractfactory.ui.Toolbar;
import com.smalaca.abstractfactory.ui.ToolbarIcons;

class DarkToolbar implements Toolbar {
    private final ToolbarIcons icons;

    DarkToolbar(ToolbarIcons icons) {
        this.icons = icons;
    }

    public void display() {

    }
}
