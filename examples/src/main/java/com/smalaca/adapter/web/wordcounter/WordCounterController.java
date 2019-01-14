package com.smalaca.adapter.web.wordcounter;

import com.smalaca.adapter.domain.TranslatorFactory;
import com.smalaca.adapter.domain.WordCounter;

public class WordCounterController {
    private TranslatorFactory translatorFactory;
    private WordCounter wordCounter;

    public WordCounterController(TranslatorFactory translatorFactory) {
        this.translatorFactory = translatorFactory;
    }

    public void add(String word) {
        aWordCounter().add(word);
    }

    public int count(String word) {
        return aWordCounter().count(word);
    }

    private WordCounter aWordCounter() {
        if (wordCounter == null) {
            wordCounter = new WordCounter(translatorFactory.create());
        }

        return wordCounter;
    }
}
