
package com.exemple;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {

    private Calculator calculator;

    @BeforeEach
    void setUp() {
        calculator = new Calculator();
    }

    @Test
    void testAddition() {
        assertEquals(8, calculator.addition(5, 3));
    }

    @Test
    void testSubtraction() {
        assertEquals(2, calculator.subtraction(5, 3));
    }

    @Test
    void testMultiplication() {
        assertEquals(15, calculator.multiplication(5, 3));
    }

    @Test
    void testDivision() {
        assertEquals(2, calculator.division(6, 3));
    }

    @Test
    void testDivisionByZero() {
        assertThrows(ArithmeticException.class,
                () -> calculator.division(5, 0));
    }
}
