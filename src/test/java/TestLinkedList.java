import List.DoublyLinkedList;
import List.LinkedList;
import List.Node;
import org.junit.Test;

import static org.junit.Assert.*;

public class TestLinkedList {
    DoublyLinkedList doublyList;
    LinkedList list, list1, list2, list3;
    DoublyLinkedList[] listArray;
    LinkedList[] arrayOfLists;

    @Test
    public void testDoubleList() {
        doublyList = new DoublyLinkedList();
        doublyList.insertArray(new int[]{1, 2, 4, 5});
        doublyList.doubleList();
        assertEquals("1 1 2 2 4 4 5 5", doublyList.toString().trim());
        doublyList = new DoublyLinkedList();
        doublyList.insertArray(new int[]{1});
        doublyList.doubleList();
        assertEquals("1 1", doublyList.toString().trim());
        doublyList = new DoublyLinkedList();
        doublyList.insertArray(new int[]{8, 3, 2, 6});
        doublyList.doubleList();
        assertEquals("8 8 3 3 2 2 6 6", doublyList.toString().trim());
        doublyList = new DoublyLinkedList();
        doublyList.insertArray(new int[]{8, 3, 2, 6, 10, 12});
        doublyList.doubleList();
        assertEquals("8 8 3 3 2 2 6 6 10 10 12 12", doublyList.toString().trim());
    }

    @Test
    public void testDeleteKth() {
        list = new LinkedList();
        list.insertArray(new int[]{1, 2, 3, 4});
        list.deleteKth(0);
        list.deleteKth(2);
        assertEquals("2 3", list.toString().trim());
        list = new LinkedList();
        list.insertArray(new int[]{1});
        list.deleteKth(0);
        assertEquals("", list.toString().trim());
        list = new LinkedList();
        list.insertArray(new int[]{1, 8, 2, 12, 5, 6});
        list.deleteKth(0);
        list.deleteKth(0);
        list.deleteKth(0);
        assertEquals("12 5 6", list.toString().trim());
        list = new LinkedList();
        list.insertArray(new int[]{1, 8, 2, 12, 5, 6});
        list.deleteKth(5);
        list.deleteKth(4);
        list.deleteKth(3);
        assertEquals("1 8 2", list.toString().trim());
    }

    @Test
    public void testDeletePrimes(){
        list = new LinkedList();
        list.insertArray(new int[]{1, 2, 3, 4, 5});
        list.deletePrimes();
        assertEquals("1 4", list.toString().trim());
        list = new LinkedList();
        list.insertArray(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10});
        list.deletePrimes();
        assertEquals("1 4 6 8 9 10", list.toString().trim());
        list = new LinkedList();
        list.insertArray(new int[]{2, 3, 5, 7, 11, 13});
        list.deletePrimes();
        assertEquals("", list.toString().trim());
        list = new LinkedList();
        list.insertArray(new int[]{18, 2, 3, 5, 7, 11, 13, 14});
        list.deletePrimes();
        assertEquals("18, 14", list.toString().trim());
    }

    @Test
    public void testDeleteBetween(){
        list = new LinkedList();
        list.insertArray(new int[]{1, 2, 3, 4, 5});
        list.deleteBetween(1, 3);
        assertEquals("1 5", list.toString().trim());
        list = new LinkedList();
        list.insertArray(new int[]{1, 2, 3, 4, 5});
        list.deleteBetween(0, 4);
        assertEquals("", list.toString().trim());
        list = new LinkedList();
        list.insertArray(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10});
        list.deleteBetween(4, 9);
        assertEquals("1 2 3 4", list.toString().trim());
        list = new LinkedList();
        list.insertArray(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10});
        list.deleteBetween(4, 5);
        assertEquals("1 2 3 4 7 8 9 10", list.toString().trim());
    }

    @Test
    public void testEratosthenes(){
        list = LinkedList.eratosthenes(10);
        assertEquals("2 3 5 7", list.toString().trim());
        list = LinkedList.eratosthenes(4);
        assertEquals("2 3", list.toString().trim());
        list = LinkedList.eratosthenes(1);
        assertEquals("", list.toString().trim());
        list = LinkedList.eratosthenes(100);
        assertEquals("2 3 5 7 11 13 17 19 23 29 31 37 41 43 47 53 59 61 67 71 73 79 83 89 97", list.toString().trim());
    }

    @Test
    public void testGetEvenOnes(){
        doublyList = new DoublyLinkedList();
        doublyList.insertArray(new int[]{1, 2, 4, 5});
        DoublyLinkedList result = doublyList.getEvenOnes();
        assertEquals("2 5", result.toString().trim());
        doublyList = new DoublyLinkedList();
        doublyList.insertArray(new int[]{1});
        result = doublyList.getEvenOnes();
        assertEquals("", result.toString().trim());
        doublyList = new DoublyLinkedList();
        doublyList.insertArray(new int[]{1, 2});
        result = doublyList.getEvenOnes();
        assertEquals("2", result.toString().trim());
        doublyList = new DoublyLinkedList();
        doublyList.insertArray(new int[]{1, 2, 4, 5, 6, 3, 2, 1, 8, 6});
        result = doublyList.getEvenOnes();
        assertEquals("2 5 3 1 6", result.toString().trim());
    }

    @Test
    public void testContainsOnlyDuplicates(){
        list = new LinkedList();
        list.insertArray(new int[]{1, 5, 4, 4, 1, 5});
        assertTrue(list.containsOnlyDuplicates());
        list = new LinkedList();
        list.insertArray(new int[]{1, 1, 4, 4, 5, 5, 1});
        assertFalse(list.containsOnlyDuplicates());
        list = new LinkedList();
        list.insertArray(new int[]{1, 1});
        assertTrue(list.containsOnlyDuplicates());
        list = new LinkedList();
        list.insertArray(new int[]{1, 1, 1});
        assertFalse(list.containsOnlyDuplicates());
    }

    @Test
    public void testPrimeDivisors(){
        list = LinkedList.primeDivisors(200);
        assertEquals("2 2 2 5 5", list.toString().trim());
        list = LinkedList.primeDivisors(100);
        assertEquals("2 2 5 5", list.toString().trim());
        list = LinkedList.primeDivisors(2);
        assertEquals("2", list.toString().trim());
        list = LinkedList.primeDivisors(1890);
        assertEquals("2 3 3 3 5 7", list.toString().trim());
        list = LinkedList.primeDivisors(315);
        assertEquals("3 3 5 7", list.toString().trim());
    }

    @Test
    public void testLastOneWins(){
        list = new LinkedList();
        list.insertArray(new int[]{1, 2, 3, 4, 5, 6});
        Node node = list.lastOneWins(2);
        assertEquals("5", node.toString());
        list = new LinkedList();
        list.insertArray(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10});
        node = list.lastOneWins(3);
        assertEquals("4", node.toString());
        list = new LinkedList();
        list.insertArray(new int[]{1, 2, 3, 4, 5, 6});
        node = list.lastOneWins(1);
        assertEquals("6", node.toString());
        list = new LinkedList();
        list.insertArray(new int[]{1, 2, 3, 4, 5, 6, 7});
        node = list.lastOneWins(7);
        assertEquals("5", node.toString());
    }

    @Test
    public void testSortElements(){
        doublyList = new DoublyLinkedList();
        doublyList.insertArray(new int[]{5, 2, 3, 4, 2, 3, 4, 3, 2});
        DoublyLinkedList result = doublyList.sortElements();
        assertEquals("2 2 2 3 3 3 4 4 5", result.toString().trim());
        doublyList = new DoublyLinkedList();
        doublyList.insertArray(new int[]{1, 2, 3, 4, 5, 6, 7});
        result = doublyList.sortElements();
        assertEquals("1 2 3 4 5 6 7", result.toString().trim());
        doublyList = new DoublyLinkedList();
        doublyList.insertArray(new int[]{1, 2, 3, 4, 5, 6, 7, 1, 2, 3, 4, 5, 6, 7});
        result = doublyList.sortElements();
        assertEquals("1 1 2 2 3 3 4 4 5 5 6 6 7 7", result.toString().trim());
        doublyList = new DoublyLinkedList();
        doublyList.insertArray(new int[]{6, 6, 6, 6, 6, 6, 1, 1, 1});
        result = doublyList.sortElements();
        assertEquals("1 1 1 6 6 6 6 6 6", result.toString().trim());
    }

    @Test
    public void testEvenOddSorted(){
        list = new LinkedList();
        list.insertArray(new int[]{2, 10, 3, 7, 6, 4, 9, 2, 13, 0, 20});
        assertTrue(list.evenOddSorted());
        list = new LinkedList();
        list.insertArray(new int[]{2, 10, 3, 7, 6, 8, 9, 2, 13, 0, 20});
        assertFalse(list.evenOddSorted());
        list = new LinkedList();
        list.insertArray(new int[]{1, 9, 2, 8, 4, 6, 12, 2});
        assertTrue(list.evenOddSorted());
        list = new LinkedList();
        list.insertArray(new int[]{1, 10, 3, 7, 6, 4, 5});
        assertFalse(list.evenOddSorted());
    }

    @Test
    public void testIntersection(){
        list1 = new LinkedList();
        list1.insertArray(new int[]{1, 3, 5, 7, 11, 12});
        list2 = new LinkedList();
        list2.insertArray(new int[]{1, 2, 6, 7, 9, 11});
        list3 = LinkedList.intersec(list1, list2);
        assertEquals("1 7 11", list3.toString().trim());
        list1 = new LinkedList();
        list1.insertArray(new int[]{1, 3, 5, 7, 9});
        list2 = new LinkedList();
        list2.insertArray(new int[]{2, 6, 8, 10});
        list3 = LinkedList.intersec(list1, list2);
        assertEquals("", list3.toString().trim());
        list1 = new LinkedList();
        list1.insertArray(new int[]{1, 2, 4, 6, 12});
        list2 = new LinkedList();
        list2.insertArray(new int[]{1, 2, 4, 6, 12});
        list3 = LinkedList.intersec(list1, list2);
        assertEquals("1 2 4 6 12", list3.toString().trim());
        list1 = new LinkedList();
        list1.insertArray(new int[]{1, 3, 5, 6, 11});
        list2 = new LinkedList();
        list2.insertArray(new int[]{6, 10, 11, 13, 18, 22});
        list3 = LinkedList.intersec(list1, list2);
        assertEquals("6 11", list3.toString().trim());
    }

    @Test
    public void testIsPalindrom(){
        doublyList = new DoublyLinkedList();
        doublyList.insertArray(new int[]{1, 2, 4, 2, 1});
        assertTrue(doublyList.isPalindrom());
        doublyList = new DoublyLinkedList();
        doublyList.insertArray(new int[]{5});
        assertTrue(doublyList.isPalindrom());
        doublyList = new DoublyLinkedList();
        doublyList.insertArray(new int[]{5, 6});
        assertFalse(doublyList.isPalindrom());
        doublyList = new DoublyLinkedList();
        doublyList.insertArray(new int[]{5, 6, 7, 3, 3, 7, 2, 5});
        assertFalse(doublyList.isPalindrom());
    }

    @Test
    public void testRemove(){
        list = new LinkedList();
        list.insertArray(new int[]{1, 2, 3, 4, 5});
        list2 = new LinkedList();
        list2.insertArray(new int[]{3, 1, 5});
        list.remove(list2);
        assertEquals("2 4", list.toString().trim());
        list = new LinkedList();
        list.insertArray(new int[]{5, 2, 4});
        list2 = new LinkedList();
        list2.insertArray(new int[]{2, 4, 5});
        list.remove(list2);
        assertEquals("", list.toString().trim());
        list = new LinkedList();
        list.insertArray(new int[]{5, 2, 4, 6, 3, 1});
        list2 = new LinkedList();
        list2.insertArray(new int[]{7, 0, 8, 10});
        list.remove(list2);
        assertEquals("5 2 4 6 3 1", list.toString().trim());
        list = new LinkedList();
        list.insertArray(new int[]{1, 2, 3, 4, 5});
        list2 = new LinkedList();
        list2.insertArray(new int[]{2, 4});
        list.remove(list2);
        assertEquals("1 3 5", list.toString().trim());
    }

    @Test
    public void testDeleteEven(){
        doublyList = new DoublyLinkedList();
        doublyList.insertArray(new int[]{1, 2, 4, 2, 1});
        doublyList.deleteEven();
        assertEquals("1 1", doublyList.toString().trim());
        doublyList = new DoublyLinkedList();
        doublyList.insertArray(new int[]{2, 4, 2});
        doublyList.deleteEven();
        assertEquals("", doublyList.toString().trim());
        doublyList = new DoublyLinkedList();
        doublyList.insertArray(new int[]{6, 2, 4, 2, 12, 8});
        doublyList.deleteEven();
        assertEquals("6 2 4 2 12 8", doublyList.toString().trim());
        doublyList = new DoublyLinkedList();
        doublyList.insertArray(new int[]{5, 2, 4, 1, 2, 12, 7, 8, 3, 12, 1});
        doublyList.deleteEven();
        assertEquals("5 1 7 3 1", doublyList.toString().trim());
    }

    @Test
    public void testGetIndexed() {
        list = new LinkedList();
        list.insertArray(new int[]{3, 1, 7, 5, 11, 14, 2, 8, 16});
        list2 = new LinkedList();
        list2.insertArray(new int[]{2, 4, 6, 9});
        list3 = list.getIndexed(list2);
        assertEquals("1 5 14 16", list3.toString().trim());
        list = new LinkedList();
        list.insertArray(new int[]{3});
        list2 = new LinkedList();
        list2.insertArray(new int[]{1});
        list3 = list.getIndexed(list2);
        assertEquals("3", list3.toString().trim());
        list = new LinkedList();
        list.insertArray(new int[]{3, 1, 7, 5, 11, 14, 2, 8, 16});
        list2 = new LinkedList();
        list2.insertArray(new int[]{9});
        list3 = list.getIndexed(list2);
        assertEquals("16", list3.toString().trim());
        list = new LinkedList();
        list.insertArray(new int[]{3, 1, 7, 5, 11, 14, 2, 8, 16});
        list2 = new LinkedList();
        list2.insertArray(new int[]{1, 3, 5, 7, 9});
        list3 = list.getIndexed(list2);
        assertEquals("3 7 11 2 16", list3.toString().trim());
    }

    @Test
    public void testRemoveKthBeforeLast(){
        doublyList = new DoublyLinkedList();
        doublyList.insertArray(new int[]{1, 2, 4, 2, 1});
        doublyList.removeKthBeforeLast(2);
        assertEquals("1 2 4 1", doublyList.toString().trim());
        doublyList = new DoublyLinkedList();
        doublyList.insertArray(new int[]{1, 2, 4, 2, 1});
        doublyList.removeKthBeforeLast(1);
        doublyList.removeKthBeforeLast(1);
        doublyList.removeKthBeforeLast(1);
        assertEquals("1 2", doublyList.toString().trim());
        doublyList = new DoublyLinkedList();
        doublyList.insertArray(new int[]{1, 2, 4, 2, 1});
        doublyList.removeKthBeforeLast(5);
        doublyList.removeKthBeforeLast(4);
        doublyList.removeKthBeforeLast(3);
        assertEquals("2 1", doublyList.toString().trim());
        doublyList = new DoublyLinkedList();
        doublyList.insertArray(new int[]{1, 2, 4, 2, 1, 6});
        doublyList.removeKthBeforeLast(3);
        assertEquals("1 2 4 1 6", doublyList.toString().trim());
    }

    @Test
    public void testDifference(){
        list1 = new LinkedList();
        list1.insertArray(new int[]{1, 3, 5, 7, 11, 12});
        list2 = new LinkedList();
        list2.insertArray(new int[]{1, 2, 6, 7, 9, 11});
        list3 = LinkedList.difference(list1, list2);
        assertEquals("3 5 12", list3.toString().trim());
        list1 = new LinkedList();
        list1.insertArray(new int[]{1, 3, 5, 7, 9});
        list2 = new LinkedList();
        list2.insertArray(new int[]{2, 6, 8, 10});
        list3 = LinkedList.difference(list1, list2);
        assertEquals("1 3 5 7 9", list3.toString().trim());
        list1 = new LinkedList();
        list1.insertArray(new int[]{1, 2, 4, 6, 12});
        list2 = new LinkedList();
        list2.insertArray(new int[]{1, 2, 4, 6, 12});
        list3 = LinkedList.difference(list1, list2);
        assertEquals("", list3.toString().trim());
        list1 = new LinkedList();
        list1.insertArray(new int[]{6, 11, 23, 28});
        list2 = new LinkedList();
        list2.insertArray(new int[]{6, 10, 11, 13, 18, 22});
        list3 = LinkedList.difference(list1, list2);
        assertEquals("23 28", list3.toString().trim());

    }

    @Test
    public void testContainsOnlyTriplicates(){
        list = new LinkedList();
        list.insertArray(new int[]{1, 5, 1, 4, 4, 5, 1, 5});
        assertFalse(list.containsOnlyTriplicates());
        list = new LinkedList();
        list.insertArray(new int[]{1, 1, 4, 4, 5, 4, 5, 5, 1});
        assertTrue(list.containsOnlyTriplicates());
        list = new LinkedList();
        list.insertArray(new int[]{1, 1});
        assertFalse(list.containsOnlyTriplicates());
        list = new LinkedList();
        list.insertArray(new int[]{1, 1, 1});
        assertTrue(list.containsOnlyTriplicates());
    }

    @Test
    public void testReverse(){
        doublyList = new DoublyLinkedList();
        doublyList.insertArray(new int[]{5, 2, 3, 4, 1});
        doublyList.reverse();
        assertEquals("1 4 3 2 5", doublyList.toString().trim());
        doublyList = new DoublyLinkedList();
        doublyList.insertArray(new int[]{5});
        doublyList.reverse();
        assertEquals("5", doublyList.toString().trim());
        doublyList = new DoublyLinkedList();
        doublyList.insertArray(new int[]{1, 2, 3, 4, 5, 6});
        doublyList.reverse();
        assertEquals("6 5 4 3 2 1", doublyList.toString().trim());
        doublyList = new DoublyLinkedList();
        doublyList.insertArray(new int[]{3, 4, 2, 1, 6, 7, 3});
        doublyList.reverse();
        assertEquals("3 7 6 1 2 4 3", doublyList.toString().trim());
    }

    @Test
    public void testAddAfterEachNode() {
        list = new LinkedList();
        list.insertArray(new int[]{1, 2, 4, 5});
        list.addAfterEachNode(new Node(7));
        assertEquals("1 7 2 7 4 7 5 7", list.toString().trim());
        list = new LinkedList();
        list.insertArray(new int[]{1});
        list.addAfterEachNode(new Node(8));
        assertEquals("1 8", list.toString().trim());
        list = new LinkedList();
        list.insertArray(new int[]{8, 3, 2, 6});
        list.addAfterEachNode(new Node(3));
        assertEquals("8 3 3 3 2 3 6 3", list.toString().trim());
        list = new LinkedList();
        list.insertArray(new int[]{8, 3, 2, 6, 10, 12});
        list.addAfterEachNode(new Node(2));
        assertEquals("8 2 3 2 2 2 6 2 10 2 12 2", list.toString().trim());
    }

    @Test
    public void testFibonacciWay(){
        list = LinkedList.fibonacciWay(100);
        assertEquals("89 8 3", list.toString().trim());
        list = LinkedList.fibonacciWay(12);
        assertEquals("8 3 1", list.toString().trim());
        list = LinkedList.fibonacciWay(90);
        assertEquals("89 1", list.toString().trim());
        list = LinkedList.fibonacciWay(16);
        assertEquals("13 3", list.toString().trim());
    }

    @Test
    public void testDivideList() {
        doublyList = new DoublyLinkedList();
        doublyList.insertArray(new int[]{1, 2, 4, 5, 7, 9});
        listArray = doublyList.divideList(2);
        assertEquals("1 4 7", listArray[0].toString().trim());
        assertEquals("2 5 9", listArray[1].toString().trim());
        doublyList = new DoublyLinkedList();
        doublyList.insertArray(new int[]{1, 2, 4, 5, 7, 9});
        listArray = doublyList.divideList(3);
        assertEquals("1 5", listArray[0].toString().trim());
        assertEquals("2 7", listArray[1].toString().trim());
        assertEquals("4 9", listArray[2].toString().trim());
        doublyList = new DoublyLinkedList();
        doublyList.insertArray(new int[]{1, 2, 4, 5, 7, 9});
        listArray = doublyList.divideList(4);
        assertEquals("1 7", listArray[0].toString().trim());
        assertEquals("2 9", listArray[1].toString().trim());
        assertEquals("4", listArray[2].toString().trim());
        assertEquals("5", listArray[3].toString().trim());
        doublyList = new DoublyLinkedList();
        doublyList.insertArray(new int[]{1, 2, 4, 5, 7, 9});
        listArray = doublyList.divideList(6);
        assertEquals("1", listArray[0].toString().trim());
        assertEquals("2", listArray[1].toString().trim());
        assertEquals("4", listArray[2].toString().trim());
        assertEquals("5", listArray[3].toString().trim());
        assertEquals("7", listArray[4].toString().trim());
        assertEquals("9", listArray[5].toString().trim());
    }

    @Test
    public void testLinkedList(){
        arrayOfLists = new LinkedList[1];
        arrayOfLists[0] = new LinkedList();
        arrayOfLists[0].insertArray(new int[]{1, 2, 4, 5, 7, 9});
        list = new LinkedList(arrayOfLists, 1, 6);
        assertEquals("1 2 4 5 7 9", list.toString().trim());
        arrayOfLists = new LinkedList[2];
        arrayOfLists[0] = new LinkedList();
        arrayOfLists[0].insertArray(new int[]{1, 4, 7});
        arrayOfLists[1] = new LinkedList();
        arrayOfLists[1].insertArray(new int[]{2, 5, 9});
        list = new LinkedList(arrayOfLists, 2, 3);
        assertEquals("1 2 4 5 7 9", list.toString().trim());
        arrayOfLists = new LinkedList[3];
        arrayOfLists[0] = new LinkedList();
        arrayOfLists[0].insertArray(new int[]{1, 5});
        arrayOfLists[1] = new LinkedList();
        arrayOfLists[1].insertArray(new int[]{2, 7});
        arrayOfLists[2] = new LinkedList();
        arrayOfLists[2].insertArray(new int[]{4, 9});
        list = new LinkedList(arrayOfLists, 3, 2);
        assertEquals("1 2 4 5 7 9", list.toString().trim());
        arrayOfLists = new LinkedList[4];
        arrayOfLists[0] = new LinkedList();
        arrayOfLists[0].insertArray(new int[]{1});
        arrayOfLists[1] = new LinkedList();
        arrayOfLists[1].insertArray(new int[]{2});
        arrayOfLists[2] = new LinkedList();
        arrayOfLists[2].insertArray(new int[]{4});
        arrayOfLists[3] = new LinkedList();
        arrayOfLists[3].insertArray(new int[]{5});
        list = new LinkedList(arrayOfLists, 4, 1);
        assertEquals("1 2 4 5", list.toString().trim());
    }

    @Test
    public void testWindowedPairwiseGCD(){
        list = new LinkedList();
        list.insertArray(new int[]{12, 8, 12, 4, 6, 6});
        list1 = list.windowedPairwiseGCD(5);
        assertEquals("2 2", list1.toString().trim());
        list = new LinkedList();
        list.insertArray(new int[]{12, 8, 12, 4, 6, 6});
        list1 = list.windowedPairwiseGCD(2);
        assertEquals("4 4 4 2 6", list1.toString().trim());
        list = new LinkedList();
        list.insertArray(new int[]{12, 8, 12, 4, 6, 6});
        list1 = list.windowedPairwiseGCD(3);
        assertEquals("4 4 2 2", list1.toString().trim());
        list = new LinkedList();
        list.insertArray(new int[]{12, 8, 12, 4, 6, 6});
        list1 = list.windowedPairwiseGCD(4);
        assertEquals("4 2 2", list1.toString().trim());
    }

    @Test
    public void testZibonacci(){
        //0 1 1 1 2 3 4 6 9 13 19 28 41 60
        list = LinkedList.zibonacci(10, 20);
        assertEquals("13 19", list.toString().trim());
        list = LinkedList.zibonacci(0, 55);
        assertEquals("1 1 1 2 3 4 6 9 13 19 28 41", list.toString().trim());
        list = LinkedList.zibonacci(5, 7);
        assertEquals("6", list.toString().trim());
        list = LinkedList.zibonacci(20, 24);
        assertEquals("", list.toString().trim());
    }

    @Test
    public void testIsIncreasingOfSizeK(){
        list = new LinkedList();
        list.insertArray(new int[]{7, 1, 3, 6, 12, 3, 6});
        assertTrue(list.isIncreasingOfSizeK(4));
        assertFalse(list.isIncreasingOfSizeK(3));
        assertFalse(list.isIncreasingOfSizeK(5));
        assertTrue(list.isIncreasingOfSizeK(2));
    }

    @Test
    public void testCalculateCounts(){
        list = new LinkedList();
        list.insertArray(new int[]{2, 3, 4, 4, 4, 6, 6});
        list1 = list.calculateCounts();
        assertEquals("0 1 1 3 0 2", list1.toString().trim());
        list = new LinkedList();
        list.insertArray(new int[]{6});
        list1 = list.calculateCounts();
        assertEquals("0 0 0 0 0 1", list1.toString().trim());
        list = new LinkedList();
        list.insertArray(new int[]{1, 2, 3, 4, 5, 6, 7});
        list1 = list.calculateCounts();
        assertEquals("1 1 1 1 1 1 1", list1.toString().trim());
        list = new LinkedList();
        list.insertArray(new int[]{2, 4, 4, 6, 6, 6, 8, 8, 8, 8});
        list1 = list.calculateCounts();
        assertEquals("0 1 0 2 0 3 0 4", list1.toString().trim());
    }
}
