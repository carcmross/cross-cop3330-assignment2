package ex39.base;

/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright Marc-Anthony Cross
 */

import java.util.*;

public class Solution39 {
    public static void main(String[] args) {
        EmployeeMapGenerator generator = new EmployeeMapGenerator();
        RecordSorter rs = new RecordSorter();
        List<Map<String, String>> employee_maps = generator.generateEmployeeMaps();
        List<String> last_names = Arrays.asList("Johnson", "Xiong", "Michaelson", "Jacobson", "Jackson", "Webber");
        rs.sortLastNames(last_names);
        String outputString = generateOutput(last_names, employee_maps);
        System.out.println(outputString);
    }

    public static String generateOutput(List last_names, List employee_maps) {
        String outputString = String.format("%-20s|%-20s|%-15s", "Name", "Position", "Separation Date\n");
        outputString += String.format("%-50s", "--------------------|--------------------|-----------------\n");
        Map<String, String> cur_map = new HashMap<>();

        int size = employee_maps.size();
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                cur_map = (Map<String, String>) employee_maps.get(j);
                if (last_names.get(i).equals(cur_map.get("lastName")))
                    outputString += String.format("%-20s|%-20s|%-15s\n", cur_map.get("firstName") + " " +
                                                    cur_map.get("lastName"), cur_map.get("position"),
                                                        cur_map.get("separation date"));
            }
        }
        return outputString;
    }
}
