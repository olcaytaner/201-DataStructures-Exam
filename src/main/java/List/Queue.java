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

    Node dequeue(int k){
        return null;
    }

    public void removeAll(Queue[] list){
    }

    Queue(Queue[] list){
    }

    public void reverseQueue(){
    }

    Queue divideQueue(){
        return null;
    }

    Queue[] divideQueue(int k){
        return null;
    }

    public int maximum(){
        return 0;
    }

    public void thisMustChange(int[] indexOfNonbribers){
    }
}
