package ru.ekosykh;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static ru.ekosykh.CountingDuplicateCharacters.count;

public class CountingDuplicateCharactersTest {

    @Test
    public void testCount() {
        assertEquals(0, count("abCde"));
    }

    @Test
    public void testCount1() {
        assertEquals(1, count("aAaaAa"));
    }

    @Test
    public void testCount5() {
        assertEquals(5, count("abcdeABCDE"));
    }

    @Test
    public void testCount3() {
        assertEquals(3, count("abcdeAfghijklmnOopqrstZuvwxyz"));
    }
}