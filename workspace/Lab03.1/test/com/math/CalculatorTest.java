/*
 * This code is sample code, provided as-is, and we make no
 * warranties as to its correctness or suitability for
 * any purpose.
 *
 * We hope that it's useful to you.  Enjoy.
 * Copyright LearningPatterns Inc.
 */
package com.math;

import static org.junit.Assert.*;
import org.junit.Test;

public class CalculatorTest {

    @Test
    public void testIsEven() {
        // Add implementation if needed
    }

    @Test
    public void testDivide() {
        Calculator calc = new Calculator();
        assertEquals(2.5, calc.divide(5, 2), 0.001);
    }

    @Test
    public void testAdd() {
        Calculator calc = new Calculator();
        assertEquals(5, calc.add(1, 4));
    }
}
