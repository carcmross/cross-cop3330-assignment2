package ex39.base;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class RecordSorter {
    public static List generateEmployeeData() {
        List<Employee> employees = new ArrayList<Employee>();
        Employee num1 = new Employee("John", "Johnson", "Manager", "2016-12-31");
        employees.add(num1);
        Employee num2 = new Employee("Tou", "Xiong", "Software Engineer", "2016-10-05");
        employees.add(num2);
        Employee num3 = new Employee("Michaela", "Michaelson", "District Manager",
                "2015-12-19");
        employees.add(num3);
        Employee num4 = new Employee("Jake", "Jacobson", "Programmer", "");
        employees.add(num4);
        Employee num5 = new Employee("Jacquelyn", "Jackson", "DBA", "");
        employees.add(num5);
        Employee num6 = new Employee("Sally", "Webber", "Web Developer", "2015-12-28");
        employees.add(num6);

        return employees;
    }


}
