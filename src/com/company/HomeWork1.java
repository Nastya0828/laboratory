package com.company;

public class HomeWork1 {
    boolean isHero = false;
    byte a = 3;
    short b = 2;
    int c = 4;
    long d = 5;
    double e = 8.5;
    float f = 8.5F;
    char g = 'F';

    public static double calculations(float a, float b, float c, float d) {
        return a * (b + (c / d));
    }

    public static boolean comparison(int a, int b) {
        if ((a + b) >= 10 & (a + b) <= 20)
            return true;
        else
            return false;
    }

    public static String module(int a) {
        if (a >= 0)
            return "Положительное число";
        else
            return "Отрицательное число";
    }

    public static boolean negativeNumber(int a) {
        if (a <= 0)
            return true;
        else return false;
    }

    public static String name(String a) {
        return "Привет, " + a + "!";
    }

    public static String leapYear(int y) {
        if (y % 4 != 0)
            return "Год невисокосный";
        if (y % 100 == 0 & y % 400 != 0)
            return "Год невисокосный";
        if (y % 100 == 0 & y % 400 == 0)
            return "Год високосный";
        else
            return "Год невисокосный";
    }
}
