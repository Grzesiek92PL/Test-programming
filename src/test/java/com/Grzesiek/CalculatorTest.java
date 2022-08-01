package com.Grzesiek;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.assertj.core.api.Assertions.assertThat;

class CalculatorTest {

    private double actual;

    @Test  // adnotacja ( musi być za każdym razem żeby przetestować klasę )
    @DisplayName("Adding two numbers")
    void plus() {
        // given
        double firstNumber = 10;
        double secondNUmber = 20;
        // when
        double actual = Calculator.plus(firstNumber, secondNUmber);

        // then
        double expected = 30;
        /* if (actual == expected) System.out.println("YES");
        else System.out.println("NO"); */
        assertEquals(expected, actual);         // junit

        assertThat(actual)
                .isEqualTo(expected)
                .isGreaterThan(2)
                .isNotNull();                     // assertJ

    }

    @Test
    @DisplayName("Minus two numbers")
    void minus() {
        double firstNumber = 20;
        double secondNUmber = 10;
        double actual = Calculator.minus(firstNumber, secondNUmber);
        double expected = 10;

        assertEquals(expected, actual);

    }

    @Test
    @DisplayName("Multiply two number")
    void multiply() {
        double firstNumber = 5;
        double secondNumber = 5;
        double actual = Calculator.multiply(firstNumber, secondNumber);
        double expected = 25;

        assertEquals(expected, actual);

    }

    @Test
    @DisplayName("Dividing two number")
    void dividing() {
        double firstNumber = 10;
        double secondNumber = 2;
        double actual = Calculator.dividing(firstNumber, secondNumber);
        double expected = 5;

        assertEquals(expected, actual);
    }
}