package ru.job4j.array;

public class InfinityLoop {
    public static void main(String[] args) {
        for (int index = 0; index < 10;) {
            System.out.println("infinity");
            index = index + 1;
        }
    }
}

/**
 * ¬ечный цикл уже был в коде, € предлагаю такой способ исправлени€.
 * ”далить строчку index и поставить + 1, либо удалить сумму и
 * поставить инкеремент.
 */