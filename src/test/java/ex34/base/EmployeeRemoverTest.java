package ex34.base;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright Marc-Anthony Cross
 */

class EmployeeRemoverTest {

    @Test
    void removeEmployee_removes_correct_employee() {
        EmployeeRemover er = new EmployeeRemover();
        List orig = Arrays.asList("John Smith", "Jackie Jackson", "Chris Jones", "Amanda Cullen", "Jeremy Goodwin");
        List expected = Arrays.asList("John Smith", "Jackie Jackson", "Amanda Cullen", "Jeremy Goodwin");
        List actual = er.removeEmployee(orig, 5, "Chris Jones");
        assertEquals(expected, actual);
    }
}