package ru.job4j.math;

import static ru.job4j.math.MathFunction.*;
public class MathCalculator {
    public static double sumAndMultiply(double first, double second) {
        return sum(first, second)
                + multiply(first, second);
    }

    public static double differenceAndDivision(double first, double second) {
        return difference(first, second)
                + division(first, second);
    }

    public static double sumTotalMath(double sum, double multiply, double difference, double division) {
        return sumTotal(sum, multiply, difference, division);
    }

    public static void main(String[] args) {
        System.out.println("Результат расчета равен: " + sumAndMultiply(10, 20) + differenceAndDivision(20, 15));

    }
}