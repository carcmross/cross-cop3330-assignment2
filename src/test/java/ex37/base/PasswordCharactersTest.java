package ex37.base;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright Marc-Anthony Cross
 */

class PasswordCharactersTest {

    @Test
    void isNum_returns_true_for_number() {
        PasswordCharacters pc = new PasswordCharacters();
        boolean expected = true;
        boolean actual = pc.isNum('5', Arrays.asList('0', '1', '2', '3', '4', '5', '6', '7','8', '9'));
        assertEquals(expected, actual);
    }

    @Test
    void isNum_returns_false_for_nonnumber() {
        PasswordCharacters pc = new PasswordCharacters();
        boolean expected = false;
        boolean actual = pc.isNum('a', Arrays.asList('0', '1', '2', '3', '4', '5', '6', '7','8', '9'));
        assertEquals(expected, actual);
    }

    @Test
    void isSpecial_returns_true_if_special_char() {
        PasswordCharacters pc = new PasswordCharacters();
        List<Character> sp_chars = Arrays.asList('%', '@', '#', '$', '+', '*', '&', '!', '(', '-', '\'', ')', '_', '/',
                '\\','[', ']', '{', '}', '.', ',', '?', ':', '`', '~');
        boolean expected = true;
        boolean actual = pc.isSpecial('@', sp_chars);
        assertEquals(expected, actual);
    }

    @Test
    void isSpecial_returns_false_if_not_special_char() {
        PasswordCharacters pc = new PasswordCharacters();
        List<Character> sp_chars = Arrays.asList('%', '@', '#', '$', '+', '*', '&', '!', '(', '-', '\'', ')', '_', '/',
                '\\','[', ']', '{', '}', '.', ',', '?', ':', '`', '~');
        boolean expected = false;
        boolean actual = pc.isSpecial('b', sp_chars);
        assertEquals(expected, actual);
    }
}