package ex25.base;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright Marc-Anthony Cross
 */

class PasswordValidationTest {
    @Test
    void passwordValidation_returns_1_for_very_weak_password() {
        PasswordValidation pwv = new PasswordValidation();
        int expected = 1;
        int actual = pwv.passwordValidator("12345");
        assertEquals(expected, actual);
    }

    @Test
    void passwordValidation_returns_2_for_weak_password() {
        PasswordValidation pwv = new PasswordValidation();
        int expected = 2;
        int actual = pwv.passwordValidator("abcdef");
        assertEquals(expected, actual);
    }

    @Test
    void passwordValidation_returns_3_for_strong_password() {
        PasswordValidation pwv = new PasswordValidation();
        int expected = 3;
        int actual = pwv.passwordValidator("abc123xyz");
        assertEquals(expected, actual);
    }

    @Test
    void passwordValidation_returns_4_for_very_strong_password() {
        PasswordValidation pwv = new PasswordValidation();
        int expected = 4;
        int actual = pwv.passwordValidator("1337h@xor");
        assertEquals(expected, actual);
    }
}