package ru.job4j.array;

public class EndsWith {
    public static boolean endsWith(char[] word, char[] post) {
        boolean result = true;
        int count = 0;
        for (int index = word.length - post.length; index < word.length; index++) {
            if (word[index] == post[count]) {
                count++;
            } else {
                result = false;
                break;
            }
        }
        return result;
    }
}
