package com.smalaca.simplefactory.wordcounter.english;

import com.smalaca.simplefactory.domain.WordCounter;
import com.smalaca.simplefactory.translator.google.GoogleTranslator;

public class EnglishWordCounterFactory {
    public WordCounter create() {
        GoogleTranslator translator = new GoogleTranslator();
        return new EnglishWordCounter(translator);
    }
}
