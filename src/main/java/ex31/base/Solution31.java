package ex31.base;

import java.util.Scanner;

/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright Marc-Anthony Cross
 */

public class Solution31 {
    private static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        TargetHeartRateCalculator thrc = new TargetHeartRateCalculator();
        String resting_pulse = "";
        String age = "";
        boolean valid_age = false;
        boolean valid_pulse = false;

        while (valid_pulse == false) {
            resting_pulse = getRestingPulse();
            if (thrc.isValidPulse(resting_pulse))
                valid_pulse = true;
        }
        while (valid_age == false) {
            age = getAge();
            if (thrc.isValidAge(age))
                valid_age = true;
        }

        String outputString = String.format("Resting pulse: %s\tAge: %s\n\n", resting_pulse, age);
        outputString += String.format("%10s|%5s\n", "Intensity  ", " Rate ");
        outputString += String.format("%10s|%8s\n", "-----------", "--------");

        String cur_target = "";
        for (int i = 55; i <= 95; i += 5) {
            cur_target = thrc.findTargetPulse(age, resting_pulse, String.valueOf(i));
            outputString += String.format("%11s| %3s bpm\n", String.valueOf(i) + "%        ", cur_target);
        }
        System.out.println(outputString);
    }

    public static String getRestingPulse() {
        System.out.print("What's your resting pulse? ");
        return in.nextLine();
    }

    public static String getAge() {
        System.out.print("What's your age? ");
        return in.nextLine();
    }
}
