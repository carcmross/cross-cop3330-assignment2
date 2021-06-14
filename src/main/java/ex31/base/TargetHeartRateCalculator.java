package ex31.base;

/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright Marc-Anthony Cross
 */

public class TargetHeartRateCalculator {
    public static String findTargetPulse(String age, String resting_pulse, String intensity) {
        int age_int = Integer.parseInt(age);
        int pulse_int = Integer.parseInt(resting_pulse);
        double intensity_double = Double.parseDouble(intensity) / 100;
        double target = (((220 - age_int) - pulse_int) * intensity_double) + pulse_int;
        int rounded_target = (int) Math.round(target);
        return String.valueOf(rounded_target);
    }

    public static boolean isValidPulse(String resting_pulse) {
        int length = resting_pulse.length();
        char[] pulse_arr = resting_pulse.toCharArray();
        for (int i = 0; i < length; i++) {
            if (Character.isDigit(pulse_arr[i]) != true)
                return false;
        }
        return true;
    }

    public static boolean isValidAge(String age) {
        int length = age.length();
        char[] age_arr = age.toCharArray();

        for (int i = 0; i < length; i++) {
            if (Character.isDigit(age_arr[i]) != true)
                return false;
        }
        return true;
    }

}
