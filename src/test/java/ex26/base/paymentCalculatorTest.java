package ex26.base;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright Marc-Anthony Cross
 */

class paymentCalculatorTest {
    @Test
    void calculateMonthsUntilPaidOff_returns_70_for_sample_output() {
        paymentCalculator pc = new paymentCalculator();
        int expected = 70;
        int actual = pc.calculateMonthsUntilPaidOff("5000", "12", "100");
        assertEquals(expected, actual);
    }
}