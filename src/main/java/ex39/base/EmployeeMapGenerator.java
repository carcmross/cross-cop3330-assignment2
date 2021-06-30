package ex39.base;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright Marc-Anthony Cross
 */

public class EmployeeMapGenerator {
    public static List generateEmployeeMaps() {
        List<Map<String, String>> employee_maps = new ArrayList<>();
        Map<String, String> emp1 = new HashMap<>();
        emp1.put("firstName", "John");
        emp1.put("lastName", "Johnson");
        emp1.put("position", "Manager");
        emp1.put("separation date", "2016-12-13");
        employee_maps.add(emp1);
        Map<String, String> emp2 = new HashMap<>();
        emp2.put("firstName", "Tou");
        emp2.put("lastName", "Xiong");
        emp2.put("position", "Software Engineer");
        emp2.put("separation date", "2016-10-05");
        employee_maps.add(emp2);
        Map<String, String> emp3 = new HashMap<>();
        emp3.put("firstName", "Michaela");
        emp3.put("lastName", "Michaelson");
        emp3.put("position", "District Manager");
        emp3.put("separation date", "2015-12-19");
        employee_maps.add(emp3);
        Map<String, String> emp4 = new HashMap<>();
        emp4.put("firstName", "Jake");
        emp4.put("lastName", "Jacobson");
        emp4.put("position", "Programmer");
        emp4.put("separation date", "");
        employee_maps.add(emp4);
        Map<String, String> emp5 = new HashMap<>();
        emp5.put("firstName", "Jacquelyn");
        emp5.put("lastName", "Jackson");
        emp5.put("position", "DBA");
        emp5.put("separation date", "");
        employee_maps.add(emp5);
        Map<String, String> emp6 = new HashMap<>();
        emp6.put("firstName", "Sally");
        emp6.put("lastName", "Webber");
        emp6.put("position", "Web Developer");
        emp6.put("separation date", "2015-12-28");
        employee_maps.add(emp6);
        return employee_maps;
    }
}
