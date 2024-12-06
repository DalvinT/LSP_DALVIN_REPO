package org.howard.edu.lsp.finalexam.question2;

import java.util.Random;

/**
 * Implements random number generation using Java's built-in Random class.
 */
public class BuiltInRandomStrategy implements RandomNumberStrategy {
    private Random random = new Random();

    @Override
    public int generate() {
        return random.nextInt(Integer.MAX_VALUE) + 1; // Ensure positive numbers
    }
}
