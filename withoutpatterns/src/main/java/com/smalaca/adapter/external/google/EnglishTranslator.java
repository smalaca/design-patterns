package com.smalaca.adapter.external.google;

import com.smalaca.adapter.domain.Translator;

public class EnglishTranslator implements Translator {
    private final GoogleTranslator googleTranslator;

    public EnglishTranslator(GoogleTranslator googleTranslator) {
        this.googleTranslator = googleTranslator;
    }

    @Override
    public String translateToPolish(String word) {
        return googleTranslator.toPolish(word);
    }

    @Override
    public String translateFromPolish(String word) {
        return googleTranslator.toEnglish(word);
    }
}
