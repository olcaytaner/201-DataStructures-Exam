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
}
