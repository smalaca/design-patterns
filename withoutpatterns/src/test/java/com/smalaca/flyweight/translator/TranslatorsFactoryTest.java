package com.smalaca.flyweight.translator;

import com.smalaca.flyweight.domain.Translator;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.StrictAssertions.assertThat;

class TranslatorsFactoryTest {
    private final TranslatorsFactory translatorsFactory = new TranslatorsFactory();

    @Test
    void shouldAlwaysReturnSameInstanceOfEnglishTranslator() {
        Translator expected = translatorsFactory.english();

        Translator actual = translatorsFactory.english();

        assertThat(expected).isSameAs(actual);
    }

    @Test
    void shouldAlwaysReturnSameInstanceOfGermanTranslator() {
        Translator expected = translatorsFactory.german();

        Translator actual = translatorsFactory.german();

        assertThat(expected).isSameAs(actual);
    }
}