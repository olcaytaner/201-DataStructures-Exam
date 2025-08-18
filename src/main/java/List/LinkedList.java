package List;

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

    public void insertFirst(Node newNode) {
        if (isEmpty()) {
            tail = newNode;
        }
        newNode.setNext(head);
        head = newNode;
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

    void addAfterEachNode(Node newNode){

    }

    boolean containsOnlyDuplicates(){
        return false;
    }

    public boolean containsOnlyTriplicates(){
        return false;
    }

    public boolean evenOddSorted(){
        return false;
    }

    LinkedList getIndexed(LinkedList list){
        return null;
    }

    LinkedList intersec(LinkedList list1, LinkedList list2){
        return null;
    }

    public boolean isIncreasingOfSizeK(int k){
        return false;
    }

    public void printFibonacciWay(int N){
    }

    void removeKth(int K){

    }

    public LinkedList zibonacci(int A, int B){
        return null;
    }

}
