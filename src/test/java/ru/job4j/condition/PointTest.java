package ru.job4j.condition;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

class PointTest {

    @Test
    void distance0120() {
        double result = Point.distance(0, 1, 2, 0);
        double expected = 2.82;
        assertThat(result).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void distance517m3() {
        double result = Point.distance(5, 1, 7, -3);
        double expected = 2.82;
        assertThat(result).isEqualTo(expected, withPrecision(0.01));
    }
}