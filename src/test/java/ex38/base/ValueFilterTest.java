package ex38.base;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright Marc-Anthony Cross
 */

class ValueFilterTest {

    @Test
    void isEven_returns_false_if_odd() {
        ValueFilter vf = new ValueFilter();
        boolean expected = false;
        boolean actual = vf.isEven('5');
        assertEquals(expected, actual);
    }

    @Test
    void isEven_returns_true_if_even() {
        ValueFilter vf = new ValueFilter();
        boolean expected = true;
        boolean actual = vf.isEven('4');
        assertEquals(expected, actual);
    }
}