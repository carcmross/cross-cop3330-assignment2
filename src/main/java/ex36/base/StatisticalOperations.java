package ex36.base;

import java.util.ArrayList;

/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright Marc-Anthony Cross
 */

public class StatisticalOperations {
    public static boolean isValidNumber(String input) {
        char[] input_arr = input.toCharArray();
        int length = input.length();
        for (int i = 0; i < length; i++) {
            if (Character.isDigit(input_arr[i]) != true)
                return false;
        }
        return true;
    }

    public static double average(ArrayList numbers) {
        int sum = 0;
        int cur_num;
        int size = numbers.size();

        for (int i = 0; i < size; i++) {
            cur_num = (int) numbers.get(i);
            sum += cur_num;
        }

        return (double) sum / size;
    }

    public static int min(ArrayList numbers) {
        int array_size = numbers.size();
        int min = (int) numbers.get(0);

        for (int i = 1; i < array_size; i++) {
            if ((int) numbers.get(i) < min)
                min = (int) numbers.get(i);
        }

        return min;
    }

    public static int max(ArrayList numbers) {
        int array_size = numbers.size();
        int max = (int) numbers.get(0);

        for (int i = 1; i < array_size; i++) {
            if ((int) numbers.get(i) > max)
                max = (int) numbers.get(i);
        }

        return max;
    }

    public static double std(ArrayList numbers, double avg) {
        double standard_dev = 0;
        double base = 0;
        int array_size = numbers.size();

        for (int i = 0; i < array_size; i++) {
            base = ((int) numbers.get(i) - avg);
            standard_dev += Math.pow(base, 2);
        }
        standard_dev = standard_dev / array_size;
        return Math.sqrt(standard_dev);
    }
}
