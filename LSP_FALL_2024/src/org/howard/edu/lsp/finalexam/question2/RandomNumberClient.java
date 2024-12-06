package org.howard.edu.lsp.finalexam.question2;

public class RandomNumberClient {
    public static void main(String[] args) {
        RandomNumberService service = RandomNumberService.getInstance();

        // Use BuiltInRandomStrategy
        service.setStrategy(new BuiltInRandomStrategy());
        System.out.println("Random number using BuiltInRandomStrategy: " + service.generateRandomNumber());

        // Use CustomRandomStrategy
        service.setStrategy(new CustomRandomStrategy());
        System.out.println("Random number using CustomRandomStrategy: " + service.generateRandomNumber());
    }
}
