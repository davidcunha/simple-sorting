/**
 * Simple Sorting - Bubble Sort
 */
package pt.davidcunha.simplesorting.bubblesort;

/**
 *
 * @author David Cunha <david-g-cunha AT ptinovacao DOT pt>
 */
public class BubbleSort {

    private long[] arr;

    public void bubbleSort(long[] arr) {
        this.arr = arr;

        for (int i = arr.length - 1; i > 1; i--) {
            for (int j = 0; j < i; j++) {
                if (arr[j] > arr[j + 1]) {
                    swap(j, j + 1);
                }
            }
        }
    }

    public void swap(int a, int b) {
        long temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}
