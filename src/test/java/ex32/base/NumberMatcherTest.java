package ex32.base;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright Marc-Anthony Cross
 */

class NumberMatcherTest {

    @Test
    void ifNumberIsCorrect_returns_1_for_correct_guess() {
        NumberMatcher nm = new NumberMatcher();
        int expected = 1;
        int actual = nm.ifNumberIsCorrect(5, "5");
        assertEquals(expected, actual);
    }

    @Test
    void ifNumberIsCorrect_returns_0_for_low_guess() {
        NumberMatcher nm = new NumberMatcher();
        int expected = 0;
        int actual = nm.ifNumberIsCorrect(5, "2");
        assertEquals(expected, actual);
    }

    @Test
    void ifNumberIsCorrect_returns_2_for_high_guess() {
        NumberMatcher nm = new NumberMatcher();
        int expected = 2;
        int actual = nm.ifNumberIsCorrect(5, "8");
        assertEquals(expected, actual);
    }

    @Test
    void ifIsANumber_returns_false_for_nonnumber() {
        NumberMatcher nm = new NumberMatcher();
        boolean expected = false;
        boolean actual = nm.ifIsANumber("ABCDE");
        assertEquals(expected, actual);
    }

    @Test
    void ifIsANumber_returns_true_for_number() {
        NumberMatcher nm = new NumberMatcher();
        boolean expected = true;
        boolean actual = nm.ifIsANumber("50");
        assertEquals(expected, actual);
    }
}