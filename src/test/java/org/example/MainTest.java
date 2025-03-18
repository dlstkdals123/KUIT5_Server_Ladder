package org.example;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {
    @ParameterizedTest
    @CsvSource(value = {"1,2,2", "3,5,15", "2,4,8"})
    void multiplyTest(int number1, int number2, int expected) {
        Assertions.assertThat(Main.multiply(number1, number2)).isEqualTo(expected);
    }
}