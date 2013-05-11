/**
 * Simple Sorting - An array implementation
 */
package pt.davidcunha.simplesorting;

/**
 *
 * @author David Cunha <davidgoncalvescunha AT gmail DOT pt>
 */
public class ArrayImpl {

    private int nElemns;
    private long[] arr;

    /**
     * ArrayImpl getter
     *
     */
    public long[] getArr() {
        return arr;
    }

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
     */
    public String display() {
        String result = "";
        for (int i = 0; i < nElemns; i++) {
            result += arr[i] + "\n";
        }
        return result;
    }
}
