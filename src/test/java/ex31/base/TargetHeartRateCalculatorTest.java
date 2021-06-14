package ex31.base;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright Marc-Anthony Cross
 */

class TargetHeartRateCalculatorTest {

    @Test
    void findTargetPulse_returns_138_for_first_sample_output() {
        TargetHeartRateCalculator thrc = new TargetHeartRateCalculator();
        String expected = "138";
        String actual = thrc.findTargetPulse("22", "65", "55");
        assertEquals(expected, actual);
    }

    @Test
    void isValidPulse_returns_false_for_nonnumerical_input() {
        TargetHeartRateCalculator thrc = new TargetHeartRateCalculator();
        boolean expected = false;
        boolean actual = thrc.isValidPulse("ABC");
        assertEquals(expected, actual);
    }

    @Test
    void isValidPulse_returns_true_for_numerical_input() {
        TargetHeartRateCalculator thrc = new TargetHeartRateCalculator();
        boolean expected = true;
        boolean actual = thrc.isValidPulse("65");
        assertEquals(expected, actual);
    }

    @Test
    void isValidAge_returns_false_for_nonnumerical_input() {
        TargetHeartRateCalculator thrc = new TargetHeartRateCalculator();
        boolean expected = false;
        boolean actual = thrc.isValidAge("ABC");
        assertEquals(expected, actual);
    }

    @Test
    void isValidAge_returns_true_for_numerical_input() {
        TargetHeartRateCalculator thrc = new TargetHeartRateCalculator();
        boolean expected = true;
        boolean actual = thrc.isValidAge("22");
        assertEquals(expected, actual);
    }
}