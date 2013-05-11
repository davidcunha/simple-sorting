/**
 * Simple Sorting - An array implementation
 */
package pt.davidcunha.simplesorting;

/**
 *
 * @author David Cunha <davidgoncalvescunha AT gmail DOT com>
 */
public class Array {

    private int nElemns;
    private long[] arr;

    public Array(int max) {
        arr = new long[max];
        nElemns = 0;
    }

    public void insert(long n) {
        arr[nElemns] = n;
        nElemns++;
    }

    public void display() {
        for (int i = 0; i < nElemns; i++) {
            System.out.println(arr[i] + "\n");
        }
    }
}
