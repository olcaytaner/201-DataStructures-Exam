package Array.Sort;

import List.LinkedList;

public class BucketSort implements Sort{

    private int maxValue;

    public BucketSort(int maxValue){
        this.maxValue = maxValue;
    }

    @Override
    public void sort(int[] A) {
        int[] C = new int[maxValue];
        int[] B = new int[A.length];
        for (int i = 0; i < A.length; i++){
            C[A[i]]++;
        }
        for (int i = 1; i < maxValue; i++){
            C[i] += C[i - 1];
        }
        for (int i = A.length - 1; i >= 0; i--){
            B[C[A[i]] - 1] = A[i];
            C[A[i]]--;
        }
        for (int i = 0; i < A.length; i++){
            A[i] = B[i];
        }
    }

    /**
     * Suppose you are given an array of N integers sorted in increasing order. Write a linear time method to convert
     * this array sorted in decreasing order.
     */
    public void convertDecreasingOrder(int[] A){

    }

    /**
     * Given an array of N numbers write a function that determines the mode of the array, i.e. the most frequent number.
     * Your function should run in ${\cal O}(N \log N)$ time. You can modify input array A. You can use sort functions
     * in the exam library.
     */
    public int mode(int[] A){
        return 0;
    }

    /**
     * Write a function that sorts an array of N elements with respect to their first digits. The time complexity of
     * your function should be ${\mathcal O}(N)$.
     */
    public void sortFirstDigit(int[] A){
    }

    /**
     * Write a method which returns the sorted form of the linked list (as a new linked list), which contains only
     * numbers 1, 2, and 3. Your algorithm should run in linear time $\cal O$($N$).
     */
    public LinkedList sortLinkedList(LinkedList list){
        return null;
    }

    /**
     * Given an array A of N integers, write a function Your function should display the three most frequent elements in
     * the given array A, which is already sorted. Your function must run in ${\cal O}(N)$ time. You should not modify
     * the input array A.
     */
    public int[] topThreeFrequent(int[] A){
        return null;
    }

    /**
     * Given an array A of N integers, write a function Your function should display the two most frequent elements in
     * the given array A, which is already sorted. Your function must run in O(N) time. You can not modify the input
     * array A.
     */
    public int[] topTwoFrequent(int[] A){
        return null;
    }

    /**
     *  Given an array A of N integers, write a function in BucketSort class which returns the second least frequent element in the
     *  given array A, which is already sorted. Your function must run in O(N) time.
     *  You can not modify the input array A. You may use up to 1 external array.
     */
    public int secondLeastFrequent(int[] A) { return 0; }

}
