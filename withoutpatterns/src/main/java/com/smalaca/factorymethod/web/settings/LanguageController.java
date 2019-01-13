package com.smalaca.factorymethod.web.settings;

import com.smalaca.factorymethod.domain.Language;

public class LanguageController {
    private Language language;

    public void choose(Language language) {
        this.language = language;
    }
}
