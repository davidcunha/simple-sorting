package pt.davidcunha.simplesorting;

import static org.junit.Assert.*;
import org.junit.Test;
import pt.davidcunha.simplesorting.insertionsort.InsertionSort;

/**
 * Unit test for Insertion Sort
 */
public class InsertionSortTest {

    @Test
    public void setup() {
        ArrayImpl arr = new ArrayImpl(5);
        arr.insert(50);
        arr.insert(120);
        arr.insert(20);
        arr.insert(80);
        arr.insert(30);

        assertEquals("50\n120\n20\n80\n30\n", arr.display());
    }

    @Test
    public void insertionSort() {
        ArrayImpl arr = new ArrayImpl(5);
        arr.insert(50);
        arr.insert(120);
        arr.insert(20);
        arr.insert(80);
        arr.insert(30);
        long[] a = arr.getArr();

        InsertionSort.run(a);

        assertEquals("20\n30\n50\n80\n120\n", arr.display());
    }
}
