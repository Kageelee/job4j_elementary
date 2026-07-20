package ru.job4j.converter;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

class ConverterTest {

    @Test
    void whenConvertRblThenEuro() {
        double input = 180;
        double expected = 2;
        double output = Converter.rubleToEuro(input);
        double value = 0.0001;
        assertThat(output).isEqualTo(expected, withPrecision(value));
    }

    @Test
    void whenConvertRblThenDollar() {
        double input = 225;
        double expected = 2.8125;
        double output = Converter.rubleToDollar(input);
        double value = 0.0001;
        assertThat(output).isEqualTo(expected, withPrecision(value));
    }

    @Test
    void whenConvertRblThenUan() {
        double input = 11.5;
        double expected = 1;
        double output = Converter.uan(input);
        double value = 0.0001;
        assertThat(output).isEqualTo(expected, withPrecision(value));
    }
}