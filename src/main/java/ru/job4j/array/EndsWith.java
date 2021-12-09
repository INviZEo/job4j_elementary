package ru.job4j.array;

public class EndsWith {
    public static boolean endsWith(char[] word, char[] post) {
        boolean result = true;
        if (word[3] == post[0] && word[4] == post[1]) {
            result = true;
    } else {
            result = false;
        }
        return result;
    }
}

