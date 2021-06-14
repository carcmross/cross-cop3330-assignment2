package ex27.base;

/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright Marc-Anthony Cross
 */

public class InputValidator {
    public static String validateFirstName(String firstName) {
        if (firstName.length() == 0)
            return "The first name must be at least 2 characters long.\n" + "The first name must be filled in.\n";
        else if (firstName.length() < 2) {
            return "The first name must be at least 2 characters long.\n";
        }
        return "";
    }

    public static String validateLastName(String lastName) {
        if (lastName.length() == 0)
            return "The last name must be at least 2 characters long.\n" + "The last name must be filled in.\n";
        else if (lastName.length() < 2) {
            return "The last name must be at least 2 characters long.\n";
        }
        return "";
    }

    public static String validateIDFormat(String employeeID) {
        if (employeeID.matches(".{2}-\\d{4}"))
            return "";
        else
            return "The employee ID must be in the format AA-1234.\n";
    }

    public static String validateZipCode(String zipCode) {
        int num_digits = zipCode.length();
        if (num_digits != 5)
            return "The zipcode must be a 5 digit number.\n";

        char[] zip_arr = zipCode.toCharArray();
        for (int i = 0; i < num_digits; i++) {
            if (Character.isDigit(zip_arr[i]) != true)
                return "The zipcode must be a 5 digit number.\n";
        }
        return "";
    }
}
