package com.smalaca.flyweight.translator;

import com.smalaca.flyweight.domain.Translator;
import com.smalaca.flyweight.external.dictionary.german.GermanGovWebDictionary;

class GermanTranslator implements Translator {
    private static final String POLISH = "PL";

    private final GermanGovWebDictionary germanGovWebDictionary;

    GermanTranslator(GermanGovWebDictionary germanGovWebDictionary) {
        this.germanGovWebDictionary = germanGovWebDictionary;
    }

    @Override
    public String fromPolish(String word) {
        return germanGovWebDictionary.reversedTranslate(POLISH, word);
    }

    @Override
    public String toPolish(String word) {
        return germanGovWebDictionary.translate(POLISH, word);
    }
}
