package ex24.base;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright Marc-Anthony Cross
 */

class AnagramDetectorTest {
    @Test
    void isAnagram_returns_false_if_letters_are_different() {
        AnagramDetector ad = new AnagramDetector();
        boolean expected = false;
        boolean actual = ad.isAnagram("bruh", "epic");
        assertEquals(expected, actual);
    }

    @Test
    void isAnagram_returns_false_if_number_of_characters_is_different() {
        AnagramDetector ad = new AnagramDetector();
        boolean expected = false;
        boolean actual = ad.isAnagram("supercalifragilisticexpialidocious", "wow");
        assertEquals(expected, actual);
    }

    @Test
    void isAnagram_returns_true_if_anagram_conditions_are_satisfied() {
        AnagramDetector ad = new AnagramDetector();
        boolean expected = true;
        boolean actual = ad.isAnagram("racecar", "carrace");
        assertEquals(expected, actual);
    }
}