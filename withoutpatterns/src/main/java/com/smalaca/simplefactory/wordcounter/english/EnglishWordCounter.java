package com.smalaca.simplefactory.wordcounter.english;

import com.smalaca.simplefactory.domain.WordCounter;
import com.smalaca.simplefactory.translator.google.GoogleTranslator;

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
