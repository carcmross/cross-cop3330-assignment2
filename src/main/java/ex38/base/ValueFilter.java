package ex38.base;

/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright Marc-Anthony Cross
 */

import java.util.ArrayList;
import java.util.List;

public class ValueFilter {
    public static boolean isEven(int num) {
        if (num % 2 == 0)
            return true;
        return false;
    }

    public static String filterEvenNumbers(char[] input) {
        List<Integer> values = new ArrayList<>();
        String cur_val = "";
        int length = input.length;
        int converted_int = 0;
        for (int i = 0; i < length; i++) {
            if (Character.isDigit(input[i]))
                cur_val = String.valueOf(input[i]);
            else
                continue;
            while ((i + 1) < length && Character.isSpaceChar(input[i + 1]) != true) {
                cur_val += input[i + 1];
                i += 1;
            }
            converted_int = Integer.parseInt(cur_val);
            values.add(converted_int);
        }

        String output = "The even numbers are ";
        int size = values.size();
        for (int i = 0; i < size; i++) {
            if (isEven(values.get(i)))
                output += String.valueOf((int) values.get(i)) + " ";
        }

        char[] temp_output = output.toCharArray();
        temp_output[temp_output.length - 1] = '.';
        String final_output = String.valueOf(temp_output);
        return final_output;
    }
}
