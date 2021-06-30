package ex40.base;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright Marc-Anthony Cross
 */

class EmployeeMapGeneratorTest {

    @Test
    void generateOutput_returns_jacquelyn_if_lookFor_is_equal_to_Jacq() {
        EmployeeMapGenerator generator = new EmployeeMapGenerator();
        List<Map<String, String>> employee_maps = generator.generateEmployeeMaps();
        String expected = String.format("%-20s|%-20s|%-15s", "Name", "Position", "Separation Date\n");
        expected += String.format("%-50s", "--------------------|--------------------|-----------------\n");
        expected += String.format("%-20s|%-20s|%-15s\n", "Jacquelyn Jackson", "DBA", "");
        String actual = generator.generateOutput("Jacq", employee_maps);
        assertEquals(expected, actual);
    }
}