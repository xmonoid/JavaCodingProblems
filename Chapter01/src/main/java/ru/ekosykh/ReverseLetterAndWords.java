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
        char[] result = new char[chars.length];

        int i_result = 0;
        int j_back = chars.length - 1;
        for (int i = 0; i < chars.length; i++) {
            if (!isLetter(chars[i])) {
                result[i_result++] = chars[i];
            } else {
                while (j_back >= 0 && !isLetter(chars[j_back])) {
                    j_back--;
                }
                while (j_back >= 0 && isLetter(chars[j_back])) {
                    result[i_result++] = chars[j_back--];
                }
                while (i < chars.length && isLetter(chars[i])) {
                    i++;
                }
                i--;
            }
        }

        return new String(result);
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
