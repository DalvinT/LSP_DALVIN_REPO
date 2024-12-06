package org.howard.edu.lsp.finalexam.question2;

/**
 * Implements a custom random number generation algorithm
 * using a Linear Congruential Generator (LCG).
 */
public class CustomRandomStrategy implements RandomNumberStrategy {
    private long seed = System.currentTimeMillis();
    private static final long MULTIPLIER = 1664525;
    private static final long INCREMENT = 1013904223;
    private static final long MODULUS = (long) Math.pow(2, 31);

    @Override
    public int generate() {
        seed = (MULTIPLIER * seed + INCREMENT) % MODULUS;
        return (int) Math.abs(seed);
    }
}
