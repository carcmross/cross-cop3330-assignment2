package ex34.base;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright Marc-Anthony Cross
 */

public class Solution34 {
   private static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        EmployeeRemover er = new EmployeeRemover();
        List<String> employees = Arrays.asList("John Smith", "Jackie Jackson", "Chris Jones", "Amanda Cullen",
                                                                                                "Jeremy Goodwin");
        int num_employees = 5;
        System.out.println("There are " + num_employees + " employees:");
        for (int i = 0; i < num_employees; i++)
            System.out.println(employees.get(i));
        System.out.print("\n");

        String employeeToRemove = getFiredEmployee();
        employees = er.removeEmployee(employees, num_employees, employeeToRemove);
        num_employees -= 1;

        System.out.println("\nThere are " + num_employees + " employees:");
        for (int i = 0; i < num_employees; i++)
            System.out.println(employees.get(i));
    }

    public static String getFiredEmployee() {
        System.out.print("Enter an employee name to remove: ");
        return in.nextLine();
    }
}
