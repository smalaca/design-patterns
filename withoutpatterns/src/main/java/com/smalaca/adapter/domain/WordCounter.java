package com.smalaca.adapter.domain;

import com.smalaca.adapter.external.dictionary.german.GermanGovWebDictionary;
import com.smalaca.adapter.external.google.GoogleTranslator;

public class WordCounter {
    private static final String POLISH = "PL";
    private GoogleTranslator googleTranslator;
    private GermanGovWebDictionary germanGovWebDictionary;

    public WordCounter(GermanGovWebDictionary germanGovWebDictionary) {
        this.germanGovWebDictionary = germanGovWebDictionary;
    }

    public WordCounter(GoogleTranslator googleTranslator) {
        this.googleTranslator = googleTranslator;
    }

    public void add(String word) {

    }

    public int count(String word) {
        return 0;
    }

    private String translateToPolish(String word) {
        if (googleTranslator != null) {
            return googleTranslator.toPolish(word);
        }

        if (germanGovWebDictionary != null) {
            return germanGovWebDictionary.reversedTranslate(POLISH, word);
        }

        return null;
    }

    private String translateFromPolish(String word) {
        if (googleTranslator != null) {
            return googleTranslator.toEnglish(word);
        }

        if (germanGovWebDictionary != null) {
            return germanGovWebDictionary.translate(POLISH, word);
        }

        return null;
    }
}
