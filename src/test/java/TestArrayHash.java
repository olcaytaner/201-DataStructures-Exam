import Array.Hash;
import org.junit.Test;

import static org.junit.Assert.*;

public class TestArrayHash {
    private Hash hash1;

    @Test
    public void testAnyDuplicate() {
        assertFalse(Hash.anyDuplicate(new int[]{1, 2, 3, 4, 5}));
        assertTrue(Hash.anyDuplicate(new int[]{1, 2, 3, 4, 5, 1, 2}));
        assertFalse(Hash.anyDuplicate(new int[]{1}));
        assertTrue(Hash.anyDuplicate(new int[]{1, 2, 3, 4, 3, 6}));
        assertTrue(Hash.anyDuplicate(new int[]{1, 2, 3, 4, 7, 6, 8, 4, 10, 12}));
    }

    @Test
    public void testDeleteAll() {
        hash1 = new Hash(17);
        hash1.insertArray(new int[]{1, 2, 2, 1, 2, 3, 1, 2, 1, 2});
        hash1.deleteAll(2);
        assertEquals("1 1 3 1 1", hash1.toString());
        hash1.deleteAll(1);
        assertEquals("3", hash1.toString());
        hash1 = new Hash(17);
        hash1.insertArray(new int[]{1, 2, 3, 4, 5, 4, 6, 7, 8, 2, 4, 6});
        hash1.deleteAll(4);
        assertEquals("1 2 3 5 6 7 8 2 6", hash1.toString());
        hash1.deleteAll(5);
        assertEquals("1 2 3 6 7 8 2 6", hash1.toString());
    }

    @Test
    public void testEqualPairSums() {
        assertTrue(Hash.equalPairSums(new int[]{1, 5, 11, 8, 13}));
        assertFalse(Hash.equalPairSums(new int[]{1, 2, 4, 8, 16, 32, 64, 128}));
        assertTrue(Hash.equalPairSums(new int[]{1, 2, 4, 8, 16, 32, 64, 128, 16}));
        assertFalse(Hash.equalPairSums(new int[]{1, 3, 9, 27, 81, 243, 729}));
    }

    @Test
    public void testHashFunctionItself() {
        hash1 = new Hash(17);
        hash1.insertArray(new int[]{1, 2, 2, 1, 2, 3, 1, 2, 1, 2});
        assertEquals(0, hash1.hashFunctionItSelf());
        hash1 = new Hash(17);
        hash1.insertArray(new int[]{1, 2, 3, 4, 5, 4, 6, 7, 8, 2, 4, 6});
        assertEquals(1, hash1.hashFunctionItSelf());
        hash1 = new Hash(7);
        hash1.insertArray(new int[]{1, 2, 2, 2, 1, 2});
        assertEquals(3, hash1.hashFunctionItSelf());
        hash1 = new Hash(25);
        hash1.insertArray(new int[]{1, 2, 3, 4, 5, 4, 6, 7, 8, 2, 4, 6});
        assertEquals(2, hash1.hashFunctionItSelf());
    }

    @Test
    public void testNumberOfClusters() {
        hash1 = new Hash(17);
        hash1.insertArray(new int[]{1, 2, 4, 3, 7, 9});
        assertEquals(3, hash1.numberOfClusters());
        hash1 = new Hash(17);
        hash1.insertArray(new int[]{1, 2, 3, 4, 5, 6, 7, 8});
        assertEquals(1, hash1.numberOfClusters());
        hash1 = new Hash(7);
        hash1.insertArray(new int[]{1, 2, 4, 5});
        assertEquals(2, hash1.numberOfClusters());
        hash1 = new Hash(13);
        hash1.insertArray(new int[]{4, 2, 6, 8, 12, 10});
        assertEquals(6, hash1.numberOfClusters());
    }

    @Test
    public void testNumberOfExtras() {
        assertEquals(0, Hash.numberOfExtras(new int[]{1, 2, 3, 4, 5}));
        assertEquals(2, Hash.numberOfExtras(new int[]{1, 2, 3, 4, 5, 1, 2}));
        assertEquals(0, Hash.numberOfExtras(new int[]{1}));
        assertEquals(1, Hash.numberOfExtras(new int[]{1, 2, 3, 4, 3, 6}));
        assertEquals(7, Hash.numberOfExtras(new int[]{1, 2, 2, 1, 1, 1, 2, 1, 2}));
    }

    @Test
    public void testSimplify() {
        hash1 = new Hash(17);
        hash1.insertArray(new int[]{1, 2, 2, 1, 2, 3, 1, 2, 1, 2});
        assertEquals("1 2 3", hash1.simplify().toString());
        hash1 = new Hash(17);
        hash1.insertArray(new int[]{1, 2, 3, 4, 5, 4, 6, 7, 8, 2, 4, 6});
        assertEquals("1 2 3 4 5 6 7 8", hash1.simplify().toString());
        hash1 = new Hash(9);
        hash1.insertArray(new int[]{1, 2, 2, 2, 1, 1, 2});
        assertEquals("1 2", hash1.simplify().toString());
        hash1 = new Hash(15);
        hash1.insertArray(new int[]{1, 2, 4, 5, 4, 6, 7, 2, 4, 6});
        assertEquals("1 2 4 5 6 7", hash1.simplify().toString());
    }

    @Test
    public void testSortByHashing() {
        assertArrayEquals(new int[]{1, 2, 3, 4, 5}, Hash.sortByHashing(new int[]{1, 2, 3, 4, 5}));
        assertArrayEquals(new int[]{1, 1, 2, 2, 3, 4, 5}, Hash.sortByHashing(new int[]{1, 2, 3, 4, 5, 1, 2}));
        assertArrayEquals(new int[]{1}, Hash.sortByHashing(new int[]{1}));
        assertArrayEquals(new int[]{1, 2, 3, 3, 4, 6}, Hash.sortByHashing(new int[]{1, 2, 3, 4, 3, 6}));
        assertArrayEquals(new int[]{1, 1, 1, 1, 1, 2, 2, 2, 2}, Hash.sortByHashing(new int[]{1, 2, 2, 1, 1, 1, 2, 1, 2}));
    }

    @Test
    public void testEqualPairDiffs() {
        assertTrue(Hash.equalPairDiffs(new int[]{1, 2, 3, 4}));
        assertFalse(Hash.equalPairDiffs(new int[]{1, 3, 6}));
        assertFalse(Hash.equalPairDiffs(new int[]{1, 2}));
        assertTrue(Hash.equalPairDiffs(new int[]{1, 3, 5}));
    }

}