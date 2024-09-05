import java.util.Scanner;

class Game{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Define the range for the random number
        int min = 1;
        int max = 100;

        // Generate a random number between min and max
        int random = getRandom(min, max);

        // Initialize variables for the guessing game
        int numberOfAttempts = 0;
        int guess = 0;

        // Start the guessing game
        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("I have selected a number between " + min + " and " + max + ". Try to guess it.");

        // Loop until the user guesses the correct number
        while (guess != random) {
            System.out.print("Enter your guess: ");
            guess = sc.nextInt();
            numberOfAttempts++;

            if (guess < random) {
                System.out.println("Too low! Try again.");
            } else if (guess > random) {
                System.out.println("Too high! Try again.");
            } else {
                System.out.println("Congratulations! You've guessed the number correctly!");
                System.out.println("It took you " + numberOfAttempts + " attempts.");
            }
        }

        // Close the scanner
        sc.close();
    }

    /**
     * Generates a random number between min and max (inclusive).
     *
     * @param min The minimum value (inclusive).
     * @param max The maximum value (inclusive).
     * @return A random number between min and max.
     */
    public static int getRandom(int min, int max) {
        return min + (int) (Math.random() * (max - min + 1));
    }
}

