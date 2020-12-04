package ru.ekosykh;

/**
 * 003. Reverse letters and words.
 *
 * Write a program that reverses the letters of each word and a program that reverse the letters
 * of each word and the words themselves.
 */
public class ReverseLetterAndWords {

    public static String reverseLetters(String s) {
        char[] chars = s.toCharArray();

        for (int i = 0; i < chars.length; i++) {
            if (isLetter(chars[i])) {
                int j = i+1;
                while (j < chars.length && isLetter(chars[j])) {
                    j++;
                }
                reverseLettersInWord(chars, i, j-1);
                i = j;
            }
        }
        return new String(chars);
    }

    public static String reverseLettersAndWords(String s) {
        char[] chars = s.toCharArray();

        char[] letters = new char[chars.length];

        int lettersInTotal = 0;
        for (int i = 0; i < chars.length; i++) {
            if (isLetter(chars[i])) {
                letters[lettersInTotal++] = chars[i];
            }
        }

        for (int i = 0; i < chars.length; i++) {
            if (isLetter(chars[i])) {
                chars[i] = letters[--lettersInTotal];
            }
        }

        return new String(chars);
    }

    private static boolean isLetter(char c) {
        return c >= 'A' && c <= 'Z' || c >= 'a' && c <= 'z';
    }

    private static void reverseLettersInWord(char[] chars, int fromInc, int toInc) {
        for (int i = fromInc, j = toInc; i < j; i++, j--) {
            char t = chars[i];
            chars[i] = chars[j];
            chars[j] = t;
        }
    }
}
