package Array;

import List.Node;

public class Stack {
    private Element[] array;
    private int top;
    private int N;

    public Stack(int N){
        this.N = N;
        array = new Element[N];
        top = -1;
    }

    public boolean isFull(){
        return top == N - 1;
    }

    public boolean isEmpty(){
        return top == -1;
    }

    public Element peek(){
        return array[top];
    }

    public void push(Element element){
        if (!isFull()){
            top++;
            array[top] = element;
        }
    }

    public Element pop(){
        if (!isEmpty()){
            top--;
            return array[top + 1];
        }
        return null;
    }

    public void insertArray(int[] data){
        for (int datum : data){
            push(new Element(datum));
        }
    }

    public String toString(){
        String s = "";
        for (int i = 0; i < top; i++){
            s += array[i].getData() + " ";
        }
        if (top != -1){
            s += array[top].getData();
        }
        return s.trim();
    }

    /**
     * Write a method which checks if the array s is of the form $1^m2^m$ without counting
     * any characters and using an external array based stack.
     * <ul>
     *     <li>You can assume the array consists of only numbers between 1 and 2 and there is at least one from each of them. </li>
     *     <li>You are only allowed to use pop, push, isEmpty functions. </li>
     *     <li>You should use one single external stack. </li>
     *     <li>You can not modify {\bf s}.</li>
     *     <li>Beware, you should return false for the strings 21, 1212, or 112212.</li>
     * </ul>
     */
    public boolean checkString(int[] s){
        return false;
    }

    /**
     * Write a method that compresses the stack by removing the duplicate items. Assume that the elements in the stack
     * are sorted. You are only allowed to use pop, push, isEmpty functions.  (Hint: Use external stack).
     */
    public void compress(){
    }

    /**
     * Write a method which copies all the elements of the src stack and inserts to the stack at position index. The
     * bottom element in the stack has index 0 as usual. You are not allowed to use pop, push, isEmpty functions. You
     * can assume the destination stack has enough space for insertion. Your method should run in ${\cal O}(N)$ time.
     */
    public void copyPaste(Stack src, int index){
    }

    /**
     * Write a function that inserts a new integer after the largest element of the stack. You are not allowed to use
     * any stack methods, just attributes, constructors, getters and setters.
     */
    public void insertAfterLargest(int newValue){
    }

    /**
     * Write a static method using an external stack (only one external stack is allowed) that determines if an integer
     * array is balanced or not. A number $k$ less than 10 is balanced with the number $10 + k$. For example, the array
     * 2, 3, 13, 12, 4, 14 is balanced, whereas 5, 15, 4, 3, 14, 13 not. You are not allowed to use any stack attributes
     * such as N, top, array etc.
     */
    public static boolean isBalanced(int[] a){
        return false;
    }

    /**
     * Write a method which pops the $k$'th element from the top and returns it. pop(1) is equal to the original pop,
     * that is, the first element at the top has index 1. You are not allowed to use any stack methods and any external
     * stacks, just attributes, constructors, getters and setters.
     */
    public Element pop(int k){
        return null;
    }

    /**
     * Write the method which pushes data as the $k$'th element from the top. push(1, data) is equal to the original
     * push, that is, the first element at the top has index 1. You are not allowed to use any stack methods and any
     * external stacks. You are allowed to use attributes, constructors, getters and setters.
     */
    public void push(int k, int data){
    }

    /**
     * Write a method which removes only the even indexed (2, 4, . . .) elements from the stack. The first element at
     * the bottom has index 1. You are only allowed to use pop, push, isEmpty functions (Hint: Use external stack). You
     * are not allowed to use any stack attributes such as N, top, array etc.
     */
    public void removeEvenIndexed(){
    }

    /**
     * Write a method which removes all items between maximum and
     * minimum element, keeping these minimum and
     * maximum elements. Notice that minimum does not always need to
     * show up before maximum, it can be
     * other way around as well.
     * <ol>
     *     <li>You may assume there are at least 3 items in the stack.</li>
     *     <li>You may assume all elements are distinct.</li>
     *     <li>You are not allowed to use any stack methods, just attributes, constructors, getters and setters.</li>
     *     <li>You can not use extra data structures including arrays.</li>
     *     <li>Time complexity of the algorithm does not matter.</li>
     * </ol>
     */
    public void removeBetweenMinMax(){
    }

}
