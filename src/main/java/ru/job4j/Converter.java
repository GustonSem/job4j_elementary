package ru.job4j;

public class Converter {
    public static float rubleToEuro(float value) {
        float rsl = value / 70;
        return rsl;
    }

    public static float rubleToDollar(float value) {
        float rsl = value / 60;
        return rsl;
    }

    public static void main(String[] args) {
        float euro = Converter.rubleToEuro(140);
        float dollar = rubleToDollar(240);
        System.out.println("140 rubles are " + euro + " euro.");
        System.out.println("240 rubles are " + dollar + " dollar ");

        float in1 = 140;
        float in2 = 240;
        float expected2 = 4;
        float expected1 = 2;
        float out1 = Converter.rubleToEuro(in1);
        float out2 = Converter.rubleToDollar(in2);
        boolean passed1 = expected1 == out1;
        boolean passed2 = expected2 == out2;
        System.out.println("test result: " + passed1 + " and " + passed2);
    }
}
