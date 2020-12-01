package ru.ekosykh;

/**
 * 002. Finding the first non-repeated character.
 *
 * Write a program that returns the first non-repeated character from a given string.
 */
public class FindingTheFirstNonRepeatedCharacter {

    public static char get(String s) {
        char[] chars = s.toUpperCase().toCharArray();
        boolean[] haveThaSame = new boolean[chars.length];

        for (int i = 0; i < chars.length - 1; i++) {
            if (haveThaSame[i]) {
                continue;
            }
            for (int j = i + 1; j < chars.length; j++) {
                if (haveThaSame[j]) {
                    continue;
                }
                if (chars[i] == chars[j]) {
                    haveThaSame[i] = haveThaSame[j] = true;
                }
            }
        }
        for (int i = 0; i < haveThaSame.length; i++) {
            if (!haveThaSame[i]) {
                return s.charAt(i);
            }
        }

        return '\000';
    }
}
