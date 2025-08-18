package Array;

public class Queue {

    private Element array[];

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

    public Queue(Queue[] list){
    }

    public void copyPaste(Queue src, int index){
    }

    void cutPaste(Queue dest, int p, int q){
    }

    Element dequeue(int k){
        return null;
    }

    Element dequeue2nd(){
        return null;
    }

    Queue divideQueue(){
        return null;
    }

    void insertAfterLargest (int data){
    }

    void removeOddIndexed(){
    }

    public void rotateQueue(int k){
    }

}
