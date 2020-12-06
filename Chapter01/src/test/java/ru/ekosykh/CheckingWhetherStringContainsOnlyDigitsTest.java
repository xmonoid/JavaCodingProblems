package ru.ekosykh;

import static org.junit.Assert.*;
import static ru.ekosykh.CheckingWhetherStringContainsOnlyDigits.check;

import org.junit.Test;

public class CheckingWhetherStringContainsOnlyDigitsTest {

    @Test
    public void testCheck() {
        assertTrue(check("1238546883"));
    }

    @Test
    public void testCheck1() {
        assertFalse(check("1238546a883"));
    }
}