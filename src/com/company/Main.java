package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        HomeWork1 homeWork1 = new HomeWork1();
        HomeWork2 homeWork2 = new HomeWork2();

        System.out.println(homeWork1.calculations(1, 2, 3, 4));
        System.out.println(homeWork1.comparison(1, 2));
        System.out.println(homeWork1.module(4));
        System.out.println(homeWork1.negativeNumber(-5));
        System.out.println(homeWork1.name("Ральф"));
        System.out.println(homeWork1.leapYear(2021));

        System.out.println("заменить 0 на 1: " + Arrays.toString(homeWork2.change()));
        System.out.println("умножить на 3: " + Arrays.toString(homeWork2.fullIn()));
        System.out.println("Если меньше 6, умножить на 2: " + Arrays.toString(homeWork2.multiplication()));
        homeWork2.fillInTheDiagonal();
        homeWork2.foundMaxMin();
        homeWork2.checkBalance();
    }
}

