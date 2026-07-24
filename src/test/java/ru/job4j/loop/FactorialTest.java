package ru.job4j.loop;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

class FactorialTest {

    @Test
    void calculateFactorial5() {
        int number = 5;
        int output = Factorial.calculate(number);
        int expected = 120;
        assertThat(output).isEqualTo(expected);
    }

    @Test
    void calculateFactorial6() {
        int number = 6;
        int output = Factorial.calculate(number);
        int expected = 720;
        assertThat(output).isEqualTo(expected);
    }

}