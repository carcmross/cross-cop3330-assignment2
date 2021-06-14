package ex35.base;

import java.util.Random;

/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright Marc-Anthony Cross
 */

public class ContestEntryFilter {
    public static boolean isBlankEntry(String input) {
        if (input.equals(""))
            return true;
        return false;
    }

    public static int getRandomNum(int num_contestants) {
        Random rand = new Random();
        return rand.nextInt(num_contestants);
    }
}
