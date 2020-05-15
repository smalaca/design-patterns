package com.smalaca.adapter.external.google;

public class EnglishTranslator {
    private final GoogleTranslator googleTranslator;

    public EnglishTranslator(GoogleTranslator googleTranslator) {
        this.googleTranslator = googleTranslator;
    }

    public String translateToPolish(String word) {
        return googleTranslator.toPolish(word);
    }

    public String translateFromPolish(String word) {
        return googleTranslator.toEnglish(word);
    }
}
