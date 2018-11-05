package com.smalaca.factorymethod;

import com.smalaca.factorymethod.domain.GermanWordCounterFactory;
import com.smalaca.factorymethod.domain.EnglishWordCounterFactory;
import com.smalaca.factorymethod.domain.Language;
import com.smalaca.factorymethod.domain.WordCounter;
import com.smalaca.factorymethod.domain.WordCounterFactory;

public class WordCounterController {
    private WordCounterFactory wordCounterFactory;
    private WordCounter wordCounter;

    public void chooseLanguage(Language language) {
        switch (language) {
            case ENG:
                wordCounterFactory = new EnglishWordCounterFactory();
            case DEU:
                wordCounterFactory = new GermanWordCounterFactory();
        }
    }

    public void add(String word) {
        aWordCounter().add(word);
    }

    public int count(String word) {
        return aWordCounter().count(word);
    }

    private WordCounter aWordCounter() {
        if (wordCounter == null) {
            wordCounter = wordCounterFactory.create();
        }

        return wordCounter;
    }
}
