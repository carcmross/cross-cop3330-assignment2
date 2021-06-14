package ex29.base;

/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright Marc-Anthony Cross
 */

public class InputValidator {
    public static boolean isValid(String rate) {
        if (rate.equals("0"))
            return false;

        char[] rate_arr = rate.toCharArray();
        int length = rate.length();
        for (int i = 0; i < length; i++) {
            if (Character.isDigit(rate_arr[i]) == false)
                return false;
        }
        return true;
    }
}
