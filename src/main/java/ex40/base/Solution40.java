package ex40.base;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright Marc-Anthony Cross
 */

public class Solution40 {
    private static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        EmployeeMapGenerator generator = new EmployeeMapGenerator();
        List<Map<String, String>> employee_maps = generator.generateEmployeeMaps();
        String lookFor = getSearch();
        String outputString = generator.generateOutput(lookFor, employee_maps);
        System.out.println(outputString);
    }

    public static String getSearch() {
        System.out.print("Enter a search string: ");
        return in.nextLine();
    }
}
