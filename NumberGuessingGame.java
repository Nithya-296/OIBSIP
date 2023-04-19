import java.util.Scanner;

public class NumberGuessing{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int maxNumber = 200;
        int maxAttempts = 10;
        int maxRounds = 2;
        int round = 0;
        int score = 0;

        System.out.println("Welcome to the number guessing game!");
        System.out.println("You have " + maxRounds + " rounds to play. Each round you will have " + maxAttempts + " attempts to guess a number between 1 and " + maxNumber + ".");
        System.out.println("You will earn points based on the number of attempts you take to guess the number.");
        System.out.println("Let's begin!");

        while (round < maxRounds) {
            int numberToGuess = (int) (Math.random() * maxNumber) + 1;
            int attempts = 0;
            int guess;

            System.out.println("Round " + (round + 1) + ":");
            System.out.println("I'm thinking of a number between 1 and " + maxNumber + ". You have " + maxAttempts + " attempts to guess it.");

            do {
                System.out.print("Attempt " + (attempts + 1) + ": Enter your guess: ");
                guess = scanner.nextInt();
                attempts++;

                if (guess > numberToGuess) {
                    System.out.println("Too high! Try again.");
                } else if (guess < numberToGuess) {
                    System.out.println("Too low! Try again.");
                }
            } while (guess != numberToGuess && attempts < maxAttempts);

            int roundScore = maxAttempts - attempts + 1;
            score += roundScore;

            if (guess == numberToGuess) {
                System.out.println("Congratulations, you guessed the number in " + attempts + " attempts and earned " + roundScore + " points!");
            } else {
                System.out.println("Sorry, you did not guess the number. The number was " + numberToGuess + ".");
            }

            round++;
        }

        System.out.println("Game over. Your final score is " + score + ".");
        scanner.close();
    }
}