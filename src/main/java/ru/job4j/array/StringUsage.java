package ru.job4j.array;

public class StringUsage {
    public static String encode(String input) {
        String result = "";
        int counter = 1;
        char symbol = input.charAt(0);
        for (int fori = 1; fori < input.length(); fori++) {
            if (symbol == input.charAt(fori)) {
                counter += 1;
            } else if (symbol != input.charAt(fori) && counter >= 2) {
                result += symbol + "" + counter;
                symbol = input.charAt(fori);
                counter = 1;
            } else if (symbol != input.charAt(fori) && counter == 1) {
                result += "" + symbol;
                symbol = input.charAt(fori);
            }
        }
        if (counter > 1) {
            result += symbol + "" + counter;
        } else {
            result += "" + symbol;
        }
        return result;
    }
}