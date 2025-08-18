package List;

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

    public Stack(Stack s, int p, int q){
    }

    void addToStack(Stack s, int p, int q){
    }

    public boolean checkString(int[] s){
        return false;
    }

    Node pop(int k){
        return null;
    }

    LinkedList popBottomK(int k){
        return new LinkedList();
    }

    public void push(int k, int data){
    }

    void removeBottomK(int K){
    }

    public void removeOddIndexed(){
    }

}
