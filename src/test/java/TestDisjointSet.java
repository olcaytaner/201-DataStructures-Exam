import Array.DisjointSet;
import org.junit.Assert;
import org.junit.Test;

public class TestDisjointSet {

    @Test
    public void testAscendants1() {
        DisjointSet disjointSet = new DisjointSet(10);
        Assert.assertArrayEquals(new int[]{1}, disjointSet.ascendants1(1));
        Assert.assertArrayEquals(new int[]{2}, disjointSet.ascendants1(2));
        disjointSet.union(1, 2);
        Assert.assertArrayEquals(new int[]{2, 1}, disjointSet.ascendants1(2));
        Assert.assertArrayEquals(new int[]{1}, disjointSet.ascendants1(1));
        disjointSet.union(1, 3);
        Assert.assertArrayEquals(new int[]{3, 1}, disjointSet.ascendants1(3));
        disjointSet.union(4, 5);
        disjointSet.union(1, 5);
        Assert.assertArrayEquals(new int[]{5, 4, 1}, disjointSet.ascendants1(5));
    }

    @Test
    public void testAscendants2() {
        DisjointSet disjointSet = new DisjointSet(10);
        Assert.assertArrayEquals(new int[]{1}, disjointSet.ascendants2(1));
        Assert.assertArrayEquals(new int[]{2}, disjointSet.ascendants2(2));
        disjointSet.union(1, 2);
        Assert.assertArrayEquals(new int[]{2, 1}, disjointSet.ascendants2(2));
        Assert.assertArrayEquals(new int[]{1}, disjointSet.ascendants2(1));
        disjointSet.union(1, 3);
        Assert.assertArrayEquals(new int[]{3, 1}, disjointSet.ascendants2(3));
        disjointSet.union(4, 5);
        disjointSet.union(1, 5);
        Assert.assertArrayEquals(new int[]{5, 4, 1}, disjointSet.ascendants2(5));
    }

    @Test
    public void testDescendants1() {
        DisjointSet disjointSet = new DisjointSet(10);
        Assert.assertArrayEquals(new int[]{}, disjointSet.descendants1(1));
        disjointSet.union(1, 2);
        Assert.assertArrayEquals(new int[]{2}, disjointSet.descendants1(1));
        disjointSet.union(1, 3);
        Assert.assertArrayEquals(new int[]{2, 3}, disjointSet.descendants1(1));
        disjointSet.union(4, 5);
        disjointSet.union(1, 5);
        Assert.assertArrayEquals(new int[]{2, 3, 4, 5}, disjointSet.descendants1(1));
    }

    @Test
    public void testDescendants2() {
        DisjointSet disjointSet = new DisjointSet(10);
        Assert.assertArrayEquals(new int[]{}, disjointSet.descendants2(1));
        disjointSet.union(1, 2);
        Assert.assertArrayEquals(new int[]{2}, disjointSet.descendants2(1));
        disjointSet.union(1, 3);
        Assert.assertArrayEquals(new int[]{2, 3}, disjointSet.descendants2(1));
        disjointSet.union(4, 5);
        disjointSet.union(1, 5);
        Assert.assertArrayEquals(new int[]{2, 3, 4, 5}, disjointSet.descendants2(1));
    }

    @Test
    public void testGetSetWithIndex() {
        DisjointSet disjointSet = new DisjointSet(10);
        Assert.assertArrayEquals(new int[]{1}, disjointSet.getSetWithIndex(1));
        disjointSet.union(1, 2);
        Assert.assertArrayEquals(new int[]{1, 2}, disjointSet.getSetWithIndex(1));
        disjointSet.union(1, 3);
        Assert.assertArrayEquals(new int[]{1, 2, 3}, disjointSet.getSetWithIndex(3));
        disjointSet.union(4, 5);
        Assert.assertArrayEquals(new int[]{4, 5}, disjointSet.getSetWithIndex(4));
        disjointSet.union(1, 5);
        Assert.assertArrayEquals(new int[]{1, 2, 3, 4, 5}, disjointSet.getSetWithIndex(4));
    }

    @Test
    public void testCombine() {
        Assert.assertEquals(2, DisjointSet.combine(3, new int[]{0, 1}, new int[]{1, 0}));
        Assert.assertEquals(1, DisjointSet.combine(3, new int[]{0, 1, 2}, new int[]{1, 0, 1}));
        Assert.assertEquals(4, DisjointSet.combine(7, new int[]{0, 1, 3}, new int[]{2, 3, 5}));
        Assert.assertEquals(6, DisjointSet.combine(10, new int[]{0, 2, 3, 6}, new int[]{1, 9, 5, 7}));
        Assert.assertEquals(4, DisjointSet.combine(10, new int[]{0, 2, 3, 6, 4, 9, 1}, new int[]{1, 9, 5, 7, 8, 0, 9}));
    }

    @Test
    public void testGrandChildren() {
        DisjointSet disjointSet = new DisjointSet(10);
        Assert.assertEquals("", disjointSet.grandChildren(0).toString());
        disjointSet.union(1, 2);
        disjointSet.union(6, 7);
        disjointSet.union(1, 6);
        Assert.assertEquals("7", disjointSet.grandChildren(1).toString());
        disjointSet.union(8, 9);
        disjointSet.union(1, 9);
        Assert.assertEquals("7 9", disjointSet.grandChildren(1).toString());
        disjointSet.union(4, 5);
        Assert.assertEquals("7 9", disjointSet.grandChildren(1).toString());
        disjointSet.union(1, 5);
        Assert.assertEquals("7 9 5", disjointSet.grandChildren(1).toString());
    }

    @Test
    public void testIsValid() {
        DisjointSet disjointSet = new DisjointSet(10);
        Assert.assertTrue(disjointSet.isValid());
        disjointSet.union(1, 2);
        Assert.assertTrue(disjointSet.isValid());
        disjointSet.union(1, 3);
        Assert.assertTrue(disjointSet.isValid());
        disjointSet.union(4, 5);
        Assert.assertTrue(disjointSet.isValid());
        disjointSet.union(1, 5);
        Assert.assertTrue(disjointSet.isValid());
    }

    @Test
    public void testNumberOfTriplets() {
        DisjointSet disjointSet = new DisjointSet(10);
        Assert.assertEquals(0, disjointSet.numberOfTriplets());
        disjointSet.union(1, 2);
        disjointSet.union(1, 3);
        Assert.assertEquals(1, disjointSet.numberOfTriplets());
        disjointSet.union(4, 5);
        disjointSet.union(5, 6);
        Assert.assertEquals(2, disjointSet.numberOfTriplets());
        disjointSet.union(7, 8);
        disjointSet.union(9, 8);
        Assert.assertEquals(3, disjointSet.numberOfTriplets());
        disjointSet.union(1, 4);
        disjointSet.union(1, 7);
        Assert.assertEquals(1, disjointSet.numberOfTriplets());
    }

    @Test
    public void testNumberOfSurvivors() {
        Assert.assertEquals(1, DisjointSet.numberOfSurvivors(3, new int[]{0, 1}, new int[]{1, 0}));
        Assert.assertEquals(0, DisjointSet.numberOfSurvivors(3, new int[]{0, 1, 2}, new int[]{1, 0, 1}));
        Assert.assertEquals(2, DisjointSet.numberOfSurvivors(7, new int[]{0, 1, 3}, new int[]{2, 3, 5}));
        Assert.assertEquals(2, DisjointSet.numberOfSurvivors(10, new int[]{0, 2, 3, 6}, new int[]{1, 9, 5, 7}));
        Assert.assertEquals(0, DisjointSet.numberOfSurvivors(10, new int[]{0, 2, 3, 6, 4, 9, 1}, new int[]{1, 9, 5, 7, 8, 0, 9}));
    }

    @Test
    public void testUnion2() {
        DisjointSet disjointSet = new DisjointSet(10);
        disjointSet.union2(0, 1, 2);
        Assert.assertEquals(8, disjointSet.setCount());
        disjointSet.union2(3, 4, 5);
        Assert.assertEquals(6, disjointSet.setCount());
        disjointSet.union2(6, 7, 8);
        Assert.assertEquals(4, disjointSet.setCount());
        disjointSet.union2(1, 4, 9);
        Assert.assertEquals(2, disjointSet.setCount());
    }

    @Test
    public void testUnionOfSets() {
        DisjointSet disjointSet = new DisjointSet(10);
        disjointSet.unionOfSets(new int[]{0, 1, 2});
        Assert.assertEquals(8, disjointSet.setCount());
        disjointSet.unionOfSets(new int[]{3, 4, 5});
        Assert.assertEquals(6, disjointSet.setCount());
        disjointSet.unionOfSets(new int[]{6, 7, 8});
        Assert.assertEquals(4, disjointSet.setCount());
        disjointSet.unionOfSets(new int[]{1, 4, 9, 8});
        Assert.assertEquals(1, disjointSet.setCount());
    }

    @Test
    public void testUnmerge() {
        DisjointSet disjointSet = new DisjointSet(10);
        Assert.assertEquals(10, disjointSet.setCount());
        disjointSet.union(1, 2);
        disjointSet.unmerge(1);
        Assert.assertEquals(10, disjointSet.setCount());
        disjointSet.union(1, 3);
        disjointSet.union(4, 5);
        disjointSet.unmerge(4);
        Assert.assertEquals(9, disjointSet.setCount());
    }

    @Test
    public void testValue() {
        DisjointSet disjointSet = new DisjointSet(10);
        Assert.assertEquals(1, disjointSet.value(0));
        disjointSet.union(1, 2);
        disjointSet.union(1, 3);
        Assert.assertEquals(4, disjointSet.value(1));
        disjointSet.union(4, 5);
        disjointSet.union(5, 6);
        Assert.assertEquals(7, disjointSet.value(4));
        disjointSet.union(7, 8);
        disjointSet.union(0, 8);
        disjointSet.union(0, 9);
        Assert.assertEquals(10, disjointSet.value(7));
    }

    @Test
    public void testSameHeightSets() {
        DisjointSet disjointSet = new DisjointSet(10);
        disjointSet.union(1, 2);
        disjointSet.union(2, 3);
        disjointSet.union(5, 6);
        disjointSet.union(5, 7);
        Assert.assertEquals(4, disjointSet.sameHeightSets(3));
        Assert.assertEquals(6, disjointSet.sameHeightSets(1));

        disjointSet = new DisjointSet(4);
        disjointSet.union(0, 1);
        disjointSet.union(2, 3);
        Assert.assertEquals(2, disjointSet.sameHeightSets(1));
        Assert.assertEquals(2, disjointSet.sameHeightSets(2));

        disjointSet = new DisjointSet(6);
        disjointSet.union(1, 2);
        disjointSet.union(3, 4);
        disjointSet.union(3, 5);
        disjointSet.union(3, 4);
        Assert.assertEquals(3, disjointSet.sameHeightSets(1));
        Assert.assertEquals(3, disjointSet.sameHeightSets(3));
    }

    @Test
    public void testChildrenParentEqual() {
        DisjointSet disjointSet = new DisjointSet(10);
        disjointSet.union(3, 1);
        disjointSet.union(1, 2);
        disjointSet.union(5, 6);
        disjointSet.union(5, 7);
        Assert.assertEquals(2, disjointSet.childrenParentEqual());

        disjointSet = new DisjointSet(8);
        disjointSet.union(3, 1);
        disjointSet.union(1, 2);
        disjointSet.union(6, 5);
        disjointSet.union(6, 7);
        Assert.assertEquals(2, disjointSet.childrenParentEqual());

        disjointSet = new DisjointSet(8);
        disjointSet.union(0, 3);
        disjointSet.union(3, 4);
        disjointSet.union(1, 2);
        disjointSet.union(5, 6);
        disjointSet.union(5, 7);
        Assert.assertEquals(2, disjointSet.childrenParentEqual());
    }

}
