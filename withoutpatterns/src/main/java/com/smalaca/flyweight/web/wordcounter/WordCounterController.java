package com.smalaca.flyweight.web.wordcounter;

import com.smalaca.flyweight.domain.Language;
import com.smalaca.flyweight.domain.Translator;
import com.smalaca.flyweight.domain.WordCounter;
import com.smalaca.flyweight.translator.TranslatorsFactory;

public class WordCounterController {
    private final TranslatorsFactory translatorsFactory;
    private Language language;
    private WordCounter wordCounter;

    public WordCounterController(TranslatorsFactory translatorsFactory, Language language) {
        this.translatorsFactory = translatorsFactory;
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
            wordCounter = new WordCounter(aTranslator());
        }

        return wordCounter;
    }

    private Translator aTranslator() {
        switch (language) {
            case DEU:
                return translatorsFactory.german();

            case ENG:
            default:
                return translatorsFactory.english();
        }
    }
}
