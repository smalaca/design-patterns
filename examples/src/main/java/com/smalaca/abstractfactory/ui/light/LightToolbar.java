package com.smalaca.abstractfactory.ui.light;

import com.smalaca.abstractfactory.ui.Toolbar;
import com.smalaca.abstractfactory.ui.ToolbarIcons;

class LightToolbar implements Toolbar {
    private final ToolbarIcons icons;

    LightToolbar(ToolbarIcons icons) {
        this.icons = icons;
    }

    public void display() {

    }
}
