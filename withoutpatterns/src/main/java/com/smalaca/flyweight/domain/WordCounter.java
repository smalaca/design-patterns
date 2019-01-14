package com.smalaca.flyweight.domain;

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
}
