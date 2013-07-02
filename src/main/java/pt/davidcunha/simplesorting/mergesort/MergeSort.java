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
       
    public static void run(long[] A, long[] B) {
        ArrayImpl C = new ArrayImpl(A.length + B.length);       
    }
 
    public static void main(String args[]){
        long[] a = {1,2,3};
        long[] b = {1,2,3,4};
        
        MergeSort.run(a, b);
    }
}
