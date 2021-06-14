package ex27.base;

import java.util.Scanner;

/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright Marc-Anthony Cross
 */

public class Solution27 {
    private static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        InputValidator iv = new InputValidator();
        String firstName = getFirstName();
        String lastName = getLastName();
        String ZIP = getZIP();
        String employeeID = getEmployeeID();
        String outputString = validateInput(firstName, lastName, ZIP, employeeID);
        System.out.print(outputString);
    }

    public static String getFirstName() {
        System.out.print("Enter the first name: ");
        return in.nextLine();
    }

    public static String getLastName() {
        System.out.print("Enter the last name: ");
        return in.nextLine();
    }

    public static String getZIP() {
        System.out.print("Enter the ZIP code: ");
        return in.nextLine();
    }

    public static String getEmployeeID() {
        System.out.print("Enter the employee ID: ");
        return in.nextLine();
    }

    public static String validateInput(String firstName, String lastName, String ZIP, String ID) {
        InputValidator iv = new InputValidator();
        String outputString = "";
        outputString += iv.validateFirstName(firstName);
        outputString += iv.validateLastName(lastName);
        outputString += iv.validateIDFormat(ID);
        outputString += iv.validateZipCode(ZIP);

        if (outputString.equals("") == true)
            outputString = "There were no errors found.\n";
        return outputString;
    }

}
