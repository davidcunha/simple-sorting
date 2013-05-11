/**
 * Simple Sorting - Selection Sort
 */
package pt.davidcunha.simplesorting.selectionsort;

/**
 *
 * @author David Cunha <davidgoncalvescunha AT gmail DOT pt>
 */
public class SelectionSort {

    private static long[] arr;

    /**
     * Run Selection Sort algorithm
     *
     * @param array data structure used to run the algorithm
     */
    public static void run(long[] array) {
        arr = array;

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    swap(i, j);
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
