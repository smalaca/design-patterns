package com.smalaca.flyweight.translator;

import com.smalaca.flyweight.domain.Translator;
import com.smalaca.flyweight.external.dictionary.german.GermanGovWebDictionary;
import com.smalaca.flyweight.external.google.GoogleTranslator;

import java.util.HashMap;
import java.util.Map;

import static com.smalaca.flyweight.translator.TranslatorType.ENGLISH;
import static com.smalaca.flyweight.translator.TranslatorType.GERMAN;

public class TranslatorsFlyweight {
    private final Map<TranslatorType, Translator> translators = new HashMap<>();

    public Translator english() {
        if (!translators.containsKey(ENGLISH)) {
            translators.put(ENGLISH, new EnglishTranslator(new GoogleTranslator()));
        }

        return translators.get(ENGLISH);
    }

    public Translator german() {
        if (!translators.containsKey(GERMAN)) {
            translators.put(GERMAN, new GermanTranslator(new GermanGovWebDictionary()));
        }

        return translators.get(GERMAN);
    }

}
