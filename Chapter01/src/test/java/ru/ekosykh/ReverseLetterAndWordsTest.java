package ru.ekosykh;

import org.junit.Test;

import static org.junit.Assert.*;
import static ru.ekosykh.ReverseLetterAndWords.reverseLetters;
import static ru.ekosykh.ReverseLetterAndWords.reverseLettersAndWords;

public class ReverseLetterAndWordsTest {

    @Test
    public void testReverseLetters() {
        assertEquals("This,, ''is' a string", reverseLetters("sihT,, ''si' a gnirts"));
    }

    @Test
    public void testReverseLetters1() {
        assertEquals("AbCdEfGh", reverseLetters("hGfEdCbA"));
    }

    @Test
    public void testReverseLettersAndWords() {
        assertEquals("This,, ''is' a string", reverseLettersAndWords("gnirts,, ''a' si sihT"));
    }
}