package com.dsu.sqe;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {

    Calculator calculator = new Calculator();

    @Test
    void testAdd() {
        assertEquals(5, calculator.add(2, 3));
    }

    @Test
    void testAddNegativeNumbers() {
        assertEquals(-5, calculator.add(-2, -3));
    }

    @Test
    void testDivide() {
        assertEquals(2, calculator.divide(10, 5));
    }

    @Test
    void testDivideByZero() {
        assertThrows(ArithmeticException.class, () -> {
            calculator.divide(10, 0);
        });
    }
    
     @Test
    void testAddPositiveNumbers() {
        assertEquals(30, calculator.add(10, 20));
    }

    @Test
    void testAddZero() {
        assertEquals(5, calculator.add(5, 0));
    }

    @Test
    void testDivideNegativeNumbers() {
        assertEquals(-2, calculator.divide(-10, 5));
    }

    @Test
    void testDivideByOne() {
        assertEquals(10, calculator.divide(10, 1));
    }

    @Test
void testSubtract() {
    assertEquals(5, calculator.subtract(10, 5));
    }

    @Test
    void testMultiply() {
    assertEquals(50, calculator.multiply(10, 5));
    }
}