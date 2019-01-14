package com.smalaca.adapter.web.settings;

import com.smalaca.adapter.domain.Language;
import com.smalaca.adapter.domain.TranslatorFactory;
import com.smalaca.adapter.translator.english.EnglishTranslatorFactory;
import com.smalaca.adapter.translator.german.GermanTranslatorFactory;

public class LanguageController {
    private TranslatorFactory translatorFactory;

    public void choose(Language language) {
        switch (language) {
            case ENG:
                translatorFactory = new EnglishTranslatorFactory();
            case DEU:
                translatorFactory = new GermanTranslatorFactory();
        }
    }
}
