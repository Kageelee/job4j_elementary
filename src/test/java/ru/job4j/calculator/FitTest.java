package ru.job4j.calculator;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

class FitTest {

    @Test
    void man190then100() {
        short input = 190;
        double expected = 103.49;
        double output = Fit.manWeight(input);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void woman190then100() {
        short input = 190;
        double expected = 92.0;
        double output = Fit.womanWeight(input);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }
}