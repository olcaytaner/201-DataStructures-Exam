import List.DoublyLinkedList;
import List.DoublyNode;
import List.LinkedList;
import List.Node;
import org.junit.Test;

import static org.junit.Assert.*;

public class TestLinkedList {

    @Test
    public void testDoubleList() {
        DoublyLinkedList list = new DoublyLinkedList();
        list.insertLast(new DoublyNode(1));
        list.insertLast(new DoublyNode(2));
        list.insertLast(new DoublyNode(4));
        list.insertLast(new DoublyNode(5));
        list.doubleList();
        assertEquals("1 1 2 2 4 4 5 5", list.toString().trim());
    }

    @Test
    public void testDeleteKth() {
        LinkedList list = new LinkedList();
        list.insertLast(new Node(1));
        list.insertLast(new Node(2));
        list.insertLast(new Node(3));
        list.insertLast(new Node(4));
        //0. element is 1
        list.deleteKth(0);
        //2. element after 0. element deleted is 4
        list.deleteKth(2);
        assertEquals("2 3", list.toString().trim());
    }

    @Test
    public void testDeletePrimes(){
        LinkedList list = new LinkedList();
        list.insertLast(new Node(1));
        list.insertLast(new Node(2));
        list.insertLast(new Node(3));
        list.insertLast(new Node(4));
        list.insertLast(new Node(5));
        list.deletePrimes();
        assertEquals("1 4", list.toString().trim());
    }

    @Test
    public void testDeleteBetween(){
        LinkedList list = new LinkedList();
        list.insertLast(new Node(1));
        list.insertLast(new Node(2));
        list.insertLast(new Node(3));
        list.insertLast(new Node(4));
        list.insertLast(new Node(5));
        list.deleteBetween(1, 3);
        assertEquals("1 5", list.toString().trim());
    }

    @Test
    public void testEratosthenes(){
        LinkedList list = LinkedList.eratosthenes(10);
        assertEquals("2 3 5 7", list.toString().trim());
    }

    @Test
    public void testGetEvenNodes(){
        DoublyLinkedList list = new DoublyLinkedList();
        list.insertLast(new DoublyNode(1));
        list.insertLast(new DoublyNode(2));
        list.insertLast(new DoublyNode(4));
        list.insertLast(new DoublyNode(5));
        DoublyLinkedList result = list.getEvenOnes();
        assertEquals("2 5", list.toString().trim());
    }

    @Test
    public void testContainsOnlyDuplicates(){
        LinkedList list = new LinkedList();
        list.insertLast(new Node(1));
        list.insertLast(new Node(5));
        list.insertLast(new Node(4));
        list.insertLast(new Node(4));
        list.insertLast(new Node(1));
        list.insertLast(new Node(5));
        assertTrue(list.containsOnlyDuplicates());
        list = new LinkedList();
        list.insertLast(new Node(1));
        list.insertLast(new Node(1));
        list.insertLast(new Node(4));
        list.insertLast(new Node(4));
        list.insertLast(new Node(5));
        list.insertLast(new Node(5));
        list.insertLast(new Node(1));
        assertFalse(list.containsOnlyDuplicates());
    }

    @Test
    public void testPrimeDivisors(){
        LinkedList result = LinkedList.primeDivisors(200);
        assertEquals("2 2 2 5 5", result.toString().trim());
    }

    @Test
    public void testLastOneWins(){
        LinkedList list = new LinkedList();
        list.insertLast(new Node(1));
        list.insertLast(new Node(2));
        list.insertLast(new Node(3));
        list.insertLast(new Node(4));
        list.insertLast(new Node(5));
        list.insertLast(new Node(6));
        Node node = list.lastOneWins(2);
        assertEquals("5", node.toString());
    }

    @Test
    public void testSortElements(){
        DoublyLinkedList list = new DoublyLinkedList();
        list.insertLast(new DoublyNode(5));
        list.insertLast(new DoublyNode(2));
        list.insertLast(new DoublyNode(3));
        list.insertLast(new DoublyNode(4));
        list.insertLast(new DoublyNode(2));
        list.insertLast(new DoublyNode(3));
        list.insertLast(new DoublyNode(4));
        list.insertLast(new DoublyNode(3));
        list.insertLast(new DoublyNode(2));
        DoublyLinkedList result = list.sortElements();
        assertEquals("2 2 2 3 3 3 4 4 5", result.toString().trim());
    }

    @Test
    public void testEvenOddSorted(){
        LinkedList list = new LinkedList();
        list.insertLast(new Node(2));
        list.insertLast(new Node(10));
        list.insertLast(new Node(3));
        list.insertLast(new Node(7));
        list.insertLast(new Node(6));
        list.insertLast(new Node(4));
        list.insertLast(new Node(9));
        list.insertLast(new Node(2));
        list.insertLast(new Node(13));
        list.insertLast(new Node(0));
        list.insertLast(new Node(20));
        assertTrue(list.evenOddSorted());
    }

    @Test
    public void testIntersection(){
        LinkedList list1 = new LinkedList();
        list1.insertLast(new Node(1));
        list1.insertLast(new Node(3));
        list1.insertLast(new Node(5));
        list1.insertLast(new Node(7));
        list1.insertLast(new Node(11));
        list1.insertLast(new Node(12));
        LinkedList list2 = new LinkedList();
        list2.insertLast(new Node(1));
        list2.insertLast(new Node(2));
        list2.insertLast(new Node(6));
        list2.insertLast(new Node(7));
        list2.insertLast(new Node(9));
        list2.insertLast(new Node(11));
        LinkedList list3 = LinkedList.intersec(list1, list2);
        assertEquals("1 7 11", list3.toString().trim());
    }

    @Test
    public void testIsPalindrom(){
        DoublyLinkedList list = new DoublyLinkedList();
        list.insertLast(new DoublyNode(1));
        list.insertLast(new DoublyNode(2));
        list.insertLast(new DoublyNode(4));
        list.insertLast(new DoublyNode(2));
        list.insertLast(new DoublyNode(1));
        assertTrue(list.isPalindrom());
    }

    @Test
    public void testRemove(){
        LinkedList list = new LinkedList();
        list.insertLast(new Node(1));
        list.insertLast(new Node(2));
        list.insertLast(new Node(3));
        list.insertLast(new Node(4));
        list.insertLast(new Node(5));
        LinkedList list2 = new LinkedList();
        list2.insertLast(new Node(3));
        list2.insertLast(new Node(1));
        list2.insertLast(new Node(5));
        list.remove(list2);
        assertEquals("2 4", list.toString().trim());
    }

    @Test
    public void testDeleteEven(){
        DoublyLinkedList list = new DoublyLinkedList();
        list.insertLast(new DoublyNode(1));
        list.insertLast(new DoublyNode(2));
        list.insertLast(new DoublyNode(4));
        list.insertLast(new DoublyNode(2));
        list.insertLast(new DoublyNode(1));
        list.deleteEven();
        assertEquals("1 1", list.toString().trim());
    }

    @Test
    public void testGetIndexed() {
        LinkedList list = new LinkedList();
        list.insertLast(new Node(3));
        list.insertLast(new Node(1));
        list.insertLast(new Node(7));
        list.insertLast(new Node(5));
        list.insertLast(new Node(11));
        list.insertLast(new Node(14));
        list.insertLast(new Node(2));
        list.insertLast(new Node(8));
        list.insertLast(new Node(16));
        LinkedList list2 = new LinkedList();
        list2.insertLast(new Node(1));
        list2.insertLast(new Node(4));
        list2.insertLast(new Node(6));
        list2.insertLast(new Node(9));
        LinkedList list3 = list.getIndexed(list2);
        assertEquals("3 5 14 16", list3.toString().trim());
    }

    @Test
    public void testRemoveKthBeforeLast(){
        DoublyLinkedList list = new DoublyLinkedList();
        list.insertLast(new DoublyNode(1));
        list.insertLast(new DoublyNode(2));
        list.insertLast(new DoublyNode(4));
        list.insertLast(new DoublyNode(2));
        list.insertLast(new DoublyNode(1));
        list.removeKthBeforeLast(2);
        assertEquals("1 2 4 1", list.toString().trim());
    }

    @Test
    public void testDifference(){
        LinkedList list1 = new LinkedList();
        list1.insertLast(new Node(1));
        list1.insertLast(new Node(3));
        list1.insertLast(new Node(5));
        list1.insertLast(new Node(7));
        list1.insertLast(new Node(11));
        list1.insertLast(new Node(12));
        LinkedList list2 = new LinkedList();
        list2.insertLast(new Node(1));
        list2.insertLast(new Node(2));
        list2.insertLast(new Node(6));
        list2.insertLast(new Node(7));
        list2.insertLast(new Node(9));
        list2.insertLast(new Node(11));
        LinkedList list3 = LinkedList.difference(list1, list2);
        assertEquals("3 5 12", list3.toString().trim());
    }

    @Test
    public void testContainsOnlyTriplicates(){
        LinkedList list = new LinkedList();
        list.insertLast(new Node(1));
        list.insertLast(new Node(5));
        list.insertLast(new Node(4));
        list.insertLast(new Node(4));
        list.insertLast(new Node(1));
        list.insertLast(new Node(5));
        assertFalse(list.containsOnlyTriplicates());
        list = new LinkedList();
        list.insertLast(new Node(1));
        list.insertLast(new Node(1));
        list.insertLast(new Node(5));
        list.insertLast(new Node(4));
        list.insertLast(new Node(4));
        list.insertLast(new Node(5));
        list.insertLast(new Node(4));
        list.insertLast(new Node(5));
        list.insertLast(new Node(1));
        assertTrue(list.containsOnlyTriplicates());
    }

    @Test
    public void testReverse(){
        DoublyLinkedList list = new DoublyLinkedList();
        list.insertLast(new DoublyNode(5));
        list.insertLast(new DoublyNode(2));
        list.insertLast(new DoublyNode(3));
        list.insertLast(new DoublyNode(4));
        list.insertLast(new DoublyNode(1));
        list.reverse();
        assertEquals("1 4 3 2 5", list.toString().trim());
    }

    @Test
    public void testAddAfterEachNode() {
        LinkedList list = new LinkedList();
        list.insertLast(new Node(1));
        list.insertLast(new Node(2));
        list.insertLast(new Node(4));
        list.insertLast(new Node(5));
        list.addAfterEachNode(new Node(7));
        assertEquals("1 7 2 7 4 7 5 7", list.toString().trim());
    }

    @Test
    public void testFibonacciWay(){
        LinkedList result = LinkedList.fibonacciWay(100);
        assertEquals("89 8 3", result.toString().trim());
    }

    @Test
    public void testDivideList() {
        DoublyLinkedList list = new DoublyLinkedList();
        list.insertLast(new DoublyNode(1));
        list.insertLast(new DoublyNode(2));
        list.insertLast(new DoublyNode(4));
        list.insertLast(new DoublyNode(5));
        list.insertLast(new DoublyNode(7));
        list.insertLast(new DoublyNode(9));
        DoublyLinkedList[] result = list.divideList(2);
        assertEquals("1 4 7", result[0].toString().trim());
        assertEquals("2 5 9", result[1].toString().trim());
    }

    @Test
    public void testLinkedList(){
        LinkedList[] list = new LinkedList[2];
        list[0] = new LinkedList();
        list[1] = new LinkedList();
        list[0].insertLast(new Node(1));
        list[0].insertLast(new Node(4));
        list[0].insertLast(new Node(7));
        list[1].insertLast(new Node(2));
        list[1].insertLast(new Node(5));
        list[1].insertLast(new Node(9));
        LinkedList list2 = new LinkedList(list, 2, 3);
        assertEquals("1 2 4 5 7 9", list2.toString().trim());
    }

    @Test
    public void testWindowedPairwiseGCD(){
        LinkedList list = new LinkedList();
        list.insertLast(new Node(12));
        list.insertLast(new Node(8));
        list.insertLast(new Node(12));
        list.insertLast(new Node(4));
        list.insertLast(new Node(6));
        list.insertLast(new Node(6));
        LinkedList result = list.windowedPairwiseGCD(2);
        assertEquals("4 4 4 2 6", result.toString().trim());
    }

    @Test
    public void testZibonacci(){
        //0 1 1 1 2 3 4 6 9 13 19 28 41
        LinkedList result = LinkedList.zibonacci(10, 20);
        assertEquals("13 19", result.toString().trim());
    }

    @Test
    public void testIsIncreasingOfSizeK(){
        LinkedList list = new LinkedList();
        list.insertLast(new Node(7));
        list.insertLast(new Node(1));
        list.insertLast(new Node(3));
        list.insertLast(new Node(6));
        list.insertLast(new Node(12));
        list.insertLast(new Node(3));
        list.insertLast(new Node(6));
        assertTrue(list.isIncreasingOfSizeK(4));
    }

    @Test
    public void testCalculateCounts(){
        LinkedList list = new LinkedList();
        list.insertLast(new Node(2));
        list.insertLast(new Node(3));
        list.insertLast(new Node(4));
        list.insertLast(new Node(4));
        list.insertLast(new Node(4));
        list.insertLast(new Node(6));
        list.insertLast(new Node(6));
        LinkedList result = list.calculateCounts();
        assertEquals("0 1 1 3 0 2", result.toString().trim());
    }
}
