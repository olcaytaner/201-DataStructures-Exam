package Array.Sort;

import List.LinkedList;

public class SelectionSort implements Sort{
    @Override
    public void sort(int[] A) {
        for (int i = 0; i < A.length - 1; i++){
            int min = A[i];
            int pos = i;
            for (int j = i + 1; j < A.length; j++){
                if (A[j]< min){
                    min = A[j];
                    pos = j;
                }
            }
            if (pos != i){
                A[pos] = A[i];
                A[i] = min;
            }
        }
    }

    /**
     * Modify the original selection sort so that it will use the same algorithm but sorts the elements in the linked
     * list l. Write your method in SelectionSort class. You should swap the data not the links using setData method.
     */
    public void selectionSort(LinkedList l){
    }

    /**
     * Modify the original selection sort so that (i) it will return the original indexes of the elements as an array
     * and (ii) uses B as a secondary key when keys in A are equal. If original list is 20, 10, 40, 30; after sorting A
     * will be 10, 20, 30, 40, and it will return index array as 1, 0, 3, 2 (10 was at 1., 20 was at 0., 30 was at 3.,
     * 40 was at 2. position in the beginning).
     */
    public int[] sortNew(int[] A, int[] B){
        return null;
    }
}
