package com.smalaca.flyweight.web.settings;

import com.smalaca.flyweight.domain.Language;

public class LanguageController {
    private Language language;

    public void choose(Language language) {
        this.language = language;
    }
}
