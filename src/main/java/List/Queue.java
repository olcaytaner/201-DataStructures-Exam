package List;

public class Queue {

    protected Node first;
    protected Node last;

    public Queue() {
        first = null;
        last = null;
    }

    public boolean isEmpty(){
        return first == null;
    }

    public void enqueue(Node newNode) {
        if (isEmpty()) {
            first = newNode;
        } else {
            last.setNext(newNode);
        }
        last = newNode;
    }

    public Node dequeue(){
        Node result = first;
        if (!isEmpty()){
            first = first.getNext();
            if (isEmpty()){
                last = null;
            }
        }
        return result;
    }

    public void insertArray(int[] data){
        for (int datum : data){
            enqueue(new Node(datum));
        }
    }

    public String toString(){
        if (isEmpty()){
            return "";
        }
        String s = "" + first.getData();
        Node tmp = first.getNext();
        while (tmp != null){
            s += " " + tmp.getData();
            tmp = tmp.getNext();
        }
        return s.trim();
    }

    /**
     * Write another constructor method which constructs a new list based queue by concatenating all elements in the list
     * of queues in order. The elements from queues should be recreated (not copied from the queues). You are not
     * allowed to use enqueue, dequeue, isEmpty functions.
     */
    public Queue(Queue[] list){
    }

    /**
     * Write a method which dequeues data as the $k$'th element from the first. dequeue(1) is equal to the original
     * dequeue, that is, the first element has index 1. You are not allowed to use any queue methods and any external
     * structures (arrays, queues, trees, etc). You are allowed to use attributes, constructors, getters and setters.
     */
    public Node dequeue(int k){
        return null;
    }

    /**
     * Write a function that creates and returns a new queue by removing even indexed elements from the original queue
     * and inserting into the newly created queue. The first node has index 1. You are not allowed to use any queue or
     * linked list methods, just attributes, constructors, getters and setters.
     */
    public Queue divideQueue(){
        return null;
    }

    /**
     * Write a method which constructs an array of list based queues by dividing the original queue into k equal parts.
     * The first, second, $\ldots$, $k$'th element of the original queue will be the first element of the first, second,
     * $\ldots$, $k$'th output queues, etc. The elements of the output queues should be recreated (not copied from the
     * original queue). You are not allowed to use enqueue, dequeue, isEmpty functions.
     */
    public Queue[] divideQueue(int k){
        return null;
    }

    /**
     * Write a method where the method returns the minimum number in a queue. Do not use any class or external methods
     * except isEmpty().
     */
    public int minimum(){
        return 0;
    }

    /**
     * Write a method that returns the maximum number in a queue.
     */
    public int maximum(){
        return 0;
    }

    /**
     * Write a method which removes all elements in the queues in the $list$ from the original queue. You are not
     * allowed to use enqueue, dequeue, isEmpty functions.
     */
    public void removeAll(Queue[] list){
    }

    /**
     * Write a method given a queue that is implemented as a linked list. The method should reverse the order of
     * elements in the queue without using the queue’s enqueue(), dequeue(), or peek() methods. You must directly
     * manipulate the underlying linked list of the queue to achieve the reversal.
     */
    public void reverseQueue(){
    }

    /**
     * Write a method which simulates how the queue goes in an hypothetical country, which we all aware of.
     * {\em indexOfNonbribers} is an increasing order sorted array showing the indexes of the people who have not bribed
     * the officer in the queue. The method will send these people to the end of the queue in their respective order.
     * The first element in the queue has the index 0.
     */
    public void thisMustChange(int[] indexOfNonbribers){
    }

    /**
     * Write a method that returns the second maximum number in a queue. Write the method for the
     * linked list implementation.
     */
    public int secondMaximum(){
        return 0;
    }
}
