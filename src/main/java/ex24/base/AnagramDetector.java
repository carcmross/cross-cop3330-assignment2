package ex24.base;

import java.util.Arrays;

/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Marc-Anthony Cross
 */

public class AnagramDetector {
    public boolean isAnagram(String string1, String string2) {
        if (string1.length() != string2.length())
            return false;

        char[] str1_arr = string1.toCharArray();
        char[] str2_arr = string2.toCharArray();
        Arrays.sort(str1_arr);
        Arrays.sort(str2_arr);
        if (string1.length() == string2.length()) {
            for (int i = 0; i < string1.length(); i++) {
                if (str1_arr[i] != str2_arr[i])
                    return false;
            }
        }
        return true;
    }
}
