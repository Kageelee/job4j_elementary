package ru.job4j.loop;

public class Savings {
    public static int years(double goal, double annualDeposit, double percent) {
        int years = 0;
        double money = 0;
        do {
            money = money * (percent / 100 + 1);
            money += annualDeposit;
            years++;
        } while (goal > money);

        return years;
    }
}
