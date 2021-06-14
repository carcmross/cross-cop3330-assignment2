package ex24.base;

import java.util.Scanner;

/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Marc-Anthony Cross
 */

public class Solution24 {
    private static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        AnagramDetector ad = new AnagramDetector();
        System.out.println("Enter two strings and I'll tell you if they are anagrams.");
        String string1 = getFirstString();
        String string2 = getSecondString();
        boolean result = ad.isAnagram(string1, string2);
        String outputString = generateOutput(result, string1, string2);
        System.out.println(outputString);
    }

    public static String getFirstString() {
        System.out.printf("Enter the first string: ");
        return in.nextLine();
    }

    public static String getSecondString() {
        System.out.printf("Enter the second string: ");
        return in.nextLine();
    }

    public static String generateOutput(boolean result, String string1, String string2) {
        if (result)
            return string1 + " and " + string2 + " are anagrams.";
        else
            return string1 + " and " + string2 + " are not anagrams.";
    }
}
