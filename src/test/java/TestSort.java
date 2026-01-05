import Array.Sort.*;
import List.LinkedList;
import org.junit.Test;
import java.util.Arrays;

import static org.junit.Assert.*;

public class TestSort {

    @Test
    public void testBubbleSort2(){
        BubbleSort bubble = new BubbleSort();
        int[] A = {5, 1, 3, 2};
        int[] B = {9, 9, 9, 9};
        int[] C = {7, 7, 7, 7};

        int[] B0 = Arrays.copyOf(B, B.length);
        int[] C0 = Arrays.copyOf(C, C.length);
        bubble.sort2(A, B, C);

        assertArrayEquals(new int[]{1, 2, 3, 5}, A);
        assertArrayEquals(B0, B);
        assertArrayEquals(C0, C);
    }

    @Test
    public void testConvertDecreasingOrder(){
        BucketSort bucket = new BucketSort(100);
        int[] A = new int[]{1, 2, 3, 3, 4, 5, 5, 7};
        int[] expected = new int[]{7, 5, 5, 4, 3, 3, 2, 1};
        bucket.convertDecreasingOrder(A);
        assertArrayEquals(expected, A);

        int[] B = new int[]{7, 6, 5, 4, 3, 2, 1};
        int[] expected2 = new int[]{7, 6, 5, 4, 3, 2, 1};
        bucket.convertDecreasingOrder(B);
        assertArrayEquals(expected2, B);
    }

    @Test
    public void testMode(){
        BucketSort bucket = new BucketSort(100);
        int[] A = new int[]{1, 2, 3, 3, 3, 5, 5, 7};
        assertEquals(3, bucket.mode(A));

        int[] B = new int[]{1, 2, 3, 3, 4, 2, 5, 2};
        assertEquals(2, bucket.mode(B));
    }

    @Test
    public void testSortFirstDigit(){
        BucketSort bucket = new BucketSort(100);
        int[] A = new int[]{301, 202, 404, 105, 780, 655, 551, 802};
        int[] expected = new int[]{105, 202, 301, 404, 551, 655, 780, 802};
        bucket.sortFirstDigit(A);
        assertArrayEquals(expected, A);

        int[] B = new int[]{7, 6, 5, 4, 3, 2, 1};
        int[] expected2 = new int[]{1, 2, 3, 4, 5, 6, 7};
        bucket.sortFirstDigit(B);
        assertArrayEquals(expected2, B);
    }

    @Test
    public void testSortLinkedList(){
        BucketSort bucket = new BucketSort(100);
        LinkedList list = new LinkedList();
        list.insertArray(new int[]{4, 6, 5, 7, 1, 2, 3});
        bucket.sortLinkedList(list);
        LinkedList expected = new LinkedList();
        expected.insertArray(new int[]{1, 2, 3, 4, 5, 6, 7});
        assertEquals(expected.toString(), list.toString());

        LinkedList list2 = new LinkedList();
        list2.insertArray(new int[]{1, 2, 3, 4, 6, 7, 8});
        bucket.sortLinkedList(list2);
        LinkedList expected2 = new LinkedList();
        expected2.insertArray(new int[]{1, 2, 3, 4, 6, 7, 8});
        assertEquals(expected2.toString(), list2.toString());
    }

    @Test
    public void testTopThreeFrequent(){
        BucketSort bucket = new BucketSort(100);
        int[] A = new int[]{1, 2, 3, 3, 3, 3, 4, 4, 4, 5, 5, 7};
        int[] output = bucket.topThreeFrequent(A);
        int[] expected = new int[]{3,4,5};
        assertArrayEquals(expected, output);

        A = new int[]{1, 2, 5, 5, 7, 7, 7, 8, 8, 8, 8};
        output = bucket.topThreeFrequent(A);
        expected = new int[]{8,7,5};
        assertArrayEquals(expected, output);
    }

    @Test
    public void testTopTwoFrequent(){
        BucketSort bucket = new BucketSort(100);
        int[] A = new int[]{1, 2, 3, 3, 3, 3, 4, 4, 4, 5, 5, 7};
        int[] output = bucket.topTwoFrequent(A);
        int[] expected = new int[]{3,4};
        assertArrayEquals(expected, output);

        A = new int[]{1, 2, 5, 5, 7, 7, 7, 8, 8, 8, 8};
        output = bucket.topTwoFrequent(A);
        expected = new int[]{8,7};
        assertArrayEquals(expected, output);
    }

    @Test
    public void testInsertionSort(){
        LinkedList list = new LinkedList();
        list.insertArray(new int[]{4, 6, 5, 7, 1, 2, 3});
        InsertionSort insert = new InsertionSort();
        insert.insertionSort(list);
        LinkedList expected = new LinkedList();
        expected.insertArray(new int[]{1, 2, 3, 4, 6, 5, 7});
        assertEquals(expected.toString(), list.toString());

        list = new LinkedList();
        list.insertArray(new int[]{7, 6, 5, 4, 3, 2, 1});
        insert.insertionSort(list);
        expected = new LinkedList();
        expected.insertArray(new int[]{1, 2, 3, 4, 6, 5, 7});
        assertEquals(expected.toString(), list.toString());
    }

    @Test
    public void testMaxSortLength(){
        int[] A = new int[]{1, 2, 3, 4, 5, 6, 7};
        InsertionSort insert = new InsertionSort();
        assertEquals(7, insert.maxSortLength(A));

        int[] B = new int[]{1, 2, 3, 7, 6, 9, 10, 11};
        assertEquals(4, insert.maxSortLength(B));
    }

    @Test
    public void testInsertionSort2(){
        InsertionSort insert = new InsertionSort();
        int[] A = {5, 1, 3, 2};
        int[] B = {9, 9, 9, 9};

        int[] B0 = Arrays.copyOf(B, B.length);
        insert.sort2(A, B);

        assertArrayEquals(new int[]{1, 2, 3, 5}, A);
        assertArrayEquals(B0, B);
    }

    @Test
    public void testInAorBorC() {
        MergeSort ms = new MergeSort();

        int[] A = {-5, -3, -3, 0};
        int[] B = {-4, -3, -1, 0};
        int[] C = {-5, -2, -1, 0};
        // union = {-5,-4,-3,-2,-1,0} => 6
        assertEquals(6, ms.inAorBorC(A, B, C));

        int[] A2 = {1, 1, 2, 9};
        int[] B2 = {1, 2, 2, 9};
        int[] C2 = {2, 2, 2, 9};
        // union = {1,2,9} => 3
        assertEquals(3, ms.inAorBorC(A2, B2, C2));

        int[] A3 = {7};
        int[] B3 = {7};
        int[] C3 = {7};
        assertEquals(1, ms.inAorBorC(A3, B3, C3));
    }

    @Test
    public void testIsIntersection() {
        MergeSort ms = new MergeSort();

        int[] A = {1, 3, 5};
        int[] B = {2, 4, 6};
        int[] C = {};
        assertTrue(ms.isIntersection(A, B, C));

        int[] A2 = {1, 2, 3};
        int[] B2 = {2, 3};
        int[] C2 = {2}; // missing 3
        assertFalse(ms.isIntersection(A2, B2, C2));

        int[] A3 = {1, 2, 3};
        int[] B3 = {2, 3};
        int[] C3 = {2, 3, 4};
        assertFalse(ms.isIntersection(A3, B3, C3));
    }

    @Test
    public void testIsSubset() {
        MergeSort ms = new MergeSort();

        int[] A = {2, 4};
        int[] B = {1, 2, 3, 4, 5};
        assertTrue(ms.isSubset(A, B));

        int[] A2 = {2, 6};
        int[] B2 = {1, 2, 3, 4, 5};
        assertFalse(ms.isSubset(A2, B2));

        int[] A3 = {};
        int[] B3 = {1, 2, 3};
        assertTrue(ms.isSubset(A3, B3));
    }

    @Test
    public void testIsSuperset() {
        MergeSort ms = new MergeSort();

        int[] A = {1, 2, 4};
        int[] B = {1, 3};
        assertFalse(ms.isSuperSet(A, B));

        int[] A2 = {};
        int[] B2 = {1};
        assertFalse(ms.isSuperSet(A2, B2));
    }

    @Test
    public void testIsSymmetric() {
        MergeSort ms = new MergeSort();

        int[] A = {1, 2, 3};
        int[] B = {4, 5, 6};
        // symmetric difference = all => 6
        assertEquals(6, ms.symmetric(A, B));

        int[] A2 = {};
        int[] B2 = {1, 2, 3};
        assertEquals(3, ms.symmetric(A2, B2));
    }

    @Test
    public void testMinDifference() {
        QuickSort quick = new QuickSort();

        int[] A = {1, 7, 15, 30};
        int[] B = {2, 9};
        // closest: (1,2)=1 or (7,9)=2 or (15,9)=6 ...
        assertEquals(1, quick.minDifference(A, B));

        int[] A2 = {-10, -3, 5};
        int[] B2 = {-6, 2, 11};
        // closest pair: (-3, -6) => 3 OR (5, 2) => 3
        assertEquals(3, quick.minDifference(A2, B2));
    }

    @Test
    public void testOddsBeforeEvens() {
        QuickSort quick = new QuickSort();

        int[] A = {1, 3, 5, 7};
        quick.oddsBeforeEvens(A);
        assertArrayEquals(new int[]{1, 3, 5, 7}, A);

        int[] A2 = {2, 4, 6, 8};
        quick.oddsBeforeEvens(A2);
        assertArrayEquals(new int[]{2, 4, 6, 8}, A2);

        int[] A3 = {7};
        quick.oddsBeforeEvens(A3);
        assertArrayEquals(new int[]{7}, A3);
    }

    @Test
    public void testQuickTriple() {
        QuickSort quick = new QuickSort();

        int[] A = {1, 3, 5, 7};
        quick.quickTriple(A);
        assertArrayEquals(new int[]{3, 1, 7, 5}, A);

        int[] A2 = {2, 4, 6, 8, 9};
        quick.quickTriple(A2);
        assertArrayEquals(new int[]{6, 9, 4, 2, 8}, A2);
    }

    @Test
    public void testThreePartitionArray() {
        QuickSort quick = new QuickSort();

        int[] A = {1, 3, 5, 4, 4, 7};
        quick.threePartitionArray(A, 4);
        assertArrayEquals(new int[]{1, 3, 4, 4, 7}, A);

        int[] A2 = {1, 3, 5, 4, 7};
        quick.threePartitionArray(A2,6);
        assertArrayEquals(new int[]{1, 3, 4, 5, 7}, A2);
    }

    @Test
    public void testSelectionSort(){
        LinkedList list = new LinkedList();
        list.insertArray(new int[]{4, 6, 5, 7, 1, 2, 3});
        SelectionSort select = new SelectionSort();
        select.selectionSort(list);
        LinkedList expected = new LinkedList();
        expected.insertArray(new int[]{1, 2, 3, 4, 6, 5, 7});
        assertEquals(expected.toString(), list.toString());

        list = new LinkedList();
        list.insertArray(new int[]{7, 6, 5, 4, 3, 2, 1});
        select.selectionSort(list);
        expected = new LinkedList();
        expected.insertArray(new int[]{1, 2, 3, 4, 6, 5, 7});
        assertEquals(expected.toString(), list.toString());
    }

    @Test
    public void testSortNew2(){
        SelectionSort select = new SelectionSort();
        int[] A = {20, 10, 40, 30};
        int[] B = {0, 0, 0, 0};

        int[] idx = select.sortNew(A, B);
        assertArrayEquals(new int[]{10, 20, 30, 40}, A);
        assertArrayEquals(new int[]{1, 0, 3, 2}, idx);

        int[] A2 = {5, 2, 5, 2, 5};
        int[] B2 = {9, 7, 1, 3, 5}; // ties on A must be ordered by B

        int[] A2Before = Arrays.copyOf(A2, A2.length);
        int[] idx2 = select.sortNew(A2, B2);
        // verify indices map back to original A values in the new order
        for (int i = 0; i < A2.length; i++) {
            assertEquals(A2Before[idx2[i]], A2[i]);
        }
        // for A==2 group, B should be [3,7]
        // for A==5 group, B should be [1,5,9]
        assertArrayEquals(new int[]{2, 2, 5, 5, 5}, A2);
        assertArrayEquals(new int[]{3, 7, 1, 5, 9}, B2);
    }

    @Test
    public void testSecondLeastFrequent(){
        BucketSort bucket = new BucketSort(100000);
        int[] A = new int[]{1, 1, 1, 2, 2, 2, 3, 3, 3, 4, 4, 7};
        assertEquals(4, bucket.secondLeastFrequent(A));

        int[] B = new int[]{1, 1, 2, 2, 2, 2, 3, 3, 3, 7, 7, 7, 9};
        assertEquals(1, bucket.secondLeastFrequent(B));
    }

    @Test
    public void testMinMaxRepeat(){
        QuickSort quickSort = new QuickSort();
        int[] A = new int[]{1, 8, 7, 3, 4, 5, 9, 2};
        assertArrayEquals(new int[]{1, 9, 2, 8, 3, 7, 4, 5}, quickSort.minMaxRepeat(A));

        int[] B = new int[]{8, 7, 6, 5, 4, 3, 2, 1};
        assertArrayEquals(new int[]{1, 8, 2, 7, 3, 6, 4, 5}, quickSort.minMaxRepeat(B));
    }

}