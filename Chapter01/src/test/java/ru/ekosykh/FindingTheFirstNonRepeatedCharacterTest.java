package ru.ekosykh;

import org.junit.Test;

import static org.junit.Assert.*;
import static ru.ekosykh.FindingTheFirstNonRepeatedCharacter.get;

public class FindingTheFirstNonRepeatedCharacterTest {

    @Test
    public void testGet0A() {
        assertEquals('\000', get("aaAaa"));
    }

    @Test
    public void testGet0AZ() {
        assertEquals('\000', get("AbCdEfGhIjKlMnOpQrStUvWxYzaBcDeFgHiJkLmNoPqRsTuVwXyZ"));
    }

    @Test
    public void testGetB() {
        assertEquals('b', get("aaAba"));
    }

    @Test
    public void testGetC() {
        assertEquals('c', get("acdADba"));
    }
}