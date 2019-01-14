package com.smalaca.adapter.translator.english;

import com.smalaca.adapter.domain.Translator;
import com.smalaca.adapter.domain.TranslatorFactory;
import com.smalaca.adapter.external.google.GoogleTranslator;

public class EnglishTranslatorFactory implements TranslatorFactory {
    @Override
    public Translator create() {
        return new EnglishTranslator(new GoogleTranslator());
    }
}
