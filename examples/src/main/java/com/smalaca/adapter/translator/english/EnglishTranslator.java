package com.smalaca.adapter.translator.english;

import com.smalaca.adapter.domain.Translator;
import com.smalaca.adapter.external.google.GoogleTranslator;

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
