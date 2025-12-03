import List.Hash;
import org.junit.Test;

import static org.junit.Assert.*;

public class TestListHash {
    private Hash hash1;

    @Test
    public void testDeleteAll() {
        hash1 = new Hash(17);
        hash1.insertArray(new int[]{1, 2, 2, 1, 2, 3, 1, 2, 1, 2});
        hash1.deleteAll(2);
        assertEquals("1 1 1 1 3", hash1.toString());
        hash1.deleteAll(1);
        assertEquals("3", hash1.toString());
        hash1 = new Hash(17);
        hash1.insertArray(new int[]{1, 2, 3, 4, 5, 4, 6, 7, 8, 2, 4, 6});
        hash1.deleteAll(4);
        assertEquals("1 2 2 3 5 6 6 7 8", hash1.toString());
        hash1.deleteAll(5);
        assertEquals("1 2 2 3 6 6 7 8", hash1.toString());
    }

    @Test
    public void testDifference() {
        assertArrayEquals(new int[]{1, 2, 3}, Hash.difference(new int[]{1, 2, 3, 4}, new int[]{4}));
        assertArrayEquals(new int[]{1, 2}, Hash.difference(new int[]{1, 2}, new int[]{4, 5, 6, 7}));
        assertArrayEquals(new int[]{2, 4}, Hash.difference(new int[]{1, 2, 3, 4, 5}, new int[]{1, 3, 5}));
        assertArrayEquals(new int[]{1}, Hash.difference(new int[]{1, 4, 5, 3, 2}, new int[]{4, 3, 2, 5}));
        assertArrayEquals(new int[]{4, 5}, Hash.difference(new int[]{1, 4, 5, 3, 2}, new int[]{1, 6, 2, 3}));
    }

    @Test
    public void testIntersection() {
        assertArrayEquals(new int[]{4}, Hash.intersection(new int[]{1, 2, 3, 4}, new int[]{4}));
        assertArrayEquals(new int[]{}, Hash.intersection(new int[]{1, 2}, new int[]{4, 5, 6, 7}));
        assertArrayEquals(new int[]{1, 3, 5}, Hash.intersection(new int[]{1, 2, 3, 4, 5}, new int[]{1, 3, 5}));
        assertArrayEquals(new int[]{4, 5, 3, 2}, Hash.intersection(new int[]{1, 4, 5, 3, 2}, new int[]{4, 3, 2, 5}));
        assertArrayEquals(new int[]{1, 3, 2}, Hash.intersection(new int[]{1, 4, 5, 3, 2}, new int[]{1, 6, 2, 3}));
    }

    @Test
    public void testIsValid() {
        hash1 = new Hash(17);
        hash1.insertArray(new int[]{1, 2, 2, 1, 2, 3, 1, 2, 1, 2});
        assertFalse(hash1.isValid());
        hash1 = new Hash(17);
        hash1.insertArray(new int[]{1, 2, 3, 4, 5, 6, 8});
        assertTrue(hash1.isValid());
        hash1 = new Hash(7);
        hash1.insertArray(new int[]{1, 2, 2, 1, 2, 3, 1, 2, 1, 2});
        assertFalse(hash1.isValid());
        hash1 = new Hash(5);
        hash1.insertArray(new int[]{1, 3, 5, 7, 8, 2, 4, 6});
        assertTrue(hash1.isValid());
    }

    @Test
    public void testMinTableSize() {
        assertEquals(5, Hash.minTableSize(new int[]{4, 2, 6, 3}));
        assertEquals(3, Hash.minTableSize(new int[]{4, 2}));
        assertEquals(6, Hash.minTableSize(new int[]{4, 2, 6, 3, 7}));
        assertEquals(8, Hash.minTableSize(new int[]{4, 2, 6, 3, 7, 9}));
        assertEquals(11, Hash.minTableSize(new int[]{4, 2, 6, 3, 7, 9, 12}));
    }

    @Test
    public void testPerfectMap() {
        hash1 = new Hash(17);
        hash1.insertArray(new int[]{1, 2, 2, 1, 2, 3, 1, 2, 1, 2});
        assertFalse(hash1.perfectMap());
        hash1 = new Hash(17);
        hash1.insertArray(new int[]{1, 2, 3, 4, 5, 6, 8});
        assertTrue(hash1.perfectMap());
        hash1 = new Hash(7);
        hash1.insertArray(new int[]{1, 2, 2, 1, 2, 3, 1, 2, 1, 2});
        assertFalse(hash1.perfectMap());
        hash1 = new Hash(5);
        hash1.insertArray(new int[]{1, 3, 5, 7});
        assertTrue(hash1.perfectMap());
    }

    @Test
    public void testSimplify() {
        hash1 = new Hash(17);
        hash1.insertArray(new int[]{1, 2, 2, 1, 2, 3, 1, 2, 1, 2});
        assertEquals("1 2 3", hash1.simplify().toString());
        hash1 = new Hash(17);
        hash1.insertArray(new int[]{1, 2, 3, 4, 5, 4, 6, 7, 8, 2, 4, 6});
        assertEquals("1 2 3 4 5 6 7 8", hash1.simplify().toString());
        hash1 = new Hash(7);
        hash1.insertArray(new int[]{1, 2, 2, 2, 1, 1, 2});
        assertEquals("1 2", hash1.simplify().toString());
        hash1 = new Hash(5);
        hash1.insertArray(new int[]{1, 2, 4, 5, 4, 6, 7, 2, 4, 6});
        assertEquals("1 2 4 5 6 7", hash1.simplify().toString());
    }

    @Test
    public void testSymmetricDiff() {
        assertArrayEquals(new int[]{1, 2, 3}, Hash.symmetricDiff(new int[]{1, 2, 3, 4}, new int[]{4}));
        assertArrayEquals(new int[]{1, 2, 4, 5, 6, 7}, Hash.symmetricDiff(new int[]{1, 2}, new int[]{4, 5, 6, 7}));
        assertArrayEquals(new int[]{2, 4}, Hash.symmetricDiff(new int[]{1, 2, 3, 4, 5}, new int[]{1, 3, 5}));
        assertArrayEquals(new int[]{1}, Hash.symmetricDiff(new int[]{1, 4, 5, 3, 2}, new int[]{4, 3, 2, 5}));
        assertArrayEquals(new int[]{4, 5, 6}, Hash.symmetricDiff(new int[]{1, 4, 5, 3, 2}, new int[]{1, 6, 2, 3}));
    }

    @Test
    public void testUnion() {
        assertArrayEquals(new int[]{1, 2, 3, 4}, Hash.union(new int[]{1, 2, 3, 4}, new int[]{4}));
        assertArrayEquals(new int[]{1, 2, 4, 5, 6, 7}, Hash.union(new int[]{1, 2}, new int[]{4, 5, 6, 7}));
        assertArrayEquals(new int[]{1, 2, 3, 4, 5}, Hash.union(new int[]{1, 2, 3, 4, 5}, new int[]{1, 3, 5}));
        assertArrayEquals(new int[]{1, 4, 5, 3, 2}, Hash.union(new int[]{1, 4, 5, 3, 2}, new int[]{4, 3, 2, 5}));
        assertArrayEquals(new int[]{1, 4, 5, 3, 2, 6}, Hash.union(new int[]{1, 4, 5, 3, 2}, new int[]{1, 6, 2, 3}));
    }

    @Test
    public void testSumOfFourK() {
        assertTrue(Hash.sumOfFourK(new int[]{1, 5, 11, 8, 13}, 33));
        assertFalse(Hash.sumOfFourK(new int[]{1, 2, 4, 8, 16, 32, 64, 128}, 1000));
        assertTrue(Hash.sumOfFourK(new int[]{1, 2, 4, 8, 16, 32, 64, 128}, 116));
        assertFalse(Hash.sumOfFourK(new int[]{1, 3, 9, 27, 81, 243, 729}, 700));
    }

    @Test
    public void testSumOfTwoK() {
        assertTrue(Hash.sumOfTwoK(new int[]{1, 5, 11, 8, 13}, 19));
        assertFalse(Hash.sumOfTwoK(new int[]{1, 2, 4, 8, 16, 32, 64, 128}, 191));
        assertTrue(Hash.sumOfTwoK(new int[]{1, 2, 4, 8, 16, 32, 64, 128}, 80));
        assertFalse(Hash.sumOfFourK(new int[]{1, 3, 9, 27, 81, 243, 729}, 700));
    }

    @Test
    public void testSumOfThreeK() {
        assertTrue(Hash.sumOfThreeK(new int[]{1, 2, 3, 4}, 6));
        assertFalse(Hash.sumOfThreeK(new int[]{1, 2, 3}, 5));
        assertFalse(Hash.sumOfThreeK(new int[]{1, 2, 3, 9}, 15));
        assertTrue(Hash.sumOfThreeK(new int[]{1, 2, 3, 4}, 9));
    }

}