package pt.davidcunha.simplesorting;

import static org.junit.Assert.*;
import org.junit.Test;

/**
 * Unit test for Array Implementation
 */
public class ArrayTest {

    @Test
    public void binarySearch() {
        ArrayImpl arr = new ArrayImpl(5);
        arr.insert(20);
        arr.insert(30);
        arr.insert(50);
        arr.insert(80);
        arr.insert(120);

        assertEquals(0, arr.binarySearch(20));
        assertEquals(3, arr.binarySearch(80));
    }
}
