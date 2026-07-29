package ru.job4j.array;

import java.util.Arrays;

public class ArrayDefinition {
    public static void main(String[] args) {
        short[] ages = new short[10];
        String[] surnames = new String[100500];
        float[] prices = new float[40];
        System.out.println(Arrays.toString(ages));
        System.out.println(Arrays.toString(surnames));
        System.out.println(Arrays.toString(prices));
    }
}
