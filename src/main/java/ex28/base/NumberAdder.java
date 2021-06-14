package ex28.base;

/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright Marc-Anthony Cross
 */

public class NumberAdder {
    public static String addNumbers(String sum, String num) {
        int addend = Integer.parseInt(num);
        int result = Integer.parseInt(sum);
        result += addend;
        return String.valueOf(result);
    }
}
