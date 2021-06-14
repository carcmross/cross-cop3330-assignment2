package ex32.base;

/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright Marc-Anthony Cross
 */

public class NumberMatcher {
    public static int ifNumberIsCorrect(int target, String cur_guess) {
        int num_guessed = Integer.parseInt(cur_guess);

        if (target == num_guessed) {
            return 1;
        }
        else if (target > num_guessed)
            return 0;
        return 2;
    }

    public static boolean ifIsANumber(String input) {
        char[] input_arr = input.toCharArray();
        int length = input.length();

        for (int i = 0; i < length; i++) {
            if (Character.isDigit(input_arr[i]) != true)
                return false;
        }
        return true;
    }
}
