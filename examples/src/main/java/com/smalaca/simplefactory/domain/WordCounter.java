package com.smalaca.simplefactory.domain;

public interface WordCounter {
    void add(String word);

    int count(String word);
}
