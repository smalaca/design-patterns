package com.smalaca.factorymethod.web.wordcounter;

import com.smalaca.factorymethod.domain.WordCounter;
import com.smalaca.factorymethod.translator.dictionary.german.GermanGovWebDictionary;
import com.smalaca.factorymethod.translator.google.GoogleTranslator;
import com.smalaca.factorymethod.web.LanguageChoice;
import com.smalaca.factorymethod.wordcounter.english.EnglishWordCounter;
import com.smalaca.factorymethod.wordcounter.german.GermanWordCounter;

public class WordCounterController {
    private final LanguageChoice languageChoice;
    private WordCounter wordCounter;

    public WordCounterController(LanguageChoice languageChoice) {
        this.languageChoice = languageChoice;
    }

    public void add(String word) {
        aWordCounter().add(word);
    }

    public int count(String word) {
        return aWordCounter().count(word);
    }

    private WordCounter aWordCounter() {
        if (wordCounter == null) {
            switch (languageChoice.get()) {
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
