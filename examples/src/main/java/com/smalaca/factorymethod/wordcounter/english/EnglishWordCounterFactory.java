package com.smalaca.factorymethod.wordcounter.english;

import com.smalaca.factorymethod.domain.WordCounter;
import com.smalaca.factorymethod.domain.WordCounterFactory;
import com.smalaca.factorymethod.translator.google.GoogleTranslator;

public class EnglishWordCounterFactory implements WordCounterFactory {
    public WordCounter create() {
        GoogleTranslator translator = new GoogleTranslator();
        return new EnglishWordCounter(translator);
    }
}
