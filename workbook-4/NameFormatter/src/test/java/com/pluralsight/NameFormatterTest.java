package com.pluralsight;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NameFormatterTest {

    @Test
    void format_shouldOutput() {
        //a
        String name = "Mel B Johnson, PhD";
        String expectedName = "Mel B Johnson, PhD";

        //a
        NameFormatter.format(name);

        //a
        assertEquals(name, expectedName);
    }

    @Test
    void testFormat() {
    }

    @Test
    void testFormat1() {
    }
}