package List;

public class DoublyLinkedList extends LinkedList{

    public void insertLast(DoublyNode newNode) {
        if (head == null) {
            head = newNode;
        } else {
            tail.setNext(newNode);
        }
        newNode.setPrevious((DoublyNode) tail);
        tail = newNode;
    }

    public void insertArray(int[] data){
        for (int datum : data){
            insertLast(new DoublyNode(datum));
        }
    }

    public void deleteLast(){
        tail = ((DoublyNode)tail).getPrevious();
        if (tail != null){
            tail.setNext(null);
        } else {
            head = null;
        }
    }

    /**
     * Write the method which constructs an array of linked lists by dividing the original linked list into $k$ equal
     * parts. The first, second, ..., $k$’th element of the original linked list will be the first element of the first,
     * second, . . ., $k$’th output linked list, etc. The elements of the output linked list should be created (not
     * copied from the original linked list). You are not allowed to use any linked list methods.
     */
    public DoublyLinkedList[] divideList(int k){
        return null;
    }

    /**
     * Write a function which doubles each node in a doubly linked list, that is, after each node inserts that node
     * again.
     */
    public void doubleList() {
    }

    /**
     * Write a method for doubly linked lists, which returns a new doubly linked list with even indexed nodes (2, 4,
     * ..) from the original list. Your linked list should contain new nodes, not the same nodes in the original linked list. The first node has index 1. You are not allowed to use any  linked list methods, just attributes, constructors, getters and setters.
     */
    public DoublyLinkedList getEvenOnes(){
        return null;
    }

    /**
     * Write a method which returns true if the doubly linked list is palindrom. Implement the following algorithm:
     * <ul>
     *     <li>At the beginning of the algorithm, we have two pointers p1 and p2, which shows the beginning and the end
     *     of the list respectively.</li>
     *     <li>Compare the contents of the pointers, if they are different, return false, otherwise advance the pointers
     *     p1 to next, p2 to previous.</li>
     *     <li>The algorithm finishes either p1 = p2 or p1.next = p2, in which case the method returns true.</li>
     * </ul>
     * You are not allowed to use any doubly linked list methods. You are allowed to use attributes, constructors,
     * getters and setters.
     */
    public boolean isPalindrom(){
        return false;
    }

    /**
     * Write the method which removes the K'th element from the  end of the double linked list. If K = 1, last element
     * will be deleted. If K = N, first element will be deleted. First count the number of elements in the list, i.e. N,
     * then handle special cases K = 1, and K = N, then do the rest. You are not allowed to use any doubly linked list
     * methods. You are allowed to use attributes, constructors, getters and setters.
     */
    public void removeKthBeforeLast(int K){
    }

    /**
     * Write the method for reversing a doubly linked list. Your method should have a time complexity of ${\cal O}(N)$.
     * You are not allowed to use any extra data structures. You are not allowed to use any linked list methods, just
     * attributes, constructors, getters and setters.
     */
    public void reverse(){
    }

    /**
     * Write the following algorithm to sort the elements in the doubly linked list and return a new doubly linked list.
     * The algorithm is as follows:
     * <ul>
     *     <li>Find the largest number $N$ in the linked list.</li>
     *     <li>For each number $i$ between 1 and $N$:
     *     <ul>
     *         <li>Count the number of times linked list has $i$.</li>
     *         <li>Insert that many times $i$ to the new linked list.</li>
     *     </ul>
     *     </li>
     * </ul>
     * You are not allowed to use any linked list methods. You are allowed to use attributes, constructors, getters and
     * setters. Write the method in the DoublyLinkedList class.
     */
    public DoublyLinkedList sortElements(){
        return this;
    }

    /**
     * Write a method which returns True if doubly linked list is increasing
     * first and then decreasing after some item. This zig
     * zag pattern should appear exactly one time.
     * <ol>
     *     <li>You may assume all values are distinct.</li>
     *     <li>You may assume list has at least 3 values.</li>
     *     <li>You are not allowed to use any linked list methods, just attributes, constructors, getters and setters.</li>
     *     <li>You can not use extra data structures including arrays.</li>
     *     <li>Time complexity of the algorithm does not matter</li>
     * </ol>
     */
    public boolean isZigZag(){
        return false;
    }
}
