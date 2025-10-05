package List;

import com.sun.istack.internal.NotNull;

public class LinkedList {

    protected Node head;
    protected Node tail;

    public LinkedList() {
        head = null;
        tail = null;
    }

    public boolean isEmpty(){
        return head == null;
    }

    public Node getHead(){
        return head;
    }

    public void insertArray(int[] data){
        for (int datum : data){
            insertLast(new Node(datum));
        }
    }

    public void insertFirst(Node newNode) {
        if (isEmpty()) {
            tail = newNode;
        }
        newNode.setNext(head);
        head = newNode;
    }

    public void insertLast(Node newNode) {
        if (head == null) {
            head = newNode;
        } else {
            tail.setNext(newNode);
        }
        tail = newNode;
    }

    public Node search(int value) {
        Node tmp = head;
        while (tmp != null) {
            if (value == tmp.getData()) {
                return tmp;
            }
            tmp = tmp.getNext();
        }
        return null;
    }
    public void deleteFirst(){
        head = head.getNext();
        if (isEmpty()){
            tail = null;
        }
    }
    
    public String toString(){
        StringBuilder result = new StringBuilder();
        Node tmp = head;
        while (tmp != null) {
            result.append(tmp).append(" ");
            tmp = tmp.getNext();
        }
        return result.toString();
    }

    /**
     * Write another constructor method which constructs the original list  from $k$ lists of size $m$ as follows. The
     * first, second, $\ldots$, $k$’th element of the original linked
     * list will be the first element of the first, second, . .
     * ., $k$’th input linked list, the  $k+1 $'st,  $k+2 $'nd, $\ldots$, $2k$’th element of the original linked
     * list will be the second element of the first, second, . .
     * ., $k$’th input linked list. The elements of the
     * original linked list should be created (not copied from
     * the linked lists). Your algorithm should run in ${\cal O}(km)$ time. Allocate and use an external array of size
     * $k$ to store current pointers in each of $k$ lists.
     */
    public LinkedList(LinkedList[] list, int k, int m){

    }

    /**
     * Write the method which add newnode after each node in the singly linked list.
     */
    public void addAfterEachNode(Node newNode){

    }

    /**
     * Write a method which calculates the counts of each number in a sorted linked list. Linked list should contain a
     * count for every number. You can use insertLast. Algorithm is as follows:
     * <ul>
     *     <li>Traverse the list
     *     <ul>
     *         <li>When the number is the first number, insert possibly leading zeros, initialize count.</li>
     *         <li>When the number is the same as the previous number, increment the count</li>
     *         <li>If the number is the new, initialize the count, insert the count of the previous number and possibly
     *         leading zero counts.</li>
     *     </ul>
     *     </li>
     *     <li>For the last number, insert the count.</li>
     * </ul>
     */
    public LinkedList calculateCounts(){
        return null;
    }

    /**
     * Write a method which returns true if the singly linked list only contains duplicates, that is, every datum
     * (number) occurs only twice. Important warning, the duplicate elements may not be adjacent. You are not allowed
     * to use any singly linked list methods, just attributes, constructors, getters and setters.
     */
    public boolean containsOnlyDuplicates(){
        return false;
    }

    /**
     * Write a method which returns true if the single linked list only contains triplicates, that is, every datum
     * (number) occurs only three times. Important warning, the triplicate elements may not be adjacent. Your method
     * should have a time complexity of ${\cal O}(N^2)$. You are not allowed to use any single linked list methods, just
     * attributes, constructors, getters and setters.
     */
    public boolean containsOnlyTriplicates(){
        return false;
    }

    /**
     * Write a linear time method to delete the nodes indexed between p and q (including p'th and q'th items) from a
     * singly linked list.
     */
    public void deleteBetween(int p, int q){
    }

    /**
     * Write the method which removes the nodes with even values in the original list. Your method should run in
     * ${\cal O}(N)$ time.
     */
    public void deleteEven(){
    }

    /**
     * Write a function to delete $k$'th node from a singly linked list.
     */
    public void deleteKth(int K){

    }

    /**
     * Write a function that will delete all {\bf prime} nodes that is their data field is prime such as 2, 3, 5, 7, etc.
     */
    public void deletePrimes(){
    }

    /**
     * Write the static method in {\bf LinkedList} class to find the difference of the elements in two sorted linked
     * lists and return a new linked list. The resulting list should contain those elements that are in list1 but not
     * in list2. Do not modify linked lists list1 and list2. Your method should run in ${\cal O}(N)$ time. Nodes in the
     * resulting list should be new. You can not use any linked list methods except getters and setters.
     */
    public static LinkedList difference(LinkedList list1, LinkedList list2){
        return list1;
    }

    /**
     * Write the algorithm Sieve of Eratosthenes to extract prime numbers using singly linked list. The algorithm works
     * as follows:
     * <ul>
     *     <li>Put all numbers starting from 2 to N in a linked list.</li>
     *     <li>While the linked list contains numbers
     *     <ul>
     *         <li>Remove the first element $p$ from the linked list. Print it (It is prime).</li>
     *         <li>Remove all elements from the linked list which are divisible by $p$. Do not print them.</li>
     *     </ul>
     *     <li>Return the linked list</li>
     *     </li>
     * </ul>
     */
    public static LinkedList eratosthenes(int N){
        return null;
    }

    /**
     * Write the method which returns true if the singly linked list odd indexed elements are sorted increasing order
     * and even indexed elements are sorted in decreasing order. The first node has index 1. You are not allowed to use
     * any singly linked list methods. You are allowed to use attributes, constructors, getters and setters. Write the
     * method in the LinkedList class.
     */
    public boolean evenOddSorted(){
        return false;
    }

    /**
     * Write the method which returns the elements at positions list[1], list[2], list[3], etc. list[1] is the first
     * element in the list, list[2] is the second element in the list etc. You are not allowed to use any linked list
     * methods. You are only allowed to use attributes, constructors, getters and setters. Assume that list is sorted.
     * Your algorithm should run in ${\cal O}(N)$ time. Your linked list should contain new nodes, not the same nodes
     * in the original linked list.
     */
    public LinkedList getIndexed(LinkedList list){
        return this;
    }

    /**
     * Write the method to find the intersection of the elements in two sorted linked lists and return a new linked
     * list. Implement the following algorithm:
     * <ul>
     *     <li>At the beginning of the algorithm, let say we have two nodes p1 and p2, showing the head nodes of the
     *     first and second lists respectively.</li>
     *     <li>Compare the contents of the nodes p1 and p2;
     *     <ul>
     *         <li>If p1.data $<$ p2.data, advance p1 pointer to show next node in its list.</li>
     *         <li>If p1.data $>$ p2.data, advance p2 pointer to show next node in its list.</li>
     *         <li>If p1.data $=$ p2.data, put a new node with content of p1 and advance both pointers p1 and p2 in
     *         their respective lists.</li>
     *     </ul>
     *     </li>
     *     <li>Continue with step 2 until one of the p1 or p2 is null.</li>
     * </ul>
     * You are not allowed to use any linked list methods. You are only allowed to use attributes, constructors,
     * getters and setters.
     */
    public static LinkedList intersec(LinkedList list1, LinkedList list2){
        return list1;
    }

    /**
     * Write a function that checks whether the original singly list contains at least one increasing sequence of length
     * $k > 1$ {\bf exactly}.
     */
    public boolean isIncreasingOfSizeK(int k){
        return false;
    }

    /**
     * Write the algorithm in the {\bf LinkedList} class which works as follows:
     * <ul>
     *     <li>Delete every k'th element from the list.</li>
     *     <li>When you get the end of the list, return to the first element, as if the list is circular.</li>
     *     <li>Return the remaining node.</li>
     * </ul>
     * Let say the list is 1 2 3 4 5 6, and k = 2, then 2, 4, 6, 3, 1 will be deleted, 5 remains.
     */
    public Node lastOneWins(int k){
        return null;
    }

    /**
     * Write the algorithm in the {\bf LinkedList} class which works as follows:
     * <ul>
     *     <li>Creates a temporary linked list primes, which stores the prime numbers until N.</li>
     *     <li>Using primes returns all prime divisors (with repeating) of N.</li>
     * </ul>
     * Let say N = 200, the function will return 2, 2, 2, 5, 5. You are not allowed to use any array in the function.
     */
    public static LinkedList primeDivisors(int N){
        return null;
    }

    /**
     * In math, any number can be represented as the sum of distinct Fibonacci numbers. For example, given the first 10
     * Fibonacci numbers. The number 100 can be represented as 89 + 8 + 3. In this question, you will identify the
     * Fibonacci representation of a number N, which works as follows.
     * <ul>
     *     <li>Creates a temporary linked list of Fibonacci numbers in reverse until N. So, for the given example, the
     *     list will contains the numbers 89, 55, 34, 21, 13, 8, 5, 3, 2, 1.</li>
     *     <li>Using Fibonacci numbers list, returns the representation as a linked list.</li>
     * </ul>
     */
    public static LinkedList fibonacciWay(int N){
        return null;
    }

    /**
     * Write the method which removes the nodes that appear in the list2 from the original list. You are not allowed to
     * use any methods from the LinkedList class. You can assume both the original list and list2 do not contain
     * duplicate elements. Do not modify list2. Your method should run in ${\cal O}(N^2)$ time.
     */
    public void remove(LinkedList list2){
    }

    /**
     * Write a function that computes the GCD (Greatest Common Divisor) of every window of \textit{k} consecutive nodes
     * in the list and returns a new linked list containing these GCD values.
     */
    public LinkedList windowedPairwiseGCD(int k){
        return this;
    }

    /**
     * Write a function that returns the Zibonacci numbers between A and B (both inclusive) as a singly linked list. The
     * first three Zibonacci numbers are \\$Z_0$ = 0, $Z_1$ = 1, $Z_2$ = 1\\ and the general formula is
     * \\$Z_n = Z_{n-1} + Z_{n-3}$. Assume that A $\geq$ 2 and $B > A$.
     */
    public static LinkedList zibonacci(int A, int B){
        return null;
    }

}
