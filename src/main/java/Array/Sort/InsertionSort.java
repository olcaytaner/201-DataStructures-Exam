package Array.Sort;

import List.LinkedList;

public class InsertionSort implements Sort{

    @Override
    public void sort(int[] A) {
        for (int j = 1; j < A.length; j++){
            int t = A[j];
            int i = j - 1;
            while (i >= 0 && A[i] > t){
                A[i + 1] = A[i];
                i--;
            }
            A[i + 1] = t;
        }
    }

    /**
     * Modify the original insertion sort so that it will use the same algorithm but sorts the elements in the linked
     * list $l$. You can only use getPrevious method as an external method except getters and setters.
     */
    public void insertionSort(LinkedList l){

    }

    /**
     * Given an array of $N$ numbers write a function that determines the maximum length of the sorted sublist in the
     * array. A sublist start from index i and continues with indexes i+1, i+2, \ldots, i+k. Your function should run
     * in ${\mathcal O}(N)$ time.
     */
    public int maxSortLength(int[] A){
        return 0;
    }

    /**
     * Modify the original insertion sort such that uses B as a secondary key. If two elements in A are equal, algorithm
     * uses B as a secondary key. Modify array B also. N is the number of elements in the array. Your modified method
     * should run in ${\cal O}(N^2)$ time.
     */
    public void sort2(int[] A, int[] B){
    }

}
