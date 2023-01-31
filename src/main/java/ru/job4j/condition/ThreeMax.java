package ru.job4j.condition;

public class ThreeMax {
    public static int max(int first, int second, int third) {
        int result = second;
        if (first < second && first < third) {
            result = third;
        }
        if (second > first && second < third) {
            result = third;
        }
        return result;
    }

    public static void main(String[] args) {
ThreeMax.max(1, 5, 100);

    }
}
