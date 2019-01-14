package com.smalaca.flyweight.web.wordcounter;

import com.smalaca.flyweight.domain.Language;
import com.smalaca.flyweight.domain.Translator;
import com.smalaca.flyweight.domain.WordCounter;
import com.smalaca.flyweight.translator.TranslatorsFlyweight;

public class WordCounterController {
    private final TranslatorsFlyweight translatorsFlyweight;
    private Language language;
    private WordCounter wordCounter;

    public WordCounterController(TranslatorsFlyweight translatorsFlyweight, Language language) {
        this.translatorsFlyweight = translatorsFlyweight;
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
                return translatorsFlyweight.german();

            case ENG:
            default:
                return translatorsFlyweight.english();
        }
    }
}
