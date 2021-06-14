package ex27.base;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright Marc-Anthony Cross
 */

class InputValidatorTest {

    @Test
    void validateFirstName_returns_both_warnings_for_empty_input() {
        InputValidator iv = new InputValidator();
        String expected = "The first name must be at least 2 characters long.\nThe first name must be filled in.\n";
        String actual = iv.validateFirstName("");
        assertEquals(expected,actual);
    }

    @Test
    void validateFirstName_returns_character_warning_for_short_input() {
        InputValidator iv = new InputValidator();
        String expected = "The first name must be at least 2 characters long.\n";
        String actual = iv.validateFirstName("A");
        assertEquals(expected,actual);
    }

    @Test
    void validateFirstName_returns_empty_string_for_valid_input() {
        InputValidator iv = new InputValidator();
        String expected = "";
        String actual = iv.validateFirstName("Marc");
        assertEquals(expected,actual);
    }

    @Test
    void validateLastName_returns_both_warnings_for_empty_input() {
        InputValidator iv = new InputValidator();
        String expected = "The last name must be at least 2 characters long.\nThe last name must be filled in.\n";
        String actual = iv.validateLastName("");
        assertEquals(expected,actual);
    }

    @Test
    void validateLastName_returns_character_warning_for_short_input() {
        InputValidator iv = new InputValidator();
        String expected = "The last name must be at least 2 characters long.\n";
        String actual = iv.validateLastName("A");
        assertEquals(expected,actual);
    }

    @Test
    void validateLastName_returns_empty_string_for_valid_input() {
        InputValidator iv = new InputValidator();
        String expected = "";
        String actual = iv.validateLastName("Cross");
        assertEquals(expected,actual);
    }

    @Test
    void validateIDFormat_returns_empty_string_for_valid_input() {
        InputValidator iv = new InputValidator();
        String expected = "";
        String actual = iv.validateIDFormat("TK-4321");
        assertEquals(expected,actual);
    }

    @Test
    void validateIDFormat_returns_format_warning_for_invalid_input() {
        InputValidator iv = new InputValidator();
        String expected = "The employee ID must be in the format AA-1234.\n";
        String actual = iv.validateIDFormat("A12-1234");
        assertEquals(expected,actual);
    }

    @Test
    void validateZipCode_returns_warning_if_ZIP_is_less_than_5_digits() {
        InputValidator iv = new InputValidator();
        String expected = "The zipcode must be a 5 digit number.\n";
        String actual = iv.validateZipCode("1234");
        assertEquals(expected,actual);
    }

    @Test
    void validateZipCode_returns_warning_if_ZIP_is_contains_letters() {
        InputValidator iv = new InputValidator();
        String expected = "The zipcode must be a 5 digit number.\n";
        String actual = iv.validateZipCode("ABCDE");
        assertEquals(expected,actual);
    }

    @Test
    void validateZipCode_returns_nothing_if_ZIP_is_valid() {
        InputValidator iv = new InputValidator();
        String expected = "";
        String actual = iv.validateZipCode("12345");
        assertEquals(expected,actual);
    }
}