package ex29.base;

import java.util.Scanner;

/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright Marc-Anthony Cross
 */

public class Solution29 {
    private static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        InputValidator iv = new InputValidator();
        boolean isValid = false;
        String rate = "";
        while (isValid == false) {
            rate = getRate();
            isValid = iv.isValid(rate);
            if (isValid == false)
                System.out.println("Sorry. That's not a valid input.");
        }
        String num_years = getYears(rate);
        String outputString = generateOutput(num_years);
        System.out.println(outputString);
    }

    public static String generateOutput(String num_years) {
        return "It will take " + num_years + " years to double your initial investment.";
    }

    public static String getYears(String rate) {
        double decimal_rate = Double.parseDouble(rate);
        int num_years = (int) Math.ceil(72 / decimal_rate);
        return String.valueOf(num_years);
    }

    public static String getRate() {
        System.out.print("What is the rate of return? ");
        return in.nextLine();
    }
}
