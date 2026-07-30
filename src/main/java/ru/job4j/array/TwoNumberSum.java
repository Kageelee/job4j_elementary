package ru.job4j.array;

public class TwoNumberSum {
    public static int[] getIndexes(int[] array, int target) {
        int i = 0;
        int j = array.length - 1;

        while (i < j) {
            int sum = array[i] + array[j];

            if (sum == target) {
                return new int[] {i, j};
            } else if (sum < target) {
                i++;
            } else {
                j--;
            }
        }
        return new int[0];
    }

    public static int[] getIndexes2(int[] array, int target) {
        int i = 0;
        int j = 1;
        while (j < array.length) {
            if (array[i] + array[j] == target && i != j) {
                return new int[] {i, j};
            }
            if (j == array.length - 1) {
                i++;
                j = i;
            }
            j++;
        }
        return new int[0];
    }
}
