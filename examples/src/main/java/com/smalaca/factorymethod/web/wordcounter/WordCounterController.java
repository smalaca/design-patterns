package com.smalaca.factorymethod.web.wordcounter;

import com.smalaca.factorymethod.domain.WordCounter;
import com.smalaca.factorymethod.domain.WordCounterFactory;

public class WordCounterController {
    private WordCounterFactory wordCounterFactory;
    private WordCounter wordCounter;

    public WordCounterController(WordCounterFactory wordCounterFactory) {
        this.wordCounterFactory = wordCounterFactory;
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
