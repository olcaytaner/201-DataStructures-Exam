import Array.Queue;
import List.LinkedList;
import Tree.Tree;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class TestTree {
    Tree tree, tree1;

    @Before
    public void setUp() {
        tree = new Tree();
    }

    @Test
    public void testBottomTwo() {
        tree.insertArray(new int[]{1, 2, 3, 4, 5, 6, 7, 8});
        assertEquals("1 2", tree.bottomTwo());
        tree = new Tree();
        tree.insertArray(new int[]{5, 2, 6, 1, 8, 4, 3, 7});
        assertEquals("1 2", tree.bottomTwo());
        tree = new Tree();
        tree.insertArray(new int[]{4, 2});
        assertEquals("2 4", tree.bottomTwo());
        tree = new Tree();
        tree.insertArray(new int[]{4, 2, 6, 3, 7});
        assertEquals("2 3", tree.bottomTwo());
    }

    @Test
    public void testCountEvenNodes() {
        tree.insertArray(new int[]{1, 2, 3, 4, 5, 6, 7, 8});
        assertEquals(4, tree.countEvenNodes());
        tree = new Tree();
        tree.insertArray(new int[]{5, 2, 6, 1, 8, 4, 3, 7});
        assertEquals(4, tree.countEvenNodes());
        tree = new Tree();
        tree.insertArray(new int[]{4, 2});
        assertEquals(2, tree.countEvenNodes());
        tree = new Tree();
        tree.insertArray(new int[]{4, 2, 6, 3, 7});
        assertEquals(3, tree.countEvenNodes());
        tree = new Tree();
        tree.insertArray(new int[]{4, 2, 6, 1, 3, 5, 7});
        assertEquals(3, tree.countEvenNodes());
    }

    @Test
    public void testDepthOfNode() {
        tree.insertArray(new int[]{1, 2, 3, 4, 5, 6, 7, 8});
        assertEquals(1, tree.depthOfNode(1));
        assertEquals(5, tree.depthOfNode(5));
        assertEquals(8, tree.depthOfNode(8));
        tree = new Tree();
        tree.insertArray(new int[]{5, 2, 6, 1, 8, 4, 3, 7});
        assertEquals(2, tree.depthOfNode(2));
        assertEquals(3, tree.depthOfNode(1));
        assertEquals(3, tree.depthOfNode(8));
    }

    @Test
    public void testIsIdentical() {
        tree.insertArray(new int[]{1, 2, 3, 4, 5, 6, 7, 8});
        tree1 = new Tree();
        tree1.insertArray(new int[]{1, 2, 3, 4, 5, 6, 7, 8});
        assertTrue(tree.isIdentical(tree.getRoot(), tree1.getRoot()));
        assertTrue(tree.isIdentical(tree.getRoot().getRight().getRight(), tree1.getRoot().getRight().getRight()));
        tree = new Tree();
        tree.insertArray(new int[]{5, 2, 6, 1, 8, 4, 3, 9});
        tree1 = new Tree();
        tree1.insertArray(new int[]{5, 2, 6, 1, 8, 4, 3, 7});
        assertFalse(tree.isIdentical(tree.getRoot(), tree1.getRoot()));
        assertTrue(tree.isIdentical(tree.getRoot().getLeft(), tree1.getRoot().getLeft()));
    }

    @Test
    public void testLeftistOrRightist() {
        tree.insertArray(new int[]{1, 2, 3, 4, 5, 6, 7, 8});
        assertEquals(-7, tree.leftistOrRightist());
        tree = new Tree();
        tree.insertArray(new int[]{5, 2, 6, 1, 8, 4, 3, 7});
        assertEquals(1, tree.leftistOrRightist());
        tree = new Tree();
        tree.insertArray(new int[]{4, 2});
        assertEquals(1, tree.leftistOrRightist());
        tree = new Tree();
        tree.insertArray(new int[]{4, 2, 6, 3, 7});
        assertEquals(-2, tree.leftistOrRightist());
        tree = new Tree();
        tree.insertArray(new int[]{4, 2, 6, 1, 3, 5, 7});
        assertEquals(0, tree.leftistOrRightist());
    }

    @Test
    public void testPathList() {
        tree.insertArray(new int[]{1, 2, 3, 4, 5, 6, 7, 8});
        assertArrayEquals(new int[]{1}, tree.pathList());
        tree = new Tree();
        tree.insertArray(new int[]{5, 2, 6, 1, 8, 4, 3, 7});
        assertArrayEquals(new int[]{5, 2, 4}, tree.pathList());
        tree = new Tree();
        tree.insertArray(new int[]{4, 2});
        assertArrayEquals(new int[]{4}, tree.pathList());
        tree = new Tree();
        tree.insertArray(new int[]{4, 2, 6, 3, 7});
        assertArrayEquals(new int[]{4, 6, 7}, tree.pathList());
        tree = new Tree();
        tree.insertArray(new int[]{4, 2, 6, 1, 3, 5, 7});
        assertArrayEquals(new int[]{4, 6, 7}, tree.pathList());
    }

    @Test
    public void testProduct() {
        tree.insertArray(new int[]{1, 2, 3, 4, 5, 6, 7, 8});
        assertEquals(2 * 3 * 4 * 5 * 6 * 7 * 8, tree.product());
        tree = new Tree();
        tree.insertArray(new int[]{5, 2, 6, 1, 8, 4, 3, 7});
        assertEquals(5 * 2 * 6 * 8 * 4 * 3 * 7, tree.product());
        tree = new Tree();
        tree.insertArray(new int[]{4, 2});
        assertEquals(4 * 2, tree.product());
        tree = new Tree();
        tree.insertArray(new int[]{4, 2, 6, 3, 7});
        assertEquals(4 * 2 * 6 * 3 * 7, tree.product());
        tree = new Tree();
        tree.insertArray(new int[]{4, 2, 6, 1, 3, 5, 7});
        assertEquals(4 * 2 * 6 * 3 * 5 * 7, tree.product());
    }

    @Test
    public void testSumOfPath() {
        tree.insertArray(new int[]{1, 2, 3, 4, 5, 6, 7, 8});
        assertEquals(1 + 2 + 3 + 4, tree.sumOfPath("111"));
        tree = new Tree();
        tree.insertArray(new int[]{5, 2, 6, 1, 8, 4, 3, 7});
        assertEquals(5 + 2 + 1, tree.sumOfPath("00"));
        tree = new Tree();
        tree.insertArray(new int[]{4, 2});
        assertEquals(4 + 2, tree.sumOfPath("0"));
        tree = new Tree();
        tree.insertArray(new int[]{4, 2, 6, 3, 7});
        assertEquals(4 + 2 + 3, tree.sumOfPath("01"));
        tree = new Tree();
        tree.insertArray(new int[]{4, 2, 6, 1, 3, 5, 7});
        assertEquals(4 + 6 + 5, tree.sumOfPath("10"));
    }

    @Test
    public void testAccumulateLeafNodes() {
        tree.insertArray(new int[]{1, 2, 3, 4, 5, 6, 7, 8});
        Queue queue = new Queue(100);
        tree.getRoot().accumulateLeafNodes(queue);
        assertEquals("8", queue.toString());
        tree = new Tree();
        tree.insertArray(new int[]{5, 2, 6, 1, 8, 4, 3, 7});
        queue = new Queue(100);
        tree.getRoot().accumulateLeafNodes(queue);
        assertEquals("1 3 7", queue.toString());
        tree = new Tree();
        tree.insertArray(new int[]{4, 2});
        queue = new Queue(100);
        tree.getRoot().accumulateLeafNodes(queue);
        assertEquals("2", queue.toString());
        tree = new Tree();
        tree.insertArray(new int[]{4, 2, 6, 3, 7});
        queue = new Queue(100);
        tree.getRoot().accumulateLeafNodes(queue);
        assertEquals("3 7", queue.toString());
        tree = new Tree();
        tree.insertArray(new int[]{4, 2, 6, 1, 3, 5, 7});
        queue = new Queue(100);
        tree.getRoot().accumulateLeafNodes(queue);
        assertEquals("1 3 5 7", queue.toString());
    }

    @Test
    public void testAverageOfItsChildren() {
        tree.insertArray(new int[]{1, 2, 3, 4, 5, 6, 7, 8});
        assertFalse(tree.getRoot().averageOfItsChildren());
        tree = new Tree();
        tree.insertArray(new int[]{5, 2, 6, 1, 8, 4, 3, 7});
        assertFalse(tree.getRoot().averageOfItsChildren());
        tree = new Tree();
        tree.insertArray(new int[]{4, 2});
        assertFalse(tree.getRoot().averageOfItsChildren());
        tree = new Tree();
        tree.insertArray(new int[]{4, 2, 6, 3, 7});
        assertTrue(tree.getRoot().averageOfItsChildren());
        tree = new Tree();
        tree.insertArray(new int[]{4, 2, 6, 1, 3, 5, 7});
        assertTrue(tree.getRoot().averageOfItsChildren());
    }

    @Test
    public void testAverages() {
        tree.insertArray(new int[]{1, 2, 3, 4, 5, 6, 7, 8});
        assertEquals(0, tree.getRoot().averages());
        tree = new Tree();
        tree.insertArray(new int[]{5, 2, 6, 1, 8, 4, 3, 7});
        assertEquals(0, tree.getRoot().averages());
        tree = new Tree();
        tree.insertArray(new int[]{4, 2, 1, 3, 6});
        assertEquals(2, tree.getRoot().averages());
        tree = new Tree();
        tree.insertArray(new int[]{4, 2, 6, 3, 7});
        assertEquals(1, tree.getRoot().averages());
        tree = new Tree();
        tree.insertArray(new int[]{4, 2, 6, 1, 3, 5, 7});
        assertEquals(3, tree.getRoot().averages());
    }

    @Test
    public void testCollectNodes() {
        tree.insertArray(new int[]{1, 2, 3, 4, 5, 6, 7, 8});
        assertArrayEquals(new int[]{1, 2, 3, 4, 5, 6, 7, 8}, tree.getRoot().collectNodes());
        tree = new Tree();
        tree.insertArray(new int[]{5, 2, 6, 1, 8, 4, 3, 7});
        assertArrayEquals(new int[]{1, 2, 3, 4, 5, 6, 7, 8}, tree.getRoot().collectNodes());
        tree = new Tree();
        tree.insertArray(new int[]{4, 2, 1, 3, 6});
        assertArrayEquals(new int[]{1, 2, 3, 4, 6}, tree.getRoot().collectNodes());
        tree = new Tree();
        tree.insertArray(new int[]{4, 2, 6, 3, 7});
        assertArrayEquals(new int[]{2, 3, 4, 6, 7}, tree.getRoot().collectNodes());
        tree = new Tree();
        tree.insertArray(new int[]{4, 2, 6, 1, 3, 5, 7});
        assertArrayEquals(new int[]{1, 2, 3, 4, 5, 6, 7}, tree.getRoot().collectNodes());
    }

    @Test
    public void testHasPath() {
        tree.insertArray(new int[]{1, 2, 3, 4, 5, 6, 7, 8});
        assertTrue(tree.getRoot().hasPath(new int[]{1, 2, 3, 4, 5, 6, 7, 8}));
        assertFalse(tree.getRoot().hasPath(new int[]{1, 2, 3, 4, 5, 6, 8}));
        tree = new Tree();
        tree.insertArray(new int[]{5, 2, 6, 1, 8, 4, 3, 7});
        assertTrue(tree.getRoot().hasPath(new int[]{5, 6, 8, 7}));
        assertFalse(tree.getRoot().hasPath(new int[]{5, 2, 3}));
        tree = new Tree();
        tree.insertArray(new int[]{4, 2});
        assertTrue(tree.getRoot().hasPath(new int[]{4, 2}));
        assertFalse(tree.getRoot().hasPath(new int[]{5}));
        tree = new Tree();
        tree.insertArray(new int[]{4, 2, 6, 3, 7});
        assertTrue(tree.getRoot().hasPath(new int[]{4, 2, 3}));
        assertFalse(tree.getRoot().hasPath(new int[]{4, 6, 8}));
        tree = new Tree();
        tree.insertArray(new int[]{4, 2, 6, 1, 3, 5, 7});
        assertTrue(tree.getRoot().hasPath(new int[]{4, 6, 5}));
        assertTrue(tree.getRoot().hasPath(new int[]{4, 2, 1}));
    }

    @Test
    public void testHigherThanX() {
        tree.insertArray(new int[]{1, 2, 3, 4, 5, 6, 7, 8});
        assertEquals(7, tree.getRoot().higherThanX(1));
        tree = new Tree();
        tree.insertArray(new int[]{5, 2, 6, 1, 8, 4, 3, 7});
        assertEquals(7, tree.getRoot().higherThanX(1));
        tree = new Tree();
        tree.insertArray(new int[]{4, 2});
        assertEquals(2, tree.getRoot().higherThanX(1));
        tree = new Tree();
        tree.insertArray(new int[]{4, 2, 6, 3, 7});
        assertEquals(2, tree.getRoot().higherThanX(5));
        tree = new Tree();
        tree.insertArray(new int[]{4, 2, 6, 1, 3, 5, 7});
        assertEquals(1, tree.getRoot().higherThanX(6));
    }

    @Test
    public void testLeftist() {
        tree.insertArray(new int[]{1, 2, 3, 4, 5, 6, 7, 8});
        assertEquals(0, tree.getRoot().leftist());
        tree = new Tree();
        tree.insertArray(new int[]{5, 2, 6, 1, 8, 4, 3, 7});
        assertEquals(2, tree.getRoot().leftist());
        tree = new Tree();
        tree.insertArray(new int[]{4, 3, 2, 1});
        assertEquals(3, tree.getRoot().leftist());
        tree = new Tree();
        tree.insertArray(new int[]{4, 2, 6, 3, 7});
        assertEquals(0, tree.getRoot().leftist());
        tree = new Tree();
        tree.insertArray(new int[]{4, 2, 6, 1, 5, 7});
        assertEquals(1, tree.getRoot().leftist());
    }

    @Test
    public void testLessThanX() {
        tree.insertArray(new int[]{1, 2, 3, 4, 5, 6, 7, 8});
        assertArrayEquals(new int[]{1, 2, 3, 4, 5, 6, 7, 8}, tree.getRoot().lessThanX(9));
        assertArrayEquals(new int[]{1}, tree.getRoot().lessThanX(2));
        tree = new Tree();
        tree.insertArray(new int[]{5, 2, 6, 1, 8, 4, 3, 7});
        assertArrayEquals(new int[]{1, 2, 3, 4, 5}, tree.getRoot().lessThanX(6));
        assertArrayEquals(new int[]{1, 2, 3}, tree.getRoot().lessThanX(4));
        tree = new Tree();
        tree.insertArray(new int[]{4, 2});
        assertArrayEquals(new int[]{2, 4}, tree.getRoot().lessThanX(5));
        assertArrayEquals(new int[]{2}, tree.getRoot().lessThanX(3));
        tree = new Tree();
        tree.insertArray(new int[]{4, 2, 6, 3, 7});
        assertArrayEquals(new int[]{2, 3, 4}, tree.getRoot().lessThanX(5));
        assertArrayEquals(new int[]{2, 3, 4, 6, 7}, tree.getRoot().lessThanX(8));
        tree = new Tree();
        tree.insertArray(new int[]{4, 2, 6, 1, 3, 5, 7});
        assertArrayEquals(new int[]{1, 2, 3, 4}, tree.getRoot().lessThanX(5));
        assertArrayEquals(new int[]{1}, tree.getRoot().lessThanX(2));
    }

    @Test
    public void testNumberOfDuplicates() {
        tree.insertArray(new int[]{1, 2, 2, 3, 3});
        assertEquals(2, tree.getRoot().numberOfDuplicates());
        tree = new Tree();
        tree.insertArray(new int[]{5, 2, 6, 1, 2, 6, 1, 5});
        assertEquals(4, tree.getRoot().numberOfDuplicates());
        tree = new Tree();
        tree.insertArray(new int[]{4, 2, 6});
        assertEquals(0, tree.getRoot().numberOfDuplicates());
        tree = new Tree();
        tree.insertArray(new int[]{4, 2, 6, 3, 2, 7, 6, 3, 4, 7});
        assertEquals(5, tree.getRoot().numberOfDuplicates());
        tree = new Tree();
        tree.insertArray(new int[]{4, 2, 6, 1, 3, 5, 7, 6});
        assertEquals(1, tree.getRoot().numberOfDuplicates());
    }

    @Test
    public void testPathToLinkedList() {
        tree.insertArray(new int[]{1, 2, 3, 4, 5, 6, 7, 8});
        LinkedList list = new LinkedList();
        tree.getRoot().pathToLinkedList(list);
        assertEquals("1", list.toString());
        tree = new Tree();
        tree.insertArray(new int[]{5, 2, 6, 1, 8, 4, 3, 7});
        list = new LinkedList();
        tree.getRoot().pathToLinkedList(list);
        assertEquals("5 2 4", list.toString());
        tree = new Tree();
        tree.insertArray(new int[]{4, 2});
        list = new LinkedList();
        tree.getRoot().pathToLinkedList(list);
        assertEquals("4", list.toString());
        tree = new Tree();
        tree.insertArray(new int[]{4, 2, 6, 3, 7});
        list = new LinkedList();
        tree.getRoot().pathToLinkedList(list);
        assertEquals("4 6 7", list.toString());
        tree = new Tree();
        tree.insertArray(new int[]{4, 2, 6, 1, 3, 5, 7});
        list = new LinkedList();
        tree.getRoot().pathToLinkedList(list);
        assertEquals("4 6 7", list.toString());
    }

    @Test
    public void testProductOfTree() {
        tree.insertArray(new int[]{1, 2, 3, 4, 5, 6, 7, 8});
        assertEquals(2 * 3 * 4 * 5 * 6 * 7 * 8, tree.getRoot().productOfTree());
        tree = new Tree();
        tree.insertArray(new int[]{5, 2, 6, 1, 8, 4, 3, 7});
        assertEquals(5 * 2 * 6 * 8 * 4 * 3 * 7, tree.getRoot().productOfTree());
        tree = new Tree();
        tree.insertArray(new int[]{4, 2});
        assertEquals(4 * 2, tree.getRoot().productOfTree());
        tree = new Tree();
        tree.insertArray(new int[]{4, 2, 6, 3, 7});
        assertEquals(4 * 2 * 6 * 3 * 7, tree.getRoot().productOfTree());
        tree = new Tree();
        tree.insertArray(new int[]{4, 2, 6, 1, 3, 5, 7});
        assertEquals(4 * 2 * 6 * 3 * 5 * 7, tree.getRoot().productOfTree());
    }

    @Test
    public void testSumOfNodesBetween() {
        tree.insertArray(new int[]{1, 2, 3, 4, 5, 6, 7, 8});
        assertEquals(1 + 2 + 3 + 4 + 5 + 6 + 7 + 8, tree.getRoot().sumOfNodesBetween(0, 9));
        tree = new Tree();
        tree.insertArray(new int[]{5, 2, 6, 1, 8, 4, 3, 7});
        assertEquals(5 + 6, tree.getRoot().sumOfNodesBetween(4, 7));
        tree = new Tree();
        tree.insertArray(new int[]{4, 2});
        assertEquals(0, tree.getRoot().sumOfNodesBetween(5, 7));
        tree = new Tree();
        tree.insertArray(new int[]{4, 2, 6, 3, 7});
        assertEquals(2 + 3 + 4, tree.getRoot().sumOfNodesBetween(1, 5));
        tree = new Tree();
        tree.insertArray(new int[]{4, 2, 6, 1, 3, 5, 7});
        assertEquals(1 + 2 + 3 + 4 + 5 + 6 + 7, tree.getRoot().sumOfNodesBetween(0, 8));
    }

    @Test
    public void testSumOfTree() {
        tree.insertArray(new int[]{1, 2, 3, 4, 5, 6, 7, 8});
        assertEquals(1 + 2 + 3 + 4 + 5 + 6 + 7 + 8, tree.getRoot().sumOfTree(9));
        tree = new Tree();
        tree.insertArray(new int[]{5, 2, 6, 1, 8, 4, 3, 7});
        assertEquals(1 + 2 + 3 + 4 + 5 + 6, tree.getRoot().sumOfTree(7));
        tree = new Tree();
        tree.insertArray(new int[]{4, 2});
        assertEquals(0, tree.getRoot().sumOfTree(1));
        tree = new Tree();
        tree.insertArray(new int[]{4, 2, 6, 3, 7});
        assertEquals(2 + 3 + 4, tree.getRoot().sumOfTree(5));
        tree = new Tree();
        tree.insertArray(new int[]{4, 2, 6, 1, 3, 5, 7});
        assertEquals(1 + 2 + 3 + 4 + 5 + 6 + 7, tree.getRoot().sumOfTree(8));
    }

    @Test
    public void testCountOddNodes() {
        Tree tree1 = new Tree();
        tree1.insertArray(new int[]{1, 2, 3, 4, 5, 6, 7, 8});
        assertEquals(4, tree1.countOddNodes());
        Tree tree2 = new Tree();
        tree2.insertArray(new int[]{5, 2, 6, 1, 8, 4, 3, 7});
        assertEquals(4, tree2.countOddNodes());
        Tree tree3 = new Tree();
        tree3.insertArray(new int[]{4, 2});
        assertEquals(0, tree3.countOddNodes());
        Tree tree4 = new Tree();
        tree4.insertArray(new int[]{4, 2, 6, 3, 7});
        assertEquals(2, tree4.countOddNodes());
        Tree tree5 = new Tree();
        tree5.insertArray(new int[]{4, 2, 6, 1, 3, 5, 7});
        assertEquals(4, tree5.countOddNodes());
    }

    @Test
    public void testGreaterThanChildren() {
        Tree tree1 = new Tree();
        tree1.insertArray(new int[]{7, 4, 10, 1, 6, 8, 11});
        assertEquals(2, tree1.getRoot().greaterThanChildren());
        Tree tree2 = new Tree();
        tree2.insertArray(new int[]{9, 4, 11, 2, 6, 10, 12});
        assertEquals(1, tree2.getRoot().greaterThanChildren());
    }

    @Test
    public void testQuadraticSummation() {
        Tree tree1 = new Tree();
        tree1.insertArray(new int[]{2, 3, 10, 1, 6});
        assertEquals(150, tree1.getRoot().quadraticSummation());
        Tree tree2 = new Tree();
        tree2.insertArray(new int[]{2, 3, 1});
        assertEquals(14, tree2.getRoot().quadraticSummation());
    }

}