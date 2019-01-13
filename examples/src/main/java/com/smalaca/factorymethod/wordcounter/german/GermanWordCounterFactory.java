package com.smalaca.factorymethod.wordcounter.german;

import com.smalaca.factorymethod.domain.WordCounter;
import com.smalaca.factorymethod.domain.WordCounterFactory;
import com.smalaca.factorymethod.translator.dictionary.german.GermanGovWebDictionary;

public class GermanWordCounterFactory implements WordCounterFactory {
    public WordCounter create() {
        GermanGovWebDictionary dictionary = new GermanGovWebDictionary();
        return new GermanWordCounter(dictionary);
    }
}
