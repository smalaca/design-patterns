package com.smalaca.factorymethod.domain;

import com.smalaca.factorymethod.external.dictionary.german.GermanGovWebDictionary;

class GermanWordCounter implements WordCounter {
    private final GermanGovWebDictionary dictionary;

    GermanWordCounter(GermanGovWebDictionary dictionary) {
        this.dictionary = dictionary;
    }

    public void add(String word) {

    }

    public int count(String word) {
        return 0;
    }
}
