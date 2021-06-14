package ex34.base;

import java.util.ArrayList;
import java.util.List;

/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright Marc-Anthony Cross
 */

public class EmployeeRemover {
    public static List removeEmployee(List employees, int num_employees, String bad_employee) {
        List<String> newEmployeeList = new ArrayList<>();
        int employees_added = 0;

        for (int i = 0; i < 5; i++) {
            if (employees.get(i).equals(bad_employee))
                continue;
            newEmployeeList.add(employees_added, (String) employees.get(i));
            employees_added += 1;
        }

        return newEmployeeList;
    }
}
