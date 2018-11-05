package com.smalaca.abstractfactory.ui;

import com.smalaca.abstractfactory.domain.Project;

public interface Window {
    void load(Project project);

    void display();
}
