package Array.Sort;

public class MergeSort implements Sort{

    private void merge(int[] A, int start, int middle, int end){
        int leftCount = middle - start + 1;
        int rightCount = end - middle;
        int[] leftPart = new int[leftCount + 1];
        int[] rightPart = new int[rightCount + 1];
        for (int i = 0; i < leftCount; i++){
            leftPart[i] = A[start + i];
        }
        for (int i = 0; i < rightCount; i++){
            rightPart[i] = A[middle + i + 1];
        }
        leftPart[leftCount] = Integer.MAX_VALUE;
        rightPart[rightCount] = Integer.MAX_VALUE;
        int i = 0, j = 0;
        for (int k = start; k <= end; k++){
            if (leftPart[i] <= rightPart[j]){
                A[k] = leftPart[i];
                i++;
            } else {
                A[k] = rightPart[j];
                j++;
            }
        }
    }

    private void mergeSort(int[] A, int first, int last){
        if (first < last){
            int pivot = (first + last) / 2;
            mergeSort(A, first, pivot);
            mergeSort(A, pivot + 1, last);
            merge(A, first, pivot, last);
        }
    }

    @Override
    public void sort(int[] A) {
        mergeSort(A, 0, A.length - 1);
    }

    /**
     * Suppose you are given three sorted arrays A, B, and C. Write a function in MergeSort class that returns the
     * number of elements which are in A or B or C. Assume that all arrays have the same size and the last elements of
     * all three arrays are the same.  Your algorithm should run in ${\cal O}(N)$ time.
     */
    public int inAorBorC(int[] A, int[] B, int[]C){
        return 0;
    }

    /**
     * Suppose arrays representing sets A and B are both sorted. Write a method with {\bf linear complexity} in
     * {\bf MergeSort} class that finds if C is the intersection of sets A and B. You are only allowed to use 1 loop.
     */
    public boolean isIntersection(int[] A, int[] B, int[] C){
        return false;
    }

    /**
     * Suppose arrays representing sets A and B are both sorted. Write a linear time method that finds if A is a subset
     * of B.
     */
    public boolean isSubset(int[] A, int[] B){
        return false;
    }

    /**
     * Suppose arrays representing sets A and B are both sorted. Write a method with {\bf linear complexity} in
     * {\bf MergeSort} class that finds if A is a superset of B.
     */
    public boolean isSuperSet(int[] A, int[] B){
        return false;
    }

    /**
     * Suppose you are given two sorted arrays A and B. Write a function that finds elements in A $\triangle$
     * B = (A - B) $\cup$ (B - A) (the elements that are in A but not in B and the elements that are in B but not in A)
     * in  ${\cal O}$($N$) time.
     */
    public int symmetric(int[] A, int[] B){
        return 0;
    }
}
