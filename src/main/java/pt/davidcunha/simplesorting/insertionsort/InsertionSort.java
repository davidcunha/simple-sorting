/**
 * Simple Sorting - Insertion Sort
 */
package pt.davidcunha.simplesorting.insertionsort;

import pt.davidcunha.simplesorting.ArrayImpl;

/**
 *
 * @author David Cunha <davidgoncalvescunha AT gmail DOT pt>
 */
public class InsertionSort {

    private static long[] arr;

    /**
     * Run Insertion Sort algorithm
     *
     * @param array data structure used to run the algorithm
     */
    public static void run(long[] array) {
        arr = array;
        int j;

        for (int i = 1; i < arr.length; i++) {
            long temp = arr[i];
            j = i;
            while (j > 0 && temp <= arr[j - 1]) {
                arr[j] = arr[j - 1];
                j--;
            }
            arr[j] = temp;
        }
    }
}
