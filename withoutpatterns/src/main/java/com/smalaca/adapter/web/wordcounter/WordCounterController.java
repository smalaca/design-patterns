package com.smalaca.adapter.web.wordcounter;

import com.smalaca.adapter.domain.Language;
import com.smalaca.adapter.domain.WordCounter;
import com.smalaca.adapter.external.dictionary.german.GermanGovWebDictionary;
import com.smalaca.adapter.external.dictionary.german.GermanTranslator;
import com.smalaca.adapter.external.google.EnglishTranslator;
import com.smalaca.adapter.external.google.GoogleTranslator;

public class WordCounterController {
    private final Language language;

    private WordCounter wordCounter;

    public WordCounterController(Language language) {
        this.language = language;
    }

    public void add(String word) {
        aWordCounter().add(word);
    }

    public int count(String word) {
        return aWordCounter().count(word);
    }

    private WordCounter aWordCounter() {
        if (wordCounter == null) {
            switch (language) {
                case DEU:
                    wordCounter = new WordCounter(new GermanTranslator(new GermanGovWebDictionary()));
                    break;

                case ENG:
                default:
                    wordCounter = new WordCounter(new EnglishTranslator(new GoogleTranslator()));
                    break;
            }
        }

        return wordCounter;
    }
}
