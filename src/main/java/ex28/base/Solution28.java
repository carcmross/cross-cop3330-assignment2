package ex28.base;

import java.io.OutputStream;
import java.util.Scanner;

/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright Marc-Anthony Cross
 */

public class Solution28 {
    private static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        NumberAdder na = new NumberAdder();
        String addend = "0";
        String sum = "0";

        for (int i = 0; i < 5; i++) {
            addend = getNum();
            sum = na.addNumbers(sum, addend);
        }
        String outputString = generateOutput(sum);
        System.out.println(outputString);
    }

    public static String generateOutput(String sum) {
        return "The total is " + sum + ".";
    }

    public static String getNum() {
        System.out.print("Enter a number: ");
        return in.nextLine();
    }

    public static String addNumbers(String sum, String addend) {
        NumberAdder na = new NumberAdder();
        return na.addNumbers(sum, addend);
    }
}
