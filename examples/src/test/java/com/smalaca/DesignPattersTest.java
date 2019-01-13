package com.smalaca;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

class DesignPattersTest {
    @Test
    void shouldBeFun() {
        DesignPatters designPatters = new DesignPatters();

        assertTrue(designPatters.areFun());
    }

    private class DesignPatters {
        boolean areFun() {
            return true;
        }
    }
}
