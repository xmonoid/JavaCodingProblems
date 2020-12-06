package ru.ekosykh;

/**
 * 004. Checking whether a string contains only digits.
 *
 * Write a program that checks whether the given string contains only digits.
 */
public class CheckingWhetherStringContainsOnlyDigits {

    public static boolean check(String s) {
        char[] chars = s.toCharArray();
        for (char c: chars) {
            if (c < '0' || c > '9') {
                return false;
            }
        }
        return true;
    }
}
