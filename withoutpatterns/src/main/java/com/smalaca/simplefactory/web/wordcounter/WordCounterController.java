package com.smalaca.simplefactory.web.wordcounter;

import com.smalaca.simplefactory.domain.WordCounter;
import com.smalaca.simplefactory.translator.google.GoogleTranslator;
import com.smalaca.simplefactory.wordcounter.english.EnglishWordCounter;
import com.smalaca.simplefactory.wordcounter.english.EnglishWordCounterFactory;

public class WordCounterController {
    private WordCounter wordCounter;

    public void add(String word) {
        aWordCounter().add(word);
    }

    public int count(String word) {
        return aWordCounter().count(word);
    }

    @Deprecated
    WordCounter aWordCounter() {
        if (wordCounter == null) {
            wordCounter = new EnglishWordCounterFactory().create();
        }

        return wordCounter;
    }
}
