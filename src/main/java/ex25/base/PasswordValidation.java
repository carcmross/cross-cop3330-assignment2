package ex25.base;

/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright Marc-Anthony Cross
 */

public class PasswordValidation {
    public static int passwordValidator(String password) {
        char[] password_arr = password.toCharArray();
        int num_digits = 0;
        int num_letters = 0;
        int num_special = 0;
        int length = password.length();

        for (int i = 0; i < length; i++) {
            if (Character.isDigit(password_arr[i]))
                num_digits += 1;
            else if (Character.isAlphabetic(password_arr[i]))
                num_letters += 1;
            else
                num_special += 1;
        }

        if (length < 8) {
            if (num_digits == length)
                return 1; // very weak
            if (num_letters == length)
                return 2; // weak
        }
        else {
            if (num_digits > 0 && num_letters > 0)
                if (num_special > 0)
                    return 4; // very strong
                return 3; // strong
        }
        return 0;
    }
}
