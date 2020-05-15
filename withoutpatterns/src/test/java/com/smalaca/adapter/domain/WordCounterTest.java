package com.smalaca.adapter.domain;

import com.smalaca.adapter.external.dictionary.german.GermanGovWebDictionary;
import com.smalaca.adapter.external.dictionary.german.GermanTranslator;
import com.smalaca.adapter.external.google.EnglishTranslator;
import com.smalaca.adapter.external.google.GoogleTranslator;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.UUID;

import static org.mockito.BDDMockito.given;
import static org.mockito.Mockito.mock;

class WordCounterTest {
    private static final String WORD = UUID.randomUUID().toString();
    private static final String TRANSLATE_WORD = UUID.randomUUID().toString();

    @Test
    void shouldTranslateFromGermanToPolish() {
        GermanGovWebDictionary germanGovWebDictionary = mock(GermanGovWebDictionary.class);
        given(germanGovWebDictionary.reversedTranslate("PL", WORD)).willReturn(TRANSLATE_WORD);
        WordCounter wordCounter = new WordCounter(new GermanTranslator(germanGovWebDictionary));

        String actual = wordCounter.translateToPolish(WORD);

        Assertions.assertThat(actual).isEqualTo(TRANSLATE_WORD);
    }

    @Test
    void shouldTranslateFromPolishToGerman() {
        GermanGovWebDictionary germanGovWebDictionary = mock(GermanGovWebDictionary.class);
        given(germanGovWebDictionary.translate("PL", WORD)).willReturn(TRANSLATE_WORD);
        WordCounter wordCounter = new WordCounter(new GermanTranslator(germanGovWebDictionary));

        String actual = wordCounter.translateFromPolish(WORD);

        Assertions.assertThat(actual).isEqualTo(TRANSLATE_WORD);
    }

    @Test
    void shouldTranslateFromPolishToEnglish() {
        GoogleTranslator googleTranslator = mock(GoogleTranslator.class);
        given(googleTranslator.toEnglish(WORD)).willReturn(TRANSLATE_WORD);
        WordCounter wordCounter = new WordCounter(new EnglishTranslator(googleTranslator));

        String actual = wordCounter.translateFromPolish(WORD);

        Assertions.assertThat(actual).isEqualTo(TRANSLATE_WORD);
    }

    @Test
    void shouldTranslateFromEnglishToPolish() {
        GoogleTranslator googleTranslator = mock(GoogleTranslator.class);
        given(googleTranslator.toPolish(WORD)).willReturn(TRANSLATE_WORD);
        WordCounter wordCounter = new WordCounter(new EnglishTranslator(googleTranslator));

        String actual = wordCounter.translateToPolish(WORD);

        Assertions.assertThat(actual).isEqualTo(TRANSLATE_WORD);
    }
}