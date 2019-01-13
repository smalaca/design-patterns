package com.smalaca.factorymethod.domain;

public interface WordCounter {
    void add(String word);

    int count(String word);
}
