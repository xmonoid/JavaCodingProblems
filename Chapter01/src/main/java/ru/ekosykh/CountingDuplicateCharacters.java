package ru.ekosykh;

import java.util.Arrays;

/**
 * 001. Counting duplicate characters.
 *
 * Write a program that counts duplicate characters from a given string.
 */
public class CountingDuplicateCharacters {

    public static int count(String s) {
        char[] chars = s.toUpperCase().toCharArray();
        Arrays.sort(chars);

        int result = 0;
        for (int i = 0; i < chars.length - 1;) {
            if (chars[i] == chars[i+1]) {
                result++;
                do {
                    i++;
                } while (i < chars.length && chars[i]==chars[i-1]);
            } else {
                i++;
            }
        }

        return result;
    }
}
