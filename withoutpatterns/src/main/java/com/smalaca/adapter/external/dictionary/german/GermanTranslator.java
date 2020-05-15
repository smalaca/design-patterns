package com.smalaca.adapter.external.dictionary.german;

import com.smalaca.adapter.domain.Translator;

public class GermanTranslator implements Translator {
    private static final String POLISH = "PL";

    private final GermanGovWebDictionary germanGovWebDictionary;

    public GermanTranslator(GermanGovWebDictionary germanGovWebDictionary) {
        this.germanGovWebDictionary = germanGovWebDictionary;
    }

    @Override
    public String translateToPolish(String word) {
        return germanGovWebDictionary.reversedTranslate(POLISH, word);
    }

    @Override
    public String translateFromPolish(String word) {
        return germanGovWebDictionary.translate(POLISH, word);
    }
}
