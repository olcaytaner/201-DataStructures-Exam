package Array;

public class Queue {

    private Element[] array;

    private int first;

    private int last;

    private int N;

    public Queue(int N){
        this.N = N;
        array = new Element[N];
        first = 0;
        last = 0;
    }

    boolean isFull(){
        return (last + 1) % N == first;
    }

    public boolean isEmpty(){
        return first == last;
    }

    public void enqueue(Element element){
        if (!isFull()){
            array[last] = element;
            last = (last + 1) % N;
        }
    }

    public Element dequeue(){
        if (!isEmpty()){
            Element tmp = array[first];
            first = (first + 1) % N;
            return tmp;
        }
        return null;
    }

    public String toString(){
        String s = "";
        for (int i = first; i <last; i = (i + 1) % N){
            s += array[i].getData() + " ";
        }
        return s.trim();
    }

    public void insertArray(int[] data){
        for (int datum : data){
            enqueue(new Element(datum));
        }
    }

    /**
     * Write another constructor method which constructs a new array based queue by adding the elements in the $list$
     * of queues one by one.  So, the first $k$ elements of the original queue will be constructed with the first
     * elements of the $k$ queues in the list; the second $k$ elements of the original queue will be constructed with
     * the second elements of the $k$ queues in the list etc. The elements from queues should be recreated (not copied
     * from the queues). You are not allowed to use enqueue, dequeue, isEmpty functions.
     */
    public Queue(Queue[] list){
    }

    /**
     * Write a method which copies all the elements of the src queue and inserts to the queue at position index. You are
     * not allowed to use enqueue, dequeue, isEmpty functions. You can assume the destination queue has enough space for
     * insertion. Your method should run in ${\cal O}(N)$ time. Hint: Start by counting the number of positions to shift
     * for opening up space for the elements of src.
     */
    public void copyPaste(Queue src, int index){
    }

    /**
     * Write a method which cuts all the elements between indexes p and q from the original queue and inserts at the end
     * to the dest queue. You are not allowed to use enqueue, dequeue, isEmpty functions. You can assume the destination
     * queue has enough space for insertion. Your method should run in ${\cal O}(N)$ time.
     */
    public void cutPaste(Queue dest, int p, int q){
    }

    /**
     * Write a method which dequeues data as the $k$'th element from the first. dequeue(1) is equal to the original
     * dequeue, that is, the first element has index 1. You are not allowed to use any queue methods and any external
     * structures (arrays, queues, trees, etc). You are allowed to use attributes, constructors, getters and setters.
     */
    public Element dequeue(int k){
        return null;
    }

    /**
     * Write a method which removes and returns the second item from the queue. Your methods should run in ${\cal O}$(1)
     * time. Do not use any class or external methods except isEmpty().
     */
    public Element dequeue2nd(){
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
     * Write a function that inserts a new element after the largest element of the queue. Write the function for array
     * implementation. You are not allowed to use any queue methods, just attributes, constructors, getters and setters.
     */
    public void insertAfterLargest (int data){
    }

    /**
     * Write the method which removes only the odd indexed (1, 3, . . .) elements from the queue. The first element has
     * index 1. You are only allowed to use enqueue, dequeue, isEmpty functions. {\bf You should use external queue}.
     * You are not allowed to use any queue attributes such as first, last, array etc.
     */
    public void removeOddIndexed(){
    }

    /**
     * Write a method where {$k$} is a non-negative integer representing the number of positions to rotate the queue by,
     * which is implemented using an array. After the rotation, the first element of the queue should move to the back
     * {$k$} times, and the order of the other elements should shift accordingly. You are not allowed to use the
     * enqueue(), dequeue(), or peek() methods. The solution should rotate the array in {$O(N)$} time, where {$N$} is
     * the number of elements in the queue. Assume that $k \leq N$.
     */
    public void rotateQueue(int k){
    }

    /**
     * Write another constructor-like method in Array-based Queue implementation which constructs a new array based queue
     * by adding the elements in the
     * $list$ of queues one by one in zig-zag fashion. So, the first $k$ elements of the original queue will be
     * constructed with the first elements of the $k$ queues in the list; the
     * second $k$ elements of the original queue will be constructed with the
     * last elements of the $k$ queues in the list, third $k$ elements of the original queue will be
     * constructed with the second elements of the $k$ queues in the list; etc. The elements from
     * queues should be recreated (not copied from the queues). You are not
     * allowed to use enqueue, dequeue, isEmpty functions. You should solve
     * the question for array implementation. You may assume the length of
     * each queue is same and even.
     */
    public static Queue QueueZigZag(Queue[] list){
        return null;
    }

}
