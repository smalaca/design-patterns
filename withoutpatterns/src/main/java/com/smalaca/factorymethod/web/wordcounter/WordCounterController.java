package com.smalaca.factorymethod.web.wordcounter;

import com.smalaca.factorymethod.domain.Language;
import com.smalaca.factorymethod.domain.WordCounter;
import com.smalaca.factorymethod.translator.dictionary.german.GermanGovWebDictionary;
import com.smalaca.factorymethod.translator.google.GoogleTranslator;
import com.smalaca.factorymethod.wordcounter.english.EnglishWordCounter;
import com.smalaca.factorymethod.wordcounter.german.GermanWordCounter;

public class WordCounterController {
    private Language language;
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
                case ENG:
                    GoogleTranslator translator = new GoogleTranslator();
                    wordCounter = new EnglishWordCounter(translator);

                case DEU:
                    GermanGovWebDictionary dictionary = new GermanGovWebDictionary();
                    wordCounter = new GermanWordCounter(dictionary);
            }
        }

        return wordCounter;
    }
}
