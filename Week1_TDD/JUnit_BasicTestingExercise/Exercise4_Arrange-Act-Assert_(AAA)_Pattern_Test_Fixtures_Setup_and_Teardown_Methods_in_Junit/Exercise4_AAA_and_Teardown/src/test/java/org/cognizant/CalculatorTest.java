package org.cognizant;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class CalculatorTest {
    private Calculator calculator;



    @Before
    public void setUp() {
        calculator = new Calculator();
        System.out.println("Setup completed");
    }


    @After
    public void tearDown() {
        calculator = null;
        System.out.println("Teardown completed");
    }



    @Test
    public void testAddition() {

        // Arrange
        int firstNumber = 15;
        int secondNumber = 10;

        // Act
        int result = calculator.add(firstNumber, secondNumber);

        // Assert
        assertEquals(25, result);



    }
}