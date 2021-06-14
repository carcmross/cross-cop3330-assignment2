package ex29.base;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright Marc-Anthony Cross
 */

class InputValidatorTest {

    @Test
    void isValid_returns_false_if_input_is_0() {
        InputValidator iv = new InputValidator();
        boolean expected = false;
        boolean actual = iv.isValid("0");
        assertEquals(expected, actual);
    }

    @Test
    void isValid_returns_false_if_input_is_nonnumeric() {
        InputValidator iv = new InputValidator();
        boolean expected = false;
        boolean actual = iv.isValid("ABC");
        assertEquals(expected, actual);
    }

    @Test
    void isValid_returns_true_if_input_is_valid() {
        InputValidator iv = new InputValidator();
        boolean expected = true;
        boolean actual = iv.isValid("4");
        assertEquals(expected, actual);
    }
}