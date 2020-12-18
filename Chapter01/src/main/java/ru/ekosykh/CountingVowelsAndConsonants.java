package ru.ekosykh;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * 005. Counting vowels and consonants.
 *
 * Write a program that counts the
 * number of vowels and consonants in a given string. Do this for the English
 * language, which has five vowels (a, e, i, o, and u).
 */
public class CountingVowelsAndConsonants {

    @ToString
    @EqualsAndHashCode
    @AllArgsConstructor
    @NoArgsConstructor
    public static class LettersPair {
        int vowels;
        int consonants;
    }

    public static LettersPair count(String s) {
        char[] chars = s.toUpperCase().toCharArray();
        LettersPair result = new LettersPair();

        for (char c: chars) {
            switch (c) {
                case 'A':
                case 'E':
                case 'I':
                case 'O':
                case 'U':
                    result.vowels++;
                    break;
                case 'B':
                case 'C':
                case 'D':
                case 'F':
                case 'G':
                case 'H':
                case 'J':
                case 'K':
                case 'L':
                case 'M':
                case 'N':
                case 'P':
                case 'Q':
                case 'R':
                case 'S':
                case 'T':
                case 'V':
                case 'W':
                case 'X':
                case 'Y':
                case 'Z':
                    result.consonants++;
                    break;
            }
        }

        return result;
    }
}
