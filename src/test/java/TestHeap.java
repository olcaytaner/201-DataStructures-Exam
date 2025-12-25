import Array.Heap.*;
import org.junit.Assert;
import org.junit.Test;

public class TestHeap {

    @Test
    public void testDescendants() {
        MaxDHeap heap = new MaxDHeap(10, 3);
        heap.insertArray(new int[]{1, 2, 3, 4, 5, 6, 7, 8});
        Assert.assertEquals(7, heap.descendants(0));
        Assert.assertEquals(3, heap.descendants(1));
        Assert.assertEquals(1, heap.descendants(2));
        heap = new MaxDHeap(10, 2);
        heap.insertArray(new int[]{1, 2, 3, 4, 5, 6, 7, 8});
        Assert.assertEquals(7, heap.descendants(0));
        Assert.assertEquals(3, heap.descendants(1));
        Assert.assertEquals(2, heap.descendants(2));
    }

    @Test
    public void testDescendantsLevel() {
        MaxDHeap heap = new MaxDHeap(10, 2);
        heap.insertArray(new int[]{1, 2, 3, 4, 5, 6, 7, 8});
        System.out.println(heap.toString());
        Assert.assertEquals(2, heap.descendantsLevel(0, 1));
        Assert.assertEquals(4, heap.descendantsLevel(0, 2));
        Assert.assertEquals(1, heap.descendantsLevel(0, 3));
        Assert.assertEquals(2, heap.descendantsLevel(1, 1));
        Assert.assertEquals(2, heap.descendantsLevel(2, 1));
        heap = new MaxDHeap(10, 3);
        heap.insertArray(new int[]{1, 2, 3, 4, 5, 6, 7, 8});
        System.out.println(heap.toString());
        Assert.assertEquals(3, heap.descendantsLevel(0, 1));
        Assert.assertEquals(4, heap.descendantsLevel(0, 2));
        Assert.assertEquals(3, heap.descendantsLevel(1, 1));
        Assert.assertEquals(1, heap.descendantsLevel(2, 1));
    }

    @Test
    public void testDescendantsArray() {
        MaxDHeap heap = new MaxDHeap(10, 2);
        heap.insertArray(new int[]{1, 2, 3, 4, 5, 6, 7, 8});
        Assert.assertArrayEquals(new int[]{7, 6, 4, 3, 2, 5, 1}, heap.descendantsArray(0));
        Assert.assertArrayEquals(new int[]{4, 3, 1}, heap.descendantsArray(1));
        Assert.assertArrayEquals(new int[]{2, 5}, heap.descendantsArray(2));
        heap = new MaxDHeap(10, 3);
        heap.insertArray(new int[]{1, 2, 3, 4, 5, 6, 7, 8});
        Assert.assertArrayEquals(new int[]{6, 7, 3, 1, 4, 5, 2}, heap.descendantsArray(0));
        Assert.assertArrayEquals(new int[]{1, 4, 5}, heap.descendantsArray(1));
        Assert.assertArrayEquals(new int[]{2}, heap.descendantsArray(2));
    }

    @Test
    public void testHowManyPairCanBeSwapped() {
        MaxDHeap heap = new MaxDHeap(6, 2);
        heap.insertArray(new int[]{1, 2, 3, 4, 5, 6});
        Assert.assertEquals(5, heap.howManyPairCanBeSwapped());
        heap = new MaxDHeap(5, 2);
        heap.insertArray(new int[]{1, 2, 3});
        Assert.assertEquals(1, heap.howManyPairCanBeSwapped());
        heap = new MaxDHeap(5, 2);
        heap.insertArray(new int[]{1, 2, 3, 4, 5});
        Assert.assertEquals(3, heap.howManyPairCanBeSwapped());
        heap = new MaxDHeap(5, 2);
        heap.insertArray(new int[]{1, 2, 3, 4});
        Assert.assertEquals(2, heap.howManyPairCanBeSwapped());
    }

    @Test
    public void testThirdMaxDHeap() {
        MaxDHeap heap = new MaxDHeap(10, 3);
        heap.insertArray(new int[]{1, 2, 3, 4, 5, 6, 7, 8});
        Assert.assertEquals(6, heap.third());
        heap = new MaxDHeap(10, 2);
        heap.insertArray(new int[]{1, 2, 3, 4, 5, 6, 7, 8});
        Assert.assertEquals(6, heap.third());
        heap = new MaxDHeap(6, 2);
        heap.insertArray(new int[]{1, 2, 3, 4, 5, 6});
        Assert.assertEquals(4, heap.third());
    }

    @Test
    public void testThirdMaxHeap() {
        MaxHeap heap = new MaxHeap(10);
        heap.insertArray(new int[]{1, 2, 3, 4, 5, 6, 7, 8});
        Assert.assertEquals(6, heap.third());
        heap = new MaxHeap(10);
        heap.insertArray(new int[]{1, 2, 3, 4, 5, 6, 7});
        Assert.assertEquals(5, heap.third());
        heap = new MaxHeap(10);
        heap.insertArray(new int[]{1, 2, 3, 4, 5, 6});
        Assert.assertEquals(4, heap.third());
    }

    @Test
    public void testAscendantsMaxHeap() {
        MaxHeap heap = new MaxHeap(20);
        heap.insertArray(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16});
        Assert.assertArrayEquals(new int[]{}, heap.ascendants(0));
        Assert.assertArrayEquals(new int[]{0}, heap.ascendants(1));
        Assert.assertArrayEquals(new int[]{0, 1}, heap.ascendants(3));
        Assert.assertArrayEquals(new int[]{0, 1, 3}, heap.ascendants(7));
        Assert.assertArrayEquals(new int[]{0, 1, 3, 7}, heap.ascendants(15));
    }

    @Test
    public void testHeapOrder() {
        MaxHeap heap = new MaxHeap(10);
        heap.insertArray(new int[]{1, 2, 3, 4, 5, 6, 7, 8});
        Assert.assertTrue(heap.heapOrder(0));
        heap = new MaxHeap(10);
        heap.insertArray(new int[]{1, 2, 3, 4, 5, 6, 7});
        Assert.assertTrue(heap.heapOrder(0));
        heap = new MaxHeap(10);
        heap.insertArray(new int[]{1, 2, 3, 4, 5, 6});
        Assert.assertTrue(heap.heapOrder(0));
    }

    @Test
    public void testShortestDistanceBetweenNodes() {
        MaxHeap heap = new MaxHeap(10);
        heap.insertArray(new int[]{1, 2, 3, 4, 5, 6, 7, 8});
        Assert.assertEquals(2, heap.shortestDistanceBetWeenNodes(1, 2));
        Assert.assertEquals(1, heap.shortestDistanceBetWeenNodes(0, 1));
        Assert.assertEquals(3, heap.shortestDistanceBetWeenNodes(2, 3));
        Assert.assertEquals(4, heap.shortestDistanceBetWeenNodes(3, 6));
    }

    @Test
    public void testAscendantsMinDHeap() {
        MinDHeap heap = new MinDHeap(20, 2);
        heap.insertArray(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16});
        Assert.assertArrayEquals(new int[]{}, heap.ascendants(0));
        Assert.assertArrayEquals(new int[]{0}, heap.ascendants(1));
        Assert.assertArrayEquals(new int[]{0, 1}, heap.ascendants(3));
        Assert.assertArrayEquals(new int[]{0, 1, 3}, heap.ascendants(7));
        Assert.assertArrayEquals(new int[]{0, 1, 3, 7}, heap.ascendants(15));
    }

    @Test
    public void testNumberOfPlacesToReplace() {
        MinDHeap heap = new MinDHeap(10, 2);
        heap.insertArray(new int[]{1, 2, 3, 4, 5, 6, 7, 8});
        Assert.assertEquals(1, heap.numberOfPlacesToReplace(0));
        Assert.assertEquals(4, heap.numberOfPlacesToReplace(9));
        heap = new MinDHeap(10, 2);
        heap.insertArray(new int[]{1, 2, 3, 4, 5, 6, 7});
        Assert.assertEquals(1, heap.numberOfPlacesToReplace(0));
        Assert.assertEquals(4, heap.numberOfPlacesToReplace(8));
    }

    @Test
    public void testSumOfMaxChange() {
        MinDHeap heap = new MinDHeap(10, 2);
        heap.insertArray(new int[]{1, 2, 3, 4, 5, 6, 7, 8});
        Assert.assertEquals(26, heap.sumOfMaxChange(0, 6));
        Assert.assertEquals(38, heap.sumOfMaxChange(2, 9));
        heap = new MinDHeap(10, 2);
        heap.insertArray(new int[]{1, 2, 3, 4, 5, 6, 7});
        Assert.assertEquals(14, heap.sumOfMaxChange(0, 4));
        Assert.assertEquals(24, heap.sumOfMaxChange(4, 7));
    }

    @Test
    public void testHowManyChildrenCanBeSwapped() {
        MinHeap heap = new MinHeap(10);
        heap.insertArray(new int[]{1, 2, 3, 4, 5, 6, 7, 8});
        Assert.assertEquals(3, heap.howManyChildrenCanBeSwapped());
        heap = new MinHeap(10);
        heap.insertArray(new int[]{1, 2, 3, 4, 5, 6, 7});
        Assert.assertEquals(3, heap.howManyChildrenCanBeSwapped());
        heap = new MinHeap(10);
        heap.insertArray(new int[]{1, 2, 3, 4, 5, 6});
        Assert.assertEquals(2, heap.howManyChildrenCanBeSwapped());
        heap = new MinHeap(10);
        heap.insertArray(new int[]{1, 2, 3, 4, 5});
        Assert.assertEquals(2, heap.howManyChildrenCanBeSwapped());
    }

    @Test
    public void testIsLargestLeftMost() {
        MinHeap heap = new MinHeap(10);
        heap.insertArray(new int[]{1, 2, 3, 4, 5, 6, 7, 8});
        Assert.assertTrue(heap.isLargestLeftMost());
        heap = new MinHeap(10);
        heap.insertArray(new int[]{1, 2, 3, 4, 5, 6, 7});
        Assert.assertFalse(heap.isLargestLeftMost());
        heap = new MinHeap(10);
        heap.insertArray(new int[]{1, 2, 3, 6, 5, 4});
        Assert.assertTrue(heap.isLargestLeftMost());
        heap = new MinHeap(10);
        heap.insertArray(new int[]{1, 2, 3, 4, 5});
        Assert.assertFalse(heap.isLargestLeftMost());
    }

    @Test
    public void testKthMaximum() {
        Assert.assertEquals(6, MinHeap.kthMaximum(new int[]{1, 2, 3, 4, 5, 6}, 1));
        Assert.assertEquals(4, MinHeap.kthMaximum(new int[]{1, 2, 3, 4, 5, 6}, 3));
        Assert.assertEquals(8, MinHeap.kthMaximum(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9}, 2));
        Assert.assertEquals(5, MinHeap.kthMaximum(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9}, 5));
    }

    @Test
    public void testSecondMinimum() {
        MaxDHeap heap = new MaxDHeap(10, 3);
        heap.insertArray(new int[]{1, 2, 3, 4, 5, 6, 7, 8});
        Assert.assertEquals(2, heap.secondMinimum());
        heap = new MaxDHeap(15, 2);
        heap.insertArray(new int[]{1, 2, 3, 4, 5, 6, 7, 8,0,10});
        Assert.assertEquals(1, heap.secondMinimum());
        heap = new MaxDHeap(20, 4);
        heap.insertArray(new int[]{-2, 2, 3, 4, 5, 6, 7, 8,9,10,11,12,0,-1});
        Assert.assertEquals(-1, heap.secondMinimum());
    }

    @Test
    public void testAveragePercolateUp() {
        MinHeap heap = new MinHeap(10);
        heap.insertArray(new int[]{1, 3, 5, 7, 8, 10, 12});
        int[] items = new int[]{2, 4, 15};
        Assert.assertEquals(1, heap.averagePercolateUp(items), 0.0001);
        heap = new MinHeap(10);
        heap.insertArray(new int[]{1, 3, 4, 5, 6, 7, 8});
        int[] items2 = new int[]{9, 10, 2};
        Assert.assertEquals(0.6666, heap.averagePercolateUp(items2), 0.0001);
        heap = new MinHeap(10);
        heap.insertArray(new int[]{1, 2, 3, 4, 5, 6, 7, 8});
        int[] items3 = new int[]{1, 3, 5};
        Assert.assertEquals(1.33333, heap.averagePercolateUp(items3), 0.0001);
    }

}
