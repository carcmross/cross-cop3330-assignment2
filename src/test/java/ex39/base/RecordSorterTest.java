package ex39.base;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class RecordSorterTest {

    @Test
    void sortLastNames_sorts_last_names_correctly() {
        RecordSorter rs = new RecordSorter();
        List<String> expected = Arrays.asList("Alpha", "Beta", "Charles", "Demo");
        List<String> actual = rs.sortLastNames(Arrays.asList("Demo", "Beta", "Alpha", "Charles"));
        assertEquals(expected, actual);
    }
}