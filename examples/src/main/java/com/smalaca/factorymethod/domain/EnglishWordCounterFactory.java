package com.smalaca.factorymethod.domain;

import com.smalaca.factorymethod.external.google.GoogleTranslator;

public class EnglishWordCounterFactory implements WordCounterFactory {
    public WordCounter create() {
        GoogleTranslator translator = new GoogleTranslator();
        return new EnglishWordCounter(translator);
    }
}
