package com.smalaca.factorymethod.domain;

import com.smalaca.factorymethod.external.dictionary.german.GermanGovWebDictionary;

public class GermanWordCounterFactory implements WordCounterFactory {
    public WordCounter create() {
        GermanGovWebDictionary dictionary = new GermanGovWebDictionary();
        return new GermanWordCounter(dictionary);
    }
}
