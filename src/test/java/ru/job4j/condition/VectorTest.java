package ru.job4j.condition;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

class VectorTest {

    @Test
    void vectors4321() {
        int x1 = 4, y1 = 3, x2 = 2, y2 = 1;
        String expected = "(6, 4)";
        String output = Vector.addVectors(x1, y1, x2, y2);
        assertThat(output).isEqualTo(expected);
    }

    @Test
    void vectorsm43m2m1() {
        int x1 = -4, y1 = 3, x2 = -2, y2 = -1;
        String expected = "(-6, 2)";
        String output = Vector.addVectors(x1, y1, x2, y2);
        assertThat(output).isEqualTo(expected);
    }
}