package ru.job4j.loop;

public class NumberPyramid {
    public static void draw(int n) {
        for (int i = 1; i <= n; i++) {
            int j = 0;
            // Печатаем пробелы
            for (int q = 0; q < n - i; q++) {
                System.out.print(" ");
            }
            // Печатаем числа в прямом порядке
            for (int w = 0; w < i; w++) {
                j++;
                System.out.print(j);
            }
            // Печатаем числа в обратном порядке
            for (int e = 0; e < i - 1; e++) {
                j--;
                System.out.print(j);
            }
            // Переход на новую строку
            System.out.println();
        }
    }

    public static void main(String[] args) {
        System.out.println("Number pyramid of height 3: ");
        draw(4);
        System.out.println("Number pyramid of height 5: ");
        draw(5);
    }
}
