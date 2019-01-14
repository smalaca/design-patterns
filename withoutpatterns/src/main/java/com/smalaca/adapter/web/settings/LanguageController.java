package com.smalaca.adapter.web.settings;

import com.smalaca.adapter.domain.Language;

public class LanguageController {
    private Language language;

    public void choose(Language language) {
        this.language = language;
    }
}
