package com.smalaca.adapter.domain;

import com.smalaca.adapter.external.dictionary.german.GermanGovWebDictionary;
import com.smalaca.adapter.external.dictionary.german.GermanTranslator;
import com.smalaca.adapter.external.google.EnglishTranslator;
import com.smalaca.adapter.external.google.GoogleTranslator;

public class WordCounter {
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

    @Deprecated
    String translateToPolish(String word) {
        if (googleTranslator != null) {
            return new EnglishTranslator(googleTranslator).translateToPolish(word);
        }

        if (germanGovWebDictionary != null) {
            return new GermanTranslator(germanGovWebDictionary).translateToPolish(word);
        }

        return null;
    }

    @Deprecated
    String translateFromPolish(String word) {
        if (googleTranslator != null) {
            return new EnglishTranslator(googleTranslator).translateFromPolish(word);
        }

        if (germanGovWebDictionary != null) {
            return new GermanTranslator(germanGovWebDictionary).translateFromPolish(word);
        }

        return null;
    }
}
