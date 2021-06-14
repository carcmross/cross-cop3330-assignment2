package ex37.base;

import java.util.Scanner;

/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright Marc-Anthony Cross
 */

public class Solution37 {
    private static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        PasswordCharacters pw = new PasswordCharacters();
        String min_len = getMinLength();
        String special = getNumSpecial();
        String numNumbers = getAmountOfNums();
        String outputString = pw.generatePassword(min_len, special, numNumbers);
        System.out.println(outputString);
    }

    public static String getMinLength() {
        System.out.print("What's the minimum length? ");
        return in.nextLine();
    }

    public static String getNumSpecial() {
        System.out.print("How many special characters? ");
        return in.nextLine();
    }

    public static String getAmountOfNums() {
        System.out.print("How many numbers? ");
        return in.nextLine();
    }
}
