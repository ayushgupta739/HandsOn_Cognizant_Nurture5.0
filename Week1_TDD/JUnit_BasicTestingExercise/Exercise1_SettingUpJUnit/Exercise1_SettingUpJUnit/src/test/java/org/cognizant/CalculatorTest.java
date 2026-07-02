package org.cognizant;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    private final Calculator calculator = new Calculator();

    @Test
    public void testAddition() {

        int result = calculator.add(2, 3);

        assertEquals(5, result);

    }
}