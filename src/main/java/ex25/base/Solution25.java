package ex25.base;

import java.util.Scanner;

/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright Marc-Anthony Cross
 */

public class Solution25 {
    private static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        PasswordValidation pwv = new PasswordValidation();
        String password = in.nextLine();
        int passwordStrength = pwv.passwordValidator(password);
        String outputString = generateOutput(password, passwordStrength);
        System.out.println(outputString);
    }

    public static String generateOutput(String password, int passwordStrength) {
        if (passwordStrength == 1)
            return "The password " + password + " is a very weak password.";
        else if (passwordStrength == 2)
            return "The password " + password + " is a weak password.";
        else if (passwordStrength == 3)
            return "The password " + password + " is a strong password.";
        else if (passwordStrength == 4)
            return "The password " + password + " is a very strong password.";
        return "";
    }
}
