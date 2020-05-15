package com.smalaca.simplefactory.web.wordcounter;

import com.smalaca.simplefactory.domain.WordCounter;
import com.smalaca.simplefactory.wordcounter.english.EnglishWordCounter;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class WordCounterControllerTest {

    @Test
    void shouldCreateWordCounter() {
        WordCounter wordCounter = new WordCounterController().aWordCounter();

        assertThat(wordCounter).isInstanceOf(EnglishWordCounter.class);
    }
}