package ru.job4j.condition;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

class RectangleTest {

    @Test
    void diagonalpr1() {
        double result = Rectangle.diagonalpr(5, 10);
        double expected = 11.18;
        assertThat(result).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void diagonalpr2() {
        double result = Rectangle.diagonalpr(10, 10);
        double expected = 14.14;
        assertThat(result).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void diagonalpr3() {
        double result = Rectangle.diagonalpr(123, 102);
        double expected = 159.79;
        assertThat(result).isEqualTo(expected, withPrecision(0.01));
    }
}