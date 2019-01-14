package com.smalaca.flyweight.translator;

import com.smalaca.flyweight.domain.Translator;
import com.smalaca.flyweight.external.dictionary.german.GermanGovWebDictionary;
import com.smalaca.flyweight.external.google.GoogleTranslator;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Supplier;

import static com.smalaca.flyweight.translator.TranslatorType.ENGLISH;
import static com.smalaca.flyweight.translator.TranslatorType.GERMAN;

public class TranslatorsFlyweight {
    private final Map<TranslatorType, Translator> translators = new HashMap<>();

    public Translator english() {
        return aTranslator(ENGLISH, () -> new EnglishTranslator(new GoogleTranslator()));
    }

    public Translator german() {
        return aTranslator(GERMAN, () -> new GermanTranslator(new GermanGovWebDictionary()));
    }

    private Translator aTranslator(TranslatorType translatorType, Supplier<Translator> translator) {
        if (!translators.containsKey(translatorType)) {
            translators.put(translatorType, translator.get());
        }

        return translators.get(translatorType);
    }
}
