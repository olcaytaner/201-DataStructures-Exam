import org.junit.Test;

import static org.junit.Assert.*;

public class TestFirstWeek {

    @Test
    public void testIsPrime(){
        assertTrue(FirstWeek.isPrime(2));
        assertFalse(FirstWeek.isPrime(4));
        assertTrue(FirstWeek.isPrime(5));
        assertFalse(FirstWeek.isPrime(9));
    }

    @Test
    public void testIsInArray(){
        assertFalse(FirstWeek.isInArray(2, new int[]{4, 3, 1}));
        assertTrue(FirstWeek.isInArray(2, new int[]{4, 3, 1, 2}));
    }

    @Test
    public void testDeleteKth(){
        int[] a = new int[]{1, 2, 3, 4, 5};
        FirstWeek.deleteKth(a, 2);
        assertArrayEquals(new int[]{1, 2, 4, 5, 5}, a);
        int[] b = new int[]{1, 2, 3, 4, 5};
        FirstWeek.deleteKth(b, 0);
        assertArrayEquals(new int[]{2, 3, 4, 5, 5}, b);
    }

    @Test
    public void testInsertKth(){
        int[] a = new int[]{1, 2, 3, 4, 5};
        FirstWeek.insertKth(a, 2, 7);
        assertArrayEquals(new int[]{1, 2, 7, 3, 4}, a);
        int[] b = new int[]{1, 2, 3, 4, 5, 6, 7, 8};
        FirstWeek.insertKth(b, 0, 7);
        assertArrayEquals(new int[]{7, 1, 2, 3, 4, 5, 6, 7}, b);
    }

    @Test
    public void testSumOfColumns(){
        int[][] a = {{1, 2, 3, 4, 5}, {3, 4, 5, 6, 7}, {2, 3, 5, 7, 10}};
        int[] b = FirstWeek.sumColumns(a);
        assertArrayEquals(new int[]{6, 9, 13, 17, 22}, b);
        int[][] c = {{1, 1}, {-1, -2}, {0, 1}, {3, 4}, {10, 3}};
        int[] d = FirstWeek.sumColumns(c);
        assertArrayEquals(new int[]{13, 7}, d);
    }

    @Test
    public void testMaxOfColumns(){
        int[][] a = {{1, 2, 3, 4, 5}, {3, 4, 5, 6, 7}, {2, 3, 5, 7, 10}};
        int[] b = FirstWeek.maxOfColumns(a);
        assertArrayEquals(new int[]{3, 4, 5, 7, 10}, b);
        int[][] c = {{1, 1}, {-1, -2}, {0, 1}, {3, 4}, {10, 3}};
        int[] d = FirstWeek.maxOfColumns(c);
        assertArrayEquals(new int[]{10, 4}, d);
    }

    @Test
    public void testkThFibonacciIterative() {
        assertEquals(0, FirstWeek.kThFibonacciIterative(0));
        assertEquals(1, FirstWeek.kThFibonacciIterative(1));
        assertEquals(1, FirstWeek.kThFibonacciIterative(2));
        assertEquals(2, FirstWeek.kThFibonacciIterative(3));
        assertEquals(3, FirstWeek.kThFibonacciIterative(4));
        assertEquals(5, FirstWeek.kThFibonacciIterative(5));
    }

    @Test
    public void testPositiveDivisorsOfANumber(){
        assertArrayEquals(new int[]{1, 3}, FirstWeek.positiveDivisorsOfANumber(3));
        assertArrayEquals(new int[]{1, 2, 3, 4, 6, 12}, FirstWeek.positiveDivisorsOfANumber(12));
    }

    @Test
    public void testIterativeGreatestCommonDivisor(){
        assertEquals(12, FirstWeek.iterativeGreatestCommonDivisor(60, 96));
        assertEquals(1, FirstWeek.iterativeGreatestCommonDivisor(55, 96));
    }

    @Test
    public void testRecursiveGreatestCommonDivisor(){
        assertEquals(12, FirstWeek.recursiveGreatestCommonDivisor(60, 96));
        assertEquals(1, FirstWeek.recursiveGreatestCommonDivisor(55, 96));
    }

    @Test
    public void testRecursiveSumUntilN(){
        assertEquals(1, FirstWeek.recursiveSumUntilN(1));
        assertEquals(55, FirstWeek.recursiveSumUntilN(10));
    }

    @Test
    public void testRecursiveDigitsBase10(){
        assertArrayEquals(new int[]{1}, FirstWeek.recursiveDigitsBase10(1));
        assertArrayEquals(new int[]{1, 0}, FirstWeek.recursiveDigitsBase10(10));
        assertArrayEquals(new int[]{3, 5, 2, 7, 6}, FirstWeek.recursiveDigitsBase10(35276));
    }

}
