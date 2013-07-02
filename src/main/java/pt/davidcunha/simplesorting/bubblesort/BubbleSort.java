/**
 * Simple Sorting - Bubble Sort
 */
package pt.davidcunha.simplesorting.bubblesort;

import pt.davidcunha.simplesorting.ArrayImpl;

/**
 *
 * @author David Cunha <davidgoncalvescunha AT gmail DOT pt>
 */
public class BubbleSort {

    private static long[] arr;

    /**
     * Run Bubble Sort algorithm
     *
     * @param array data structure used to run the algorithm
     */
    public static void run(ArrayImpl array) {
        arr = array.getArr();

        for (int i = arr.length - 1; i > 1; i--) {
            for (int j = 0; j < i; j++) {
                if (arr[j] > arr[j + 1]) {
                    swap(j, j + 1);
                }
            }
        }
    }

    /**
     * Swap function
     *
     * @param a number to swap with the second argument
     * @param b number to swap with the first argument
     */
    private static void swap(int a, int b) {
        long temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}
