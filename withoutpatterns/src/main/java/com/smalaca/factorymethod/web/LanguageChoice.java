package com.smalaca.factorymethod.web;

import com.smalaca.factorymethod.domain.Language;

public class LanguageChoice {
    private Language language;

    public void change(Language language) {
        this.language = language;
    }

    public Language get() {
        return language;
    }
}
