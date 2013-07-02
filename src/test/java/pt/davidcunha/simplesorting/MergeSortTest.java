
package pt.davidcunha.simplesorting;

import static org.junit.Assert.*;
import org.junit.Test;
import pt.davidcunha.simplesorting.mergesort.MergeSort;

/**
 * Unit test for Merge Sort
 */
public class MergeSortTest {
    
    @Test
    public void mergeSort() {
                ArrayImpl A = new ArrayImpl(3);
        A.insert(10);
        A.insert(20);
        A.insert(40);

        ArrayImpl B = new ArrayImpl(3);
        B.insert(5);
        B.insert(15);
        B.insert(25);

        ArrayImpl C = new ArrayImpl(A.getArr().length + B.getArr().length);
        MergeSort.run(A, B, C);
        
        assertEquals("5\n10\n15\n20\n25\n40\n", C.display());
    }
    
}
