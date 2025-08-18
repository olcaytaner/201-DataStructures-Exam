package Array;

public class Stack {
    private Element[] array;
    private int top;
    private int N;

    public Stack(int N){
        this.N = N;
        array = new Element[N];
        top = -1;
    }

    boolean isFull(){
        return top == N - 1;
    }

    boolean isEmpty(){
        return top == -1;
    }

    Element peek(){
        return array[top];
    }

    void push(Element element){
        if (!isFull()){
            top++;
            array[top] = element;
        }
    }

    Element pop(){
        if (!isEmpty()){
            top--;
            return array[top + 1];
        }
        return null;
    }

    public void push(int k, int data){
    }

    public void compress(){
    }

    public void insertAfterLargest(int newValue){
    }

    void removeEvenIndexed(){
    }

    public void copyPaste(Stack src, int index){
    }

    Element pop(int k){
        return null;
    }

    static boolean isBalanced(int[] a){
        return false;
    }

    public boolean checkString(int[] s){
        return false;
    }
}
