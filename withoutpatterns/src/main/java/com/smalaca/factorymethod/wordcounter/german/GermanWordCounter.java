package com.smalaca.factorymethod.wordcounter.german;

import com.smalaca.factorymethod.domain.WordCounter;
import com.smalaca.factorymethod.translator.dictionary.german.GermanGovWebDictionary;

public class GermanWordCounter implements WordCounter {
    private final GermanGovWebDictionary dictionary;

    public GermanWordCounter(GermanGovWebDictionary dictionary) {
        this.dictionary = dictionary;
    }

    public void add(String word) {

    }

    public int count(String word) {
        return 0;
    }
}
