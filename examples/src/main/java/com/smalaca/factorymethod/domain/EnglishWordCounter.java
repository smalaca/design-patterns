package com.smalaca.factorymethod.domain;

import com.smalaca.factorymethod.external.google.GoogleTranslator;

class EnglishWordCounter implements WordCounter {
    private final GoogleTranslator translator;

    EnglishWordCounter(GoogleTranslator translator) {
        this.translator = translator;
    }

    public void add(String word) {

    }

    public int count(String word) {
        return 0;
    }
}
