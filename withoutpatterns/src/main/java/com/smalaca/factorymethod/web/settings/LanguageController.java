package com.smalaca.factorymethod.web.settings;

import com.smalaca.factorymethod.domain.Language;
import com.smalaca.factorymethod.web.LanguageChoice;

public class LanguageController {
    private final LanguageChoice languageChoice;

    public LanguageController(LanguageChoice languageChoice) {
        this.languageChoice = languageChoice;
    }

    public void choose(Language language) {
        languageChoice.change(language);
    }
}
