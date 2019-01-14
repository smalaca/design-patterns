package com.smalaca.flyweight.translator;

import com.smalaca.flyweight.domain.Translator;
import com.smalaca.flyweight.external.dictionary.german.GermanGovWebDictionary;
import com.smalaca.flyweight.external.google.GoogleTranslator;

public class TranslatorsFactory {
    public Translator english() {
        return new EnglishTranslator(new GoogleTranslator());
    }

    public Translator german() {
        return new GermanTranslator(new GermanGovWebDictionary());
    }
}
