/**
 * Simple Sorting - An array implementation
 */
package pt.davidcunha.simplesorting;

import java.util.Arrays;

/**
 *
 * @author David Cunha <davidgoncalvescunha AT gmail DOT pt>
 */
public class ArrayImpl {

    private int nElemns;
    private long[] arr;

    /**
     * ArrayImpl public constructor
     *
     * @param max array initialization
     */
    public ArrayImpl(int max) {
        arr = new long[max];
        nElemns = 0;
    }

    /**
     * ArrayImpl getter
     *
     * @return array
     */
    public long[] getArr() {
        return arr;
    }

    /**
     * Insert function
     *
     * @param n number to insert in the array
     */
    public void insert(long n) {
        arr[nElemns] = n;
        nElemns++;
    }

    /**
     * Display function
     *
     * @return string with all elements
     */
    public String display() {
        return Arrays.toString(arr);
    }

    /**
     * ArrayImpl binary search
     *
     * @param n element to be searched
     * @return element
     */
    public int binarySearch(long n) {
        int lb = 0;
        int ub = arr.length - 1;
        int mid;

        while (true) {
            mid = (lb + ub) / 2;
            if (arr[mid] == n) {
                return mid;
            } else if (lb > ub) {
                return arr.length;
            } else {
                if (n > arr[mid]) {
                    lb = mid + 1;
                } else {
                    ub = mid - 1;
                }
            }
        }
    }
}
