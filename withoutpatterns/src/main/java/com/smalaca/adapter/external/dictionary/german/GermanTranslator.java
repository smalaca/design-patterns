package com.smalaca.adapter.external.dictionary.german;

public class GermanTranslator {
    private static final String POLISH = "PL";

    private final GermanGovWebDictionary germanGovWebDictionary;

    public GermanTranslator(GermanGovWebDictionary germanGovWebDictionary) {
        this.germanGovWebDictionary = germanGovWebDictionary;
    }

    public String translateToPolish(String word) {
        return germanGovWebDictionary.reversedTranslate(POLISH, word);
    }

    public String translateFromPolish(String word) {
        return germanGovWebDictionary.translate(POLISH, word);
    }
}
