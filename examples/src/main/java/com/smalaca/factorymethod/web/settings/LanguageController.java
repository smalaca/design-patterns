package com.smalaca.factorymethod.web.settings;

import com.smalaca.factorymethod.domain.Language;
import com.smalaca.factorymethod.domain.WordCounterFactory;
import com.smalaca.factorymethod.wordcounter.english.EnglishWordCounterFactory;
import com.smalaca.factorymethod.wordcounter.german.GermanWordCounterFactory;

public class LanguageController {
    private WordCounterFactory wordCounterFactory;

    public void choose(Language language) {
        switch (language) {
            case ENG:
                wordCounterFactory = new EnglishWordCounterFactory();
            case DEU:
                wordCounterFactory = new GermanWordCounterFactory();
        }
    }
}
