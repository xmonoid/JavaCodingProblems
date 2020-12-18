package ru.ekosykh;

import static org.junit.Assert.*;
import static ru.ekosykh.CountingVowelsAndConsonants.count;

import org.junit.Test;

public class CountingVowelsAndConsonantsTest {

    @Test
    public void testCount() {
        final var s = "This is a string";
        final var pair =
                new CountingVowelsAndConsonants.LettersPair(4, 9);
        assertEquals(pair, count(s));
    }

    @Test
    public void testCountOnlyVowels() {
        final var s = "Ths s , strng 123";
        final var pair =
                new CountingVowelsAndConsonants.LettersPair(0, 9);
        assertEquals(pair, count(s));
    }

    @Test
    public void testCountOnlyConsonants() {
        final var s = "i I1 A,: a";
        final var pair =
                new CountingVowelsAndConsonants.LettersPair(4, 0);
        assertEquals(pair, count(s));
    }
}