package com.smalaca.simplefactory.web.wordcounter;

import com.smalaca.simplefactory.domain.WordCounter;
import com.smalaca.simplefactory.translator.google.GoogleTranslator;
import com.smalaca.simplefactory.wordcounter.english.EnglishWordCounter;

public class WordCounterController {
    private WordCounter wordCounter;

    public void add(String word) {
        aWordCounter().add(word);
    }

    public int count(String word) {
        return aWordCounter().count(word);
    }

    private WordCounter aWordCounter() {
        if (wordCounter == null) {
            GoogleTranslator translator = new GoogleTranslator();
            wordCounter = new EnglishWordCounter(translator);
        }

        return wordCounter;
    }
}
