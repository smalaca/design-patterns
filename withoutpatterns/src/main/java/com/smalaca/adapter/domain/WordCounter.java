package com.smalaca.adapter.domain;

import com.smalaca.adapter.external.dictionary.german.GermanGovWebDictionary;
import com.smalaca.adapter.external.dictionary.german.GermanTranslator;
import com.smalaca.adapter.external.google.EnglishTranslator;
import com.smalaca.adapter.external.google.GoogleTranslator;

public class WordCounter {
    private final Translator translator;

    public WordCounter(Translator translator) {
        this.translator = translator;
    }

    public void add(String word) {

    }

    public int count(String word) {
        return 0;
    }

    @Deprecated
    String translateToPolish(String word) {
        return translator.translateToPolish(word);
    }

    @Deprecated
    String translateFromPolish(String word) {
        return translator.translateFromPolish(word);
    }
}
