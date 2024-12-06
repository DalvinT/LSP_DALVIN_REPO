package org.howard.edu.lsp.finalexam.question1;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class MathUtilsTest {

    @Test
    public void testFactorial_validInputs() {
        MathUtils utils = new MathUtils();
        assertEquals(1, utils.factorial(0), "Factorial of 0 should be 1");
        assertEquals(1, utils.factorial(1), "Factorial of 1 should be 1");
        assertEquals(120, utils.factorial(5), "Factorial of 5 should be 120");
    }

    @Test
    public void testFactorial_largeInput() {
        MathUtils utils = new MathUtils();
        assertEquals(479001600, utils.factorial(12), "Factorial of 12 should be 479001600");
    }

    @Test
    public void testFactorial_negativeInput() {
        MathUtils utils = new MathUtils();
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            utils.factorial(-5);
        });
        assertEquals("Number must be non-negative", exception.getMessage());
    }

    @Test
    public void testIsPrime_validPrimes() {
        MathUtils utils = new MathUtils();
        assertTrue(utils.isPrime(2), "2 is a prime number");
        assertTrue(utils.isPrime(17), "17 is a prime number");
        assertTrue(utils.isPrime(101), "101 is a prime number");
    }

    @Test
    public void testIsPrime_nonPrimes() {
        MathUtils utils = new MathUtils();
        assertFalse(utils.isPrime(1), "1 is not a prime number");
        assertFalse(utils.isPrime(4), "4 is not a prime number");
        assertFalse(utils.isPrime(100), "100 is not a prime number");
    }

    @Test
    public void testIsPrime_edgeCases() {
        MathUtils utils = new MathUtils();
        assertFalse(utils.isPrime(-1), "-1 is not a prime number");
        assertFalse(utils.isPrime(0), "0 is not a prime number");
    }

    @Test
    public void testGcd_validInputs() {
        MathUtils utils = new MathUtils();
        assertEquals(5, utils.gcd(10, 5), "GCD of 10 and 5 should be 5");
        assertEquals(1, utils.gcd(13, 7), "GCD of 13 and 7 should be 1");
        assertEquals(6, utils.gcd(54, 24), "GCD of 54 and 24 should be 6");
    }

    @Test
    public void testGcd_withZeroInput() {
        MathUtils utils = new MathUtils();
        assertEquals(10, utils.gcd(10, 0), "GCD of 10 and 0 should be 10");
        assertEquals(15, utils.gcd(0, 15), "GCD of 0 and 15 should be 15");
    }

    @Test
    public void testGcd_bothZeros() {
        MathUtils utils = new MathUtils();
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            utils.gcd(0, 0);
        });
        assertEquals("Both numbers cannot be zero", exception.getMessage());
    }
}
