package com.smalaca;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class DesignPatternsTest {
    @Test
    void shouldSayHello() {
        DesignPatterns designPatterns = new DesignPatterns();

        assertEquals("Design Patterns are awesome!", designPatterns.describe());
    }
}
