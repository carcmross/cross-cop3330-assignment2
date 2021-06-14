package ex33.base;

import java.util.Random;

/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright Marc-Anthony Cross
 */

public class Magic8Ball {
    public static int offerJudgment() {
        Random rand = new Random();
        return rand.nextInt(4);
    }
}
