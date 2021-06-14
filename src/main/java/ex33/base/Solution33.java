package ex33.base;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright Marc-Anthony Cross
 */

public class Solution33 {
    private static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        Magic8Ball ball = new Magic8Ball();
        List<String> answers = Arrays.asList("Yes.", "No.", "Maybe.", "Ask again later.");
        String question = simulate();
        String outputString = answers.get(ball.offerJudgment());
        System.out.println(outputString);
    }

    public static String simulate() {
        System.out.print("Whats your question?\n> ");
        return in.nextLine();
    }
}
