package ru.job4j;

public class Point {
    public static double distance(int x1, int y1, int x2, int y2) {
        double rsl1 = x2 - x1;
        double rsl2 = y2 - y1;

        double first = Math.pow(rsl1, 2);
        double second = Math.pow(rsl2, 2);
        double total = first + second;
        double rsl = Math.sqrt(total);
        return rsl;
    }

    public static void main(String[] args) {
        double result = Point.distance(1, 5, 7, 7);
        System.out.println("result (1, 5) to (7, 7) " + result);
    }
}
