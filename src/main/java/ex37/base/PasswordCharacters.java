package ex37.base;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright Marc-Anthony Cross
 */

public class PasswordCharacters {
    public static boolean isNum(char element, List nums) {
        int num_size = nums.size();
        for (int i = 0; i < num_size; i++) {
            if ((Character) nums.get(i) == element)
                return true;
        }
        return false;
    }

    public static boolean isSpecial(char element, List sp_chars) {
        int sp_size = sp_chars.size();
        for (int i = 0; i < sp_size; i++) {
            if ((Character) sp_chars.get(i) == element)
                return true;
        }
        return false;
    }

    public static char getLetter(List letters) {
        Random rand = new Random();
        return (char) letters.get(rand.nextInt(letters.size()));
    }

    public static char getSpecialChar(List sp_chars) {
        Random rand = new Random();
        return (char) sp_chars.get(rand.nextInt(sp_chars.size()));
    }

    public static char getNum(List nums) {
        Random rand = new Random();
        return (char) nums.get(rand.nextInt(nums.size()));
    }

    public static String generatePassword(String min_len, String num_spc, String numNums) {
        Random rand = new Random();
        int min = Integer.parseInt(min_len);
        int special = Integer.parseInt(num_spc);
        int amount_of_nums = Integer.parseInt(numNums);
        int num_letters = min - (special + amount_of_nums);
        int index;

        List<Character> nums = Arrays.asList('0', '1', '2', '3', '4', '5', '6', '7', '8', '9');
        List<Character> sp_chars = Arrays.asList('%', '@', '#', '$', '+', '*', '&', '!', '(', '-', '\'', ')', '_', '/',
                '\\','[', ']', '{', '}', '.', ',', '?', ':', '`', '~');
        List<Character> letters = Arrays.asList('a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n',
                'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z');

        while (num_letters <= (special + amount_of_nums)) {
            min += 1;
            num_letters += 1;
        }

        String temp_password = "";
        for (int i = 0; i < min; i++)
            temp_password += getLetter(letters);
        char[] password_chars = temp_password.toCharArray();

        for (int i = 0; i < special; i++) {
            password_chars[rand.nextInt(min)] = getSpecialChar(sp_chars);
        }

        for (int i = 0; i < amount_of_nums; i++) {
            index = rand.nextInt(min);
            while (isSpecial(password_chars[index], sp_chars) && isNum(password_chars[index], nums)) {
                rand.nextInt(min);
            }
            password_chars[index] = getNum(nums);
        }

        String final_pw = "";
        for (int i = 0; i < min; i++)
            final_pw += password_chars[i];
        return final_pw;
    }
}
