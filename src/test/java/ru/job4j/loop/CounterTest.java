package ru.job4j.loop;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

class CounterTest {

    @Test
    void sum0and10Result55() {
        int result = Counter.sum(0, 10);
        int expected = 55;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void sum3and8Result33() {
        int result = Counter.sum(3, 8);
        int expected = 33;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void sum1and1Result1() {
        int result = Counter.sum(1, 1);
        int expected = 1;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void sum11and1Result0() {
        int result = Counter.sum(11, 1);
        int expected = 0;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void sumByEven0and10Result30() {
        int result = Counter.sumByEven(0, 10);
        int expected = 30;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void sumByEven3and8Result18() {
        int result = Counter.sumByEven(3, 8);
        int expected = 18;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void sumByEven1and1Result0() {
        int result = Counter.sumByEven(1, 1);
        int expected = 0;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void sumByEvenm11and1Result() {
        int result = Counter.sumByEven(-11, 1);
        int expected = -30;
        assertThat(result).isEqualTo(expected);
    }
}