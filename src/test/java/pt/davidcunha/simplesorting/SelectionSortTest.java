package pt.davidcunha.simplesorting;

import static org.junit.Assert.*;
import org.junit.Test;
import pt.davidcunha.simplesorting.selectionsort.SelectionSort;

/**
 * Unit test for Selection Sort
 */
public class SelectionSortTest {

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
    public void selectionSort() {
        ArrayImpl arr = new ArrayImpl(5);
        arr.insert(50);
        arr.insert(120);
        arr.insert(20);
        arr.insert(80);
        arr.insert(30);
        
        SelectionSort.run(arr.getArr());

        assertEquals("20\n30\n50\n80\n120\n", arr.display());
    }
}
