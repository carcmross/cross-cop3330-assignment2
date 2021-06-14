package ex32.base;

import java.util.Random;
import java.util.Scanner;

/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright Marc-Anthony Cross
 */

public class Solution32 {
    private static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        NumberMatcher nm = new NumberMatcher();
        System.out.println("Let's play Guess the Number!\n");
        simulateRound();
        String rematch = askRematch();
        while (rematch.equals("Y") || rematch.equals("y")) {
            simulateRound();
            rematch = askRematch();
        }
    }

    public static String askRematch() {
        System.out.print("Do you wish to play again (Y/N)? ");
        return in.nextLine();
    }

    public static void simulateRound() {
        NumberMatcher nm = new NumberMatcher();
        System.out.print("Enter the difficulty level (1, 2, or 3): ");
        String difficulty = "";

        boolean isValid = false;
        while (isValid == false) {
            difficulty = in.nextLine();
            if (nm.ifIsANumber(difficulty))
                isValid = true;
        }

        int target = generateRandomNumber(difficulty);
        System.out.print("I have my number. What's your guess? " );

        String cur_guess = in.nextLine();
        int num_guesses = 0;

        int guess_result = nm.ifNumberIsCorrect(target, cur_guess);
        while (guess_result != 1) {
            if (guess_result == 0) {
                System.out.print("Too low. Guess again: ");
                num_guesses += 1;
                cur_guess = in.nextLine();
                guess_result = nm.ifNumberIsCorrect(target, cur_guess);
            }
            else if (guess_result == 2) {
                System.out.print("Too high. Guess again: ");
                num_guesses += 1;
                cur_guess = in.nextLine();
                guess_result = nm.ifNumberIsCorrect(target, cur_guess);
            }
        }
        num_guesses += 1;

        System.out.println("You got it in " + num_guesses + " guesses!");
    }

    public static int generateRandomNumber(String difficulty) {
        Random rand = new Random();
        int difficulty_int = Integer.parseInt(difficulty);

        if (difficulty_int == 1)
            return rand.nextInt(10) + 1;
        else if (difficulty_int == 2)
            return rand.nextInt(100) + 1;
        return rand.nextInt(1000) + 1;
    }
}
