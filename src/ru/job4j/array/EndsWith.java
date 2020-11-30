package ru.job4j.array;

public class EndsWith {
    public static boolean endsWith(char[] word, char[] post) {
        boolean result = true;
        int minus = 0;
        for (int index = post.length - 1; index >= 0; index--) {
            if (post[index] == word[word.length - 1 - minus]) {
                minus++;
            } else {
                result = false;
                break;
            }
        }
        return result;
    }
}
