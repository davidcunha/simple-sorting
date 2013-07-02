/**
 * Simple Sorting - Merge Sort
 */
package pt.davidcunha.simplesorting.mergesort;

import pt.davidcunha.simplesorting.ArrayImpl;

/**
 *
 * @author David Cunha <davidgoncalvescunha AT gmail DOT pt>
 */
public class MergeSort {

      /**
     * Run Merge Sort algorithm
     *
     * @param A first data structure used to run the algorithm
     * @param B second data structure used to run the algorithm
     * @param C merged data structure
     */
    public static void run(ArrayImpl A, ArrayImpl B, ArrayImpl C) {
        long[] a = A.getArr();
        long[] b = B.getArr();
        int ca = 0, cb = 0;

        while (ca < a.length && cb < b.length) {
            if (a[ca] < b[cb]) {
                C.insert(a[ca++]);
            } else {
                C.insert(b[cb++]);
            }
        }

        //complete merge process if there is more items in A
        while (ca < a.length) {
            C.insert(a[ca++]);
        }

        //complete merge process if there is more items in B
        while (cb < b.length) {
            C.insert(b[cb++]);
        }

    }
}
