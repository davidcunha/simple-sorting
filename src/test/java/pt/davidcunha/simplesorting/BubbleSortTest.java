package pt.davidcunha.simplesorting;

import static org.junit.Assert.*;
import org.junit.Test;
import pt.davidcunha.simplesorting.bubblesort.BubbleSort;

/**
 * Unit test for Bubble Sort
 */
public class BubbleSortTest {

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
    public void bubbleSort() {
        ArrayImpl arr = new ArrayImpl(5);
        arr.insert(50);
        arr.insert(120);
        arr.insert(20);
        arr.insert(80);
        arr.insert(30);
        
        BubbleSort.run(arr.getArr());

        assertEquals("20\n30\n50\n80\n120\n", arr.display());
    }
}
