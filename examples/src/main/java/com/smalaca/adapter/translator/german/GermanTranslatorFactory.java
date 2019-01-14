package com.smalaca.adapter.translator.german;

import com.smalaca.adapter.domain.Translator;
import com.smalaca.adapter.domain.TranslatorFactory;
import com.smalaca.adapter.external.dictionary.german.GermanGovWebDictionary;

public class GermanTranslatorFactory implements TranslatorFactory {
    @Override
    public Translator create() {
        return new GermanTranslator(new GermanGovWebDictionary());
    }
}
