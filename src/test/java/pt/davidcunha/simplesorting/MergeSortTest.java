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
        int nItems = 6;
        ArrayImpl initArray = new ArrayImpl(nItems);
        initArray.insert(10);
        initArray.insert(20);
        initArray.insert(60);
        initArray.insert(25);
        initArray.insert(40);
        initArray.insert(15);

        long[] workspace = new long[nItems];
        MergeSort mSort = new MergeSort(initArray);
        mSort.run(workspace, 0, nItems - 1);

        assertEquals("[10, 15, 20, 25, 40, 60]", mSort.display());
    }
}
