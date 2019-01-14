package com.smalaca.adapter.translator.german;

import com.smalaca.adapter.domain.Translator;
import com.smalaca.adapter.external.dictionary.german.GermanGovWebDictionary;

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
