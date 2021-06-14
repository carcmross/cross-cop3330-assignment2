package ex35.base;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright Marc-Anthony Cross
 */

public class Solution35 {
    private static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        ContestEntryFilter cef = new ContestEntryFilter();
        List<String> contestants = new ArrayList<>();
        int num_contestants = 0;
        String newEntry;

        boolean isLastEntry = false;
        while (isLastEntry == false) {
            newEntry = addEntry();
            if (cef.isBlankEntry(newEntry) == false) {
                contestants.add(newEntry);
                num_contestants += 1;
            }
            else
                isLastEntry = true;
        }

        String winner = contestants.get(cef.getRandomNum(num_contestants));
        String outputString = generateOutput(winner);
        System.out.println(outputString);


    }

    public static String generateOutput(String winner) {
        return "The winner is... " + winner + ".";
    }

    public static String addEntry() {
        System.out.print("Enter a name: ");
        return in.nextLine();
    }
}
