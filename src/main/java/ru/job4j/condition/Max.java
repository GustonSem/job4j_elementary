package ru.job4j.condition;

public class Max {
    public static int max(int left, int right) {
        int result = left > right ? left : right;
        return result;
    }

    public static void main(String[] args) {
        int result = Max.max(40, 60);
        System.out.println(result);

        int result2 = Max.max(33, 17);
        System.out.println(result2);

        int result3 = Max.max(7, 7);
        System.out.println(result3);
    }
}