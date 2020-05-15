package com.smalaca.flyweight.translator;

import com.smalaca.flyweight.domain.Translator;
import com.smalaca.flyweight.external.dictionary.german.GermanGovWebDictionary;
import com.smalaca.flyweight.external.google.GoogleTranslator;

public class TranslatorsFactory {
    private EnglishTranslator englishTranslator;
    private GermanTranslator germanTranslator;

    public Translator english() {
        if (englishTranslator == null) {
            englishTranslator = new EnglishTranslator(new GoogleTranslator());
        }

        return englishTranslator;
    }

    public Translator german() {
        if (germanTranslator != null) {
            germanTranslator = new GermanTranslator(new GermanGovWebDictionary());
        }

        return germanTranslator;
    }
}
