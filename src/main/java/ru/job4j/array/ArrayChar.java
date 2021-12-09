package ru.job4j.array;

public class ArrayChar {
    public static boolean startsWith(char[] word, char[] pref) {
        boolean result = true;
        if (word[0] == pref[0] && word[1] == pref[1]) {
            result = true;
        } else {
            result = false;
        }
        return result;
    }
}
