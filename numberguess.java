import java.util.Scanner;
import java.util.Random;

public class numberguesser {
    static Scanner input = new Scanner(System.in);
    static Random rand = new Random();

    public static void main(String[] args) {
        String choice;
        do {
            System.out.println("Pick a difficulty: Easy, Hard, Custom");
            choice = input.next();
            int guesses;

            while (!choice.equalsIgnoreCase("Easy") && !choice.equalsIgnoreCase("Hard") && !choice.equalsIgnoreCase("Custom")) {
                System.out.println("Please pick one of the options, Easy, Hard, Custom");
                choice = input.next();
            }

            if (choice.equalsIgnoreCase("Easy")) {
                // Easy Mode
                guesses = 0;
                int guess;
                int number = rand.nextInt(100) + 1;
                System.out.println("You have a generated number between 1 and 100 as well as 5 guesses.");

                while (guesses < 5) {
                    System.out.println("Input guess:");
                    guess = input.nextInt();
                    if (guess == number) {
                        System.out.println("You win!");
                        break;
                    } else {
                        guesses++;
                        if (guesses < 5) {
                            System.out.println("Try again.");
                        }
                    }
                }
                if (guesses == 5) {
                    System.out.println("You lose. The number was: " + number);
                }
            } else if (choice.equalsIgnoreCase("Hard")) {
                // Hard Mode
                guesses = 0;
                int guess;
                int number = rand.nextInt(1000) + 1;
                System.out.println("You have a generated number between 1 and 1000 as well as 10 guesses.");

                while (guesses < 10) {
                    System.out.println("Input guess:");
                    guess = input.nextInt();
                    if (guess == number) {
                        System.out.println("You win!");
                        break;
                    } else {
                        guesses++;
                        if (guesses < 10) {
                            System.out.println("Try again.");
                        } else {
                            System.out.println("You lose. The number was: " + number);
                        }
                    }
                }
            } else if (choice.equalsIgnoreCase("Custom")) {
                // Custom Mode
                System.out.println("Enter the maximum number for the range:");
                int maxRange = input.nextInt();
                System.out.println("Enter the number of guesses:");
                int maxGuesses = input.nextInt();

                guesses = 0;
                int guess;
                int number = rand.nextInt(maxRange) + 1;
                System.out.println("You have a generated number between 1 and " + maxRange + " as well as " + maxGuesses + " guesses.");

                while (guesses < maxGuesses) {
                    System.out.println("Input guess:");
                    guess = input.nextInt();
                    if (guess == number) {
                        System.out.println("You win!");
                        break;
                    } else {
                        guesses++;
                        if (guesses < maxGuesses) {
                            System.out.println("Try again.");
                        } else {
                            System.out.println("You lose. The number was: " + number);
                        }
                    }
                }
            }

            System.out.println("Do you want to play again? (yes/no)");
            choice = input.next();
        } while (choice.equalsIgnoreCase("yes"));

        System.out.println("Thank you for playing!");
    }
}
