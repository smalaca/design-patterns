package com.smalaca.factorymethod.wordcounter.english;

import com.smalaca.factorymethod.domain.WordCounter;
import com.smalaca.factorymethod.translator.google.GoogleTranslator;

public class EnglishWordCounter implements WordCounter {
    private final GoogleTranslator translator;

    public EnglishWordCounter(GoogleTranslator translator) {
        this.translator = translator;
    }

    public void add(String word) {

    }

    public int count(String word) {
        return 0;
    }
}
