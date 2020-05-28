package smalaca;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

class DesignPatternsTest {
    @Test
    void shouldBeFun() {
        DesignPatterns designPatterns = new DesignPatterns();

        assertTrue(designPatterns.areFun());
    }

    private static class DesignPatterns {
        boolean areFun() {
            return true;
        }
    }
}
