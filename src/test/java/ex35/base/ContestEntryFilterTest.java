package ex35.base;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright Marc-Anthony Cross
 */

class ContestEntryFilterTest {

    @Test
    void isBlankEntry_returns_false_for_nonblank_entry() {
        ContestEntryFilter cef = new ContestEntryFilter();
        boolean expected = false;
        boolean actual = cef.isBlankEntry("Toriel");
        assertEquals(expected, actual);
    }

    @Test
    void isBlankEntry_returns_true_for_blank_entry() {
        ContestEntryFilter cef = new ContestEntryFilter();
        boolean expected = true;
        boolean actual = cef.isBlankEntry("");
        assertEquals(expected, actual);
    }
}