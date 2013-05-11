package pt.davidcunha.simplesorting;

import org.junit.Test;
import static org.junit.Assert.*;
import pt.davidcunha.simplesorting.bubblesort.BubbleSort;

/**
 * Unit test for BubbleSortTest
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
        long[] a = arr.getArr();
        
        BubbleSort.run(a);

        assertEquals("20\n30\n50\n80\n120\n", arr.display());
    }
}
