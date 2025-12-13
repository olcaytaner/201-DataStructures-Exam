package Array.Sort;

public class BubbleSort implements Sort{

    @Override
    public void sort(int[] A) {
        boolean exchanged = true;
        while (exchanged){
            exchanged = false;
            for (int i = 0; i < A.length - 1; i++){
                if (A[i] > A[i + 1]){
                    exchanged = true;
                    int tmp = A[i];
                    A[i] = A[i + 1];
                    A[i + 1] = tmp;
                }
            }
        }
    }

    /**
     * Modify the original bubble sort such that uses B as a secondary and C as a ternary key. If two elements in A are
     * equal, algorithm uses B as a secondary key. If also their keys in B are equal, the algorithm will then resort to
     * C array. Do not modify arrays B and C. N is the number of elements in the array. Your modified method should run
     * in ${\cal O}(N^2)$ time.
     */
    public void sort2(int[] A, int[] B, int[] C){
    }

}
