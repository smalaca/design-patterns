package com.smalaca.flyweight.translator;

import com.smalaca.flyweight.domain.Translator;
import com.smalaca.flyweight.external.google.GoogleTranslator;

class EnglishTranslator implements Translator {
    private final GoogleTranslator googleTranslator;

    EnglishTranslator(GoogleTranslator googleTranslator) {
        this.googleTranslator = googleTranslator;
    }

    @Override
    public String fromPolish(String word) {
        return googleTranslator.toEnglish(word);
    }

    @Override
    public String toPolish(String word) {
        return googleTranslator.toPolish(word);
    }
}
