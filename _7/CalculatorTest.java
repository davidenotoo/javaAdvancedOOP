package javaadvanced._7;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CalculatorTest {
    /**
     * 1:
     *
     *
     * Create JUnit test for the add() and subtract() methods in the Calculator class.
     *
     * Test the methods with multiple test cases, including positive and negative numbers, and zero.
     *
     * Verify that the methods return the correct result for each test case.
     *
     * If there is an error you may have to change the code in Calculator to fix it!
     */
    @Test
    void exercise1() {
        System.out.println("\nExercise 1: ");
        Calculator calculator = new Calculator();
        //positive
        Assertions.assertEquals(420,calculator.add(400,20));
        Assertions.assertEquals(20,calculator.subtract(50,30));
        // negative
        Assertions.assertEquals(-380,calculator.add(-400,20));
        Assertions.assertEquals(-80,calculator.subtract(-50,30));
        // zero
        Assertions.assertEquals(0,calculator.add(-20,20));
        Assertions.assertEquals(0,calculator.subtract(50,50));



    }

    /**
     * 2:
     *
     *
     * Create JUnit test for the multiply() and divide() methods in the Calculator class.
     *
     * Test the same kind of inputs as before as exercise 1
     *
     * If there is an error you may have to change the code in Calculator to fix it!
     *
     */
    @Test
    void exercise2() {
        System.out.println("\nExercise 2: ");

        Calculator calculator = new Calculator();
        Assertions.assertThrows(ArithmeticException.class, () -> calculator.divide(10, 0));
        //positive
        Assertions.assertEquals(50,calculator.multiply(5,10));
        Assertions.assertEquals(5,calculator.divide(50,10));
        // negative
        Assertions.assertEquals(-50,calculator.multiply(5,-10));
        Assertions.assertEquals(-5,calculator.divide(-50,10));
        // zero
        Assertions.assertEquals(0,calculator.multiply(10,0));
        // ArithmeticException: lancia eccezione se la divisione da come risultato lo 0;
        Assertions.assertEquals(0,calculator.divide(10,0));
    }

    /**
     * 3:
     *
     * Create a JUnit test for the power() method in the Calculator class that raises a number to a power.
     * Test the method with test cases where the base is zero, positive, and negative - the exponent is zero, one and negative
     * Test with decimals too!
     * Verify that the method returns the correct result for each test case.
     *
     * If there is an error you may have to change the code in Calculator to fix it!
     *
     * Don't just write tests that use the result of the program as the expected!!
     */
    @Test
    void exercise3() {
        System.out.println("\nExercise 3: ");
        // base zero, positive, and negative - the exponent is zero
        Calculator calculator = new Calculator();
        Assertions.assertEquals(1, calculator.power(0, 0));
        Assertions.assertEquals(1, calculator.power(10, 0));
        Assertions.assertEquals(1, calculator.power(-10, 0));
        // positive and negative with exponent one
        Assertions.assertEquals(2, calculator.power(2, 1));
        Assertions.assertEquals(-2, calculator.power(-2, 1));
        // positive and negative with exponent negative
        Assertions.assertEquals(0.25, calculator.power(2, -2));
        Assertions.assertEquals(0.25, calculator.power(-2, -2));
        // decimals (ho settato il delta per avere max 2 cifre decimnali;
        Assertions.assertEquals(1.58, calculator.power(2.5, 0.5),0.01);
        Assertions.assertEquals(24.70, calculator.power(2.5, 3.5),0.01);
    }
}