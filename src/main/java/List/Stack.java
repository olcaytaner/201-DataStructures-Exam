package List;

import Array.Element;

public class Stack {
    private Node top;

    public Stack(){
        top = null;
    }

    public boolean isEmpty(){
        return top == null;
    }

    public Node peek(){
        return top;
    }

    public void push(Node node){
        node.setNext(top);
        top = node;
    }

    public Node pop(){
        Node topNode = top;
        top = top.next;
        return topNode;
    }

    public void insertArray(int[] data){
        for (int datum : data){
            push(new Node(datum));
        }
    }

    public String toString(){
        if (isEmpty()){
            return "";
        }
        String s = "" + top.getData();
        Node tmp = top.getNext();
        while (tmp != null){
            s = tmp.getData() + " " + s;
            tmp = tmp.getNext();
        }
        return s.trim();
    }

    /**
     * Write a new stack constructor which constructs a new stack by copying elements from stack $s$ indexed between $p$
     * and $q$ (both inclusive).
     * <ul>
     *     <li>Assume that $q \geq p$. </li>
     *     <li>The elements of the constructed stack should be new, not the elements of {\bf s}. </li>
     *     <li>The first element at the top of the stack {\bf s} has index 0. </li>
     *     <li>You are not allowed to use any stack methods and any external stacks. </li>
     *     <li>You are allowed to use attributes, constructors, getters and setters.</li>
     *     <li>You can not modify {\bf s}.</li>
     * </ul>
     */
    public Stack(Stack s, int p, int q){
    }

    /**
     * Write the method which adds all elements indexed from p to q of the stack s to the top of the original stack.
     * Your stack should contain new nodes, not the nodes in the stack s. The element at the top of the stack has index
     * 1. You are not allowed to use any stack methods and any external stacks. You are allowed to use attributes,
     * constructors, getters and setters.
     */
    public void addToStack(Stack s, int p, int q){
    }

    /**
     * Write the method which checks if the array $s$ is of the form $1^m2^n3^n4^m$ without counting any characters and
     * using an external list based stack. You can assume the array consists of only numbers between 1 and 4, they are
     * in that order, and there is at least one from each of them. You are only allowed to use pop, push, isEmpty
     * functions. You should use a single external stack.
     */
    public boolean checkString(int[] s){
        return false;
    }

    /**
     * Write a method which pops the $k$'th element from the top and returns it. pop(1) is equal to the original pop,
     * that is, the first element at the top has index 1. You are not allowed to use any stack methods and any external
     * stacks, just attributes, constructors, getters and setters.
     */
    public Node pop(int k){
        return null;
    }

    /**
     * Write the method which pops $k$ elements from the bottom and return them as a singly linked list. You are not
     * allowed to use any stack methods and any external stacks. You are allowed to use attributes, constructors,
     * getters and setters.
     */
    public LinkedList popBottomK(int k){
        return new LinkedList();
    }

    /**
     * Write the method which pushes data as the $k$'th element from the top. push(1, data) is equal to the original
     * push, that is, the first element at the top has index 1. You are not allowed to use any stack methods and any
     * external stacks. You are allowed to use attributes, constructors, getters and setters.
     */
    public void push(int k, int data){
    }

    /**
     * Write a function which removes only the $K$ bottom elements of the stack. You are only allowed to use pop, push,
     * isEmpty functions. You can use an external stack.
     */
    public void removeBottomK(int K){
    }

    /**
     * Write a method which removes only the odd indexed (1, 3, $\ldots$) elements from the stack. The first element at
     * the bottom has index 1. You are only allowed to use pop, push, isEmpty functions (Hint: Use external stack). You
     * are not allowed to use any stack attributes such as $N$, $top$, $array$ etc.
     */
    public void removeOddIndexed(){
    }

    /**
     * Write a method where k is a positive integer representing the number
     * of positions to rotate the stack by. After the rotation,
     * the first element of the stack should move to the
     * back k times and the order of the other elements
     * should shift accordingly.
     * <ol>
     *     <li>You are not allowed to use the pop, push, or top methods.</li>
     *     <li>You may assume stack has at least 2 items.</li>
     *     <li>The solution should rotate the array in O(N) time, where N is the number of elements in the queue.</li>
     *     <li>Assume that k < N</li>
     *     <li>You can not use extra data structures including arrays.</li>
     * </ol>
     */
    public void rotateStack(int k){
    }
}
