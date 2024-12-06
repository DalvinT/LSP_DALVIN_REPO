package org.howard.edu.lsp.finalexam.question2;

/**
 * Singleton service that provides random number generation using different strategies.
 */
public class RandomNumberService {
    private static RandomNumberService instance;
    private RandomNumberStrategy strategy;

    /**
     * Private constructor to enforce Singleton pattern.
     */
    private RandomNumberService() {}

    /**
     * Gets the single instance of RandomNumberService.
     * @return the single instance of the service
     */
    public static RandomNumberService getInstance() {
        if (instance == null) {
            instance = new RandomNumberService();
        }
        return instance;
    }

    /**
     * Sets the strategy for random number generation.
     * @param strategy the random number strategy to use
     */
    public void setStrategy(RandomNumberStrategy strategy) {
        this.strategy = strategy;
    }

    /**
     * Generates a random number using the current strategy.
     * @return a random number
     */
    public int generateRandomNumber() {
        if (strategy == null) {
            throw new IllegalStateException("Random number strategy not set.");
        }
        return strategy.generate();
    }
}
