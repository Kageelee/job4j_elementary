package ru.job4j.calculator;

import static ru.job4j.math.MathFunction.*;

public class MathCalculator {

    public static double sumandmulty(double first, double second) {
        return sum(first, second) + multiply(first, second);
    }

    public static double div_sub(double first, double second) {
        return div(first, second) + sub(first, second);
    }

    public static double sum_div(double first, double second) {
        return sum(first, second) + div(first, second);
    }


    public static void main (String[] args) {
        System.out.println("Расчёт методом 1 = " + sumandmulty(10, 80));
        System.out.println("Расчёт методом 2 = " + div_sub(10, 80));
        System.out.println("Расчёт методом 3 = " + sum_div(10, 80));
    }

}
