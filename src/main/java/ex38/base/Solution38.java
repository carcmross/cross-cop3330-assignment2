package ex38.base;

import java.util.Scanner;

/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright Marc-Anthony Cross
 */

public class Solution38 {
    private static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        ValueFilter vf = new ValueFilter();
        String vals = getValues();
        char[] vals_arr = vals.toCharArray();
        String outputString = vf.filterEvenNumbers(vals_arr);
        System.out.println(outputString);
    }

    public static String getValues() {
        System.out.print("Enter a list of numbers, separated by spaces: ");
        return in.nextLine();
    }
}
