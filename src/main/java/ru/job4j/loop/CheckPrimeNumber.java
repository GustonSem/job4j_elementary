package ru.job4j.loop;

public class CheckPrimeNumber {
    public static boolean check(int number) {
        boolean prime = number > 1;
        for (int p = 2; p < (number - 1); p++) {
            if (number % p == 0) {
                prime = false;
                break;
            }
        }
        return prime;
    }
}
