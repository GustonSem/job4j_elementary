package ru.job4j.array;

public class EndsWith {
    public static boolean endsWith(char[] word, char[] post) {
        boolean result = true;
        for (int t = 0; t < post.length; t++) {
            int postCurrentIndex = post.length - 1 - t;
            int wordCurrentIndex = word.length - 1 - t;
            if (word[wordCurrentIndex] != post[postCurrentIndex]) {
                result = false;
                break;
            }
        }
        return result;
    }
}
