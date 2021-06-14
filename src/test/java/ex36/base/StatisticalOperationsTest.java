package ex36.base;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright Marc-Anthony Cross
 */

class StatisticalOperationsTest {

    @Test
    void isValidNumber_returns_false_for_nonnumber() {
        StatisticalOperations so = new StatisticalOperations();
        boolean expected = false;
        boolean actual = so.isValidNumber("abcde");
        assertEquals(expected, actual);
    }

    @Test
    void isValidNumber_returns_true_for_number() {
        StatisticalOperations so = new StatisticalOperations();
        boolean expected = false;
        boolean actual = so.isValidNumber("1234");
        assertEquals(expected, actual);
    }

}